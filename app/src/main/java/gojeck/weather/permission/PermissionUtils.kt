package app.elektron.com.common.permission

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.provider.Settings
import android.support.v4.app.ActivityCompat
import android.view.LayoutInflater
import android.widget.TextView
import gojeck.weather.R

class PermissionUtils {

    var permissionList = mutableListOf<String>().apply {
        add(Manifest.permission.ACCESS_COARSE_LOCATION)
        add(Manifest.permission.ACCESS_FINE_LOCATION)
        add(Manifest.permission.CAMERA)
        add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
        add(Manifest.permission.READ_EXTERNAL_STORAGE)
    }

    private var mContext: Context? = null
    private var mListner: PermissionCallback? = null
    private val RC_RUNTIME_PERMISSION: Int = 12345

    fun validatePermission(permissions: MutableList<String> = permissionList) {
        permissionList = permissions
        if (!isAllPermissionAvailable()) {
            mListner?.needPermission()
        } else
            mListner?.onValidPermission()
    }

    fun isAllPermissionAvailable(mpermission: MutableList<String> = permissionList): Boolean {
        var isAllowed = true
        val permission = if (mpermission.isEmpty()) permissionList else mpermission
        for (item in permission) {
            isAllowed = ActivityCompat.checkSelfPermission(mContext!!, item) == PackageManager.PERMISSION_GRANTED
            if (!isAllowed)
                break
        }

        return isAllowed
    }

    fun askPermission(mPermissionList: MutableList<String> = permissionList) {
        this.permissionList = mPermissionList
        if (mContext is Activity)
            ActivityCompat.requestPermissions(
                (mContext as Activity),
                permissionList.toTypedArray(),
                RC_RUNTIME_PERMISSION
            )
    }

    private var runtimePermissionDenied: Boolean = false

    fun onPermissionRequestResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        when (requestCode) {
            RC_RUNTIME_PERMISSION -> {
                if (!isAllPermissionAvailable()) {
                    if (mContext is Activity)
                        for (name in permissions) {
                            runtimePermissionDenied =
                                ActivityCompat.shouldShowRequestPermissionRationale(mContext as Activity, name)
                            if (!runtimePermissionDenied)
                                break
                        }
                    if (!runtimePermissionDenied) {
                        mListner?.onDeniedPermission()
                        showDenyPopUp()
                    }
                } else
                    mListner?.onValidPermission()
            }
        }
    }

    private var mAlert: AlertDialog? = null

    private fun showDenyPopUp() {
        mAlert?.takeIf { it.isShowing }?.apply { return }
        mAlert = getDialog()
        mAlert!!.show()
    }

    private fun getDialog(): AlertDialog {
        val builder = AlertDialog.Builder(mContext)
        val view = LayoutInflater.from(mContext).inflate(R.layout.alert_message, null)
        view.findViewById<TextView>(R.id.tvTitle).text = mContext!!.getString(R.string.label_permission)
        view.findViewById<TextView>(R.id.tvMsg).text = mContext!!.getString(R.string.msg_permision_all)
        builder.setView(view)
        builder.setPositiveButton(mContext!!.getString(R.string.label_turn_on)) { dialog, _ ->
            run {
                dialog.dismiss()
                if (!runtimePermissionDenied)
                    openLocationSetting()
                else
                    askPermission()
            }
        }
            .setCancelable(true)

        return builder.create()
    }

    private fun openLocationSetting() {
        val intent = Intent(
            Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
            Uri.fromParts("package", mContext!!.packageName, null)
        )
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        mContext!!.startActivity(intent)
    }

    fun with(mcontext: Context? = null): PermissionUtils {
        this.mContext = mcontext
        return this
    }

    fun addListner(mListner: PermissionCallback? = null): PermissionUtils {
        this.mListner = mListner
        return this
    }

    companion object {
        @SuppressLint("StaticFieldLeak")
        private var INSTANCE: PermissionUtils? = null

        fun get(): PermissionUtils {
            return INSTANCE ?: synchronized(PermissionUtils::class) {
                PermissionUtils().apply { INSTANCE = this }
            }
        }
    }

}

interface PermissionCallback {
    fun onValidPermission()
    fun onDeniedPermission()
    fun needPermission()
}