package app.elektron.com.common.permission.location

import android.annotation.SuppressLint
import android.arch.lifecycle.LiveData
import android.content.Context
import android.location.Location
import android.os.Looper
import android.util.Log
import com.google.android.gms.location.*

@SuppressLint("ALL")
class CurrentLocationListener private constructor(var appContext: Context) : LiveData<Location>() {
    private var mFusedLocationClient: FusedLocationProviderClient? = null
    private var mLocationRequest: LocationRequest? = null

    internal var mLocationCallback: LocationCallback? = object : LocationCallback() {
        override fun onLocationResult(locationResult: LocationResult) {
            for (location in locationResult.locations) {
                if (location != null) {
                    value = location
                    Log.e("currentlocation", "${location.latitude} - ${location.longitude}")
                }
            }
        }

        override fun onLocationAvailability(p0: LocationAvailability?) {
            super.onLocationAvailability(p0)
            Log.e("availability", "${p0?.isLocationAvailable}")
        }
    }

    init {
        initClient(appContext)
    }

    private fun initClient(appContext: Context) {
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(appContext)
        mFusedLocationClient?.lastLocation?.addOnSuccessListener { location ->
            if (location != null)
                value = location
        }
        createLocationRequest()
    }

    private fun createLocationRequest() {
        mLocationRequest = LocationRequest()
        mLocationRequest!!.interval = 100000
        mLocationRequest!!.fastestInterval = 10000
        mLocationRequest!!.priority = LocationRequest.PRIORITY_HIGH_ACCURACY
    }

    override fun onActive() {
        super.onActive()
        mFusedLocationClient?.flushLocations()
        mFusedLocationClient?.requestLocationUpdates(mLocationRequest, mLocationCallback!!, Looper.myLooper())
    }

    override fun onInactive() {
        super.onInactive()
        mFusedLocationClient?.removeLocationUpdates(mLocationCallback!!)
    }

    companion object {

        private var instance: CurrentLocationListener? = null

        fun getInstance(appContext: Context) = instance?.apply { initClient(appContext) }
                ?: synchronized(this) { CurrentLocationListener(appContext).also { instance = it; instance!!.initClient(appContext) } }
    }
}

