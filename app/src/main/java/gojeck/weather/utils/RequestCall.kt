package gojeck.weather.utils

import android.content.Context
import com.google.gson.Gson
import gojeck.weather.model.ResponseModel
import okhttp3.*
import okhttp3.Request.Builder
import java.io.IOException

class RequestCall(internal var context: Context, internal var url: String) {
    internal var clientResponse: ClientResponse

    private fun call() {
        Utills.showDialog(context)
        val client = OkHttpClient()
        val request: Request? = Builder().url(url).build()
        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call?, e: IOException?) {
                clientResponse.onFailed()
                Utills.dismissDialog(context)
            }

            @Throws(IOException::class)
            override fun onResponse(call: Call?, response: Response) {
                if (!response.isSuccessful) {
                    clientResponse.onFailed()
                } else {
                    val gson = Gson()
                    val responseData: ResponseModel = gson.fromJson(response.body().string(), ResponseModel::class.java)
                    clientResponse.onSuccus(responseData)
                }
                Utills.dismissDialog(context)
            }
        })
    }

    interface ClientResponse {
        fun onSuccus(body: ResponseModel)
        fun onFailed()
    }

    init {
        clientResponse = context as ClientResponse
        call()
    }
}