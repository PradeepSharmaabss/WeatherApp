package gojeck.weather.utils

import android.R.style
import android.app.Dialog
import android.content.Context
import android.location.Address
import android.location.Geocoder
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.view.Gravity
import android.view.View
import android.view.Window
import android.view.WindowManager.LayoutParams
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.Toast
import gojeck.weather.R
import java.util.*


object Utills {
    var dialog: Dialog? = null
    fun showDialog(context: Context?) {
        dialog = Dialog(context, style.Theme_Translucent_NoTitleBar)
        dialog!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog!!.setContentView(R.layout.loader_screen_dialog)
        val window: Window = dialog!!.window
        val wlp: LayoutParams = window.attributes
        wlp.gravity = Gravity.CENTER
        wlp.flags = LayoutParams.FLAG_BLUR_BEHIND
        window.attributes = wlp
        dialog!!.window.setLayout(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        dialog!!.setCancelable(false)
        val rotate = RotateAnimation(0F, 360F, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f)
        rotate.duration = 900
        rotate.repeatCount = Animation.INFINITE
        dialog!!.findViewById<View>(R.id.loader_image).startAnimation(rotate)
        dialog!!.show()
    }

    fun dismissDialog(context: Context?) {
        if (dialog != null) dialog!!.dismiss()
    }

    fun isNetworkAvailable(ctx:Context): Boolean {
        val connectivityManager =
            ctx.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetworkInfo: NetworkInfo? = connectivityManager.activeNetworkInfo
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected) {
            return true
        } else {
            Toast.makeText(ctx, "Internet Connection Is Required", Toast.LENGTH_LONG)
                .show()
            return false
        }
    }

    fun getAreaName(ctx:Context, lat:Double,lon:Double):String{
        var areaName=""
        try {
            val geo = Geocoder(ctx, Locale.getDefault())
            val addresses: List<Address> = geo.getFromLocation(lat, lon, 1)
            if (addresses.isEmpty()) {
            } else {
                if (addresses.size > 0) {
                    areaName =addresses[0].getLocality().toString()
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return areaName
    }
}