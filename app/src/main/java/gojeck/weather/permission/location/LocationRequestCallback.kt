package com.myanmar.datacollection.util.callback

import android.content.Intent

interface LocationRequestCallback {
    fun onPermissionRequestResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray)

    fun onPermissionActivityResult(requestCode: Int, resultCode: Int, data: Intent?)
}