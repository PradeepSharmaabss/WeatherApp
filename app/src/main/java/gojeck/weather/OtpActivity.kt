package gojeck.weather

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import gojeck.weather.utils.Utills
import kotlinx.android.synthetic.main.otp_activity.*
import okhttp3.*
import java.io.IOException


class OtpActivity : AppCompatActivity() {
    var  OTP_URL= "http://saloon.deseco.in/token"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.otp_activity)
        buttonContinue.setOnClickListener {
            callOtpApi()
//            var intent = Intent(this, VerifyOtpActivity::class.java)
//            startActivity(intent)
        }
    }

    private fun callOtpApi() {
        Utills.showDialog(this)
        val client = OkHttpClient()
        val formBody: RequestBody? = FormBody.Builder()
            .add( "grant_type","password&username")
            .add( "username","9891511158")
            .build()
        val request: Request? = Request.Builder()
            .url(OTP_URL)
            .post(formBody)
            .build()
        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call?, e: IOException?) {
                Utills.dismissDialog(this@OtpActivity)
            }

            @Throws(IOException::class)
            override fun onResponse(call: Call?, response: Response) {
                Log.e("response", response.toString())
                if (!response.isSuccessful) {
                }
                Utills.dismissDialog(this@OtpActivity)
            }
        })
    }
}