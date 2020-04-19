package gojeck.weather

import android.Manifest.permission
import android.annotation.SuppressLint
import android.arch.lifecycle.Observer
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.util.Log
import app.elektron.com.common.permission.location.CurrentLocationListener
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
import gojeck.weather.model.ResponseModel
import gojeck.weather.permission.location.LocationSettings
import gojeck.weather.utils.RequestCall
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), RequestCall.ClientResponse {
    var responseModel: ResponseModel? = null
    private var mLocationSettingDisposable: Disposable? = null
    var mLocationSetting: LocationSettings? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setToolbar()
        replaceFragment(SaloonFragment.newInstance())
        checkPermission()
    }

    private fun setToolbar() {
        setSupportActionBar(toolbar)
        toolbar.setTitle("Saloon")
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));
    }

    public fun checkPermission() {
        TedPermission(this)
            .setPermissions(permission.ACCESS_FINE_LOCATION)
            .setGotoSettingButton(true)
            .setPermissionListener(object : PermissionListener {
                override fun onPermissionGranted() {
                    initLocationSettingObserver()
                }

                override fun onPermissionDenied(deniedPermissions: ArrayList<String?>?) {

                }
            }).check()
    }

    private fun getResponse(param: Any?, longitude: Double, query: String) {
    }

    override fun onFailed() {
        replaceFragment(ErrorScreenFragment.newInstance())
    }

    override fun onSuccus(body: ResponseModel) {
        responseModel = body
        replaceFragment(SaloonFragment.newInstance())
    }

    fun getData(): ResponseModel {
        return this!!.responseModel!!
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.container, fragment).commit()
    }

    @SuppressLint("MissingPermission")
    private fun initLocationSettingObserver() {
        if (mLocationSettingDisposable != null && !mLocationSettingDisposable!!.isDisposed) {
            mLocationSetting!!.getLocationOnObserver()
            return
        }
        mLocationSetting = LocationSettings(this)
        mLocationSettingDisposable = mLocationSetting?.run {
            getObserver().observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io())
                .subscribe {
                    CurrentLocationListener.getInstance(this@MainActivity)
                        .observe(this@MainActivity, Observer {
                            it?.run {
                                CurrentLocationListener.getInstance(this@MainActivity)
                                    .removeObservers(this@MainActivity)
                                getResponse(this.latitude, this.longitude, "")
                                Log.e("lat, long", "" + this.latitude + this.longitude)
                            }
                        })
                }
        }
    }

    override fun onBackPressed() {
        finish()
    }
}
