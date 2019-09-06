package gojeck.weather.permission.location

import android.Manifest
import android.app.Activity.RESULT_CANCELED
import android.app.Activity.RESULT_OK
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.content.IntentSender
import android.content.pm.PackageManager
import android.location.Criteria
import android.location.LocationManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.support.v4.app.ActivityCompat
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.GoogleApiAvailability
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.GoogleApiClient
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.*
import com.myanmar.datacollection.util.callback.LocationRequestCallback
import io.reactivex.Observable
import io.reactivex.ObservableEmitter

class LocationSettings(val mActivity: AppCompatActivity) : GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, LocationRequestCallback {

    private val RC_PLAY_SERVICES_RESOLUTION: Int = 9000

    private val RC_LOCATION_CHECK_SETTINGS: Int = 405

    private val RC_LOCATION_RUNTIME_PERMISSION: Int = 501

    private var mGoogleApiClient: GoogleApiClient? = null

    private var settingsClient: SettingsClient? = null

    private var isShownErroDialog: Boolean = false

    private var runtimePermissionDenied: Boolean = false

    private var isAskLocationCancled: Boolean = false

    private var emitter: ObservableEmitter<Boolean>? = null

    var mAlert: AlertDialog? = null

    init {
        mGoogleApiClient = GoogleApiClient.Builder(mActivity).addApi(LocationServices.API)
                .addConnectionCallbacks(this@LocationSettings).addOnConnectionFailedListener(this@LocationSettings).build()
        settingsClient = LocationServices.getSettingsClient(mActivity)
    }

    override fun onConnectionFailed(connectionResult: ConnectionResult) {
        if (connectionResult.errorCode == 2) {
            if (!isShownErroDialog) {
                isShownErroDialog = true
                GoogleApiAvailability.getInstance().getErrorDialog(mActivity, 502, RC_PLAY_SERVICES_RESOLUTION).show()
            }
            return
        }
    }

    override fun onConnected(bundle: Bundle?) {
    }

    override fun onConnectionSuspended(connectionResult: Int) {
        if (!mGoogleApiClient!!.isConnected)
            mGoogleApiClient!!.reconnect()

    }

    override fun onPermissionRequestResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        when (requestCode) {
            RC_LOCATION_RUNTIME_PERMISSION -> {
                if (grantResults.size > 1 && (grantResults[0] == PackageManager.PERMISSION_GRANTED || grantResults[1] == PackageManager.PERMISSION_GRANTED)) {
                    requestCurrentLocation()
                } else if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    requestCurrentLocation()
                }

                if (permissions.size > 1 && !isValidAppPermission(mActivity)) {
                    runtimePermissionDenied = ActivityCompat.shouldShowRequestPermissionRationale(mActivity, permissions[1])
                    if (!runtimePermissionDenied)
                        showDenyPopUp()
                }
            }
        }
    }

    private fun showDenyPopUp() {
        mAlert?.takeIf { it.isShowing }?.apply { return }
        mAlert = getDialog()
        mAlert!!.show()
    }

    private fun getDialog(): AlertDialog {
        val builder = AlertDialog.Builder(mActivity)
                .setTitle("Location Needed")
                .setMessage("Location is Needed for the operation to complete")
                .setPositiveButton("Turn On") { dialog, _ ->
                    run {
                        dialog.dismiss()
                        if (!runtimePermissionDenied)
                            openLocationSetting()
                        else
                            requestLocationUpdates()
                    }
                }
                .setCancelable(false)

        return builder.create()
    }

    private fun openLocationSetting() {
        val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
                Uri.fromParts("package", mActivity.packageName, null))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        mActivity.startActivity(intent)
    }

    override fun onPermissionActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        when (requestCode) {
            RC_LOCATION_CHECK_SETTINGS -> when (resultCode) {
                RESULT_OK -> {
                    isAskLocationCancled = false
                    requestLocationUpdates()
                }
                RESULT_CANCELED -> isAskLocationCancled = true
            }
        }
    }

    companion object {

        fun isLocationEnabled(context: Context): Boolean {
            val locationMode: Int
            val locationProviders: String

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                try {
                    locationMode = Settings.Secure.getInt(context.contentResolver, Settings.Secure.LOCATION_MODE)
                } catch (e: Settings.SettingNotFoundException) {
                    e.printStackTrace()
                    return false
                }

                return locationMode != Settings.Secure.LOCATION_MODE_OFF

            } else {
                locationProviders = Settings.Secure.getString(context.contentResolver, Settings.Secure.LOCATION_PROVIDERS_ALLOWED)
                return !TextUtils.isEmpty(locationProviders)
            }
        }

        fun isValidAppPermission(mContext: Context): Boolean {
            return ActivityCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED || ActivityCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED
        }

    }

    private fun requestLocationUpdates() {
        if (!isValidAppPermission(mActivity)) {
            if (!validateAlertShowing())
                ActivityCompat.requestPermissions(mActivity, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION), RC_LOCATION_RUNTIME_PERMISSION)
            emitter!!.onNext(false)
            return
        }

        emitter!!.onNext(true)
    }

    private fun validateAlertShowing(): Boolean {
        return mAlert?.takeIf { it.isShowing }?.run { return true } ?: false
    }

    private fun requestCurrentLocation() {
        if (isLocationEnabled(mActivity)) {
            requestLocationUpdates()
        } else {
            settingsClient!!.checkLocationSettings(LocationSettingsRequest.Builder().addLocationRequest(initLocationRequest()).build()).addOnCompleteListener { task ->
                try {
                    val response = task.getResult(ApiException::class.java)
                    if (response?.locationSettingsStates!!.isLocationUsable) {
                        requestLocationUpdates()
                    }
                } catch (exception: ApiException) {
                    exception.printStackTrace()
                    when (exception.statusCode) {
                        LocationSettingsStatusCodes.RESOLUTION_REQUIRED -> try {
                            val resolvable = exception as ResolvableApiException
                            resolvable.startResolutionForResult(
                                    mActivity,
                                    RC_LOCATION_CHECK_SETTINGS)
                        } catch (e: IntentSender.SendIntentException) {
                        } catch (e: ClassCastException) {
                        }
                        LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE -> {
                        }
                    }
                }
            }
        }
    }

    private fun initLocationRequest(): LocationRequest {
        val locationRequest = LocationRequest.create()
        locationRequest.interval = 6000000
        locationRequest.fastestInterval = 60000000
        locationRequest.priority = LocationRequest.PRIORITY_HIGH_ACCURACY
        return locationRequest
    }

    fun getLocationOnObserver(): Boolean {
        if (emitter != null)
            requestCurrentLocation()
        else
            return false

        return true
    }

    fun getObserver(): Observable<Boolean> {
        return Observable.create { emitter ->
            this.emitter = emitter
            requestCurrentLocation()
        }
    }

    private fun freeResource() {
        emitter = null
    }

    private fun getProviderName(mLocationService: LocationManager): String {
        val criteria = Criteria()
        criteria.powerRequirement = Criteria.POWER_LOW
        criteria.accuracy = Criteria.ACCURACY_FINE
        criteria.isSpeedRequired = true
        criteria.isAltitudeRequired = false
        criteria.isBearingRequired = false
        criteria.isCostAllowed = false
        return mLocationService.getBestProvider(criteria, true)
    }

}
