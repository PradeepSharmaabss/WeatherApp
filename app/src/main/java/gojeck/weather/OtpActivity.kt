package gojeck.weather

import android.content.Intent
import android.graphics.Bitmap
import android.os.AsyncTask
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.swagger.client.api.AccountApi
import kotlinx.android.synthetic.main.otp_activity.*


class OtpActivity : AppCompatActivity() {
    var OTP_URL = "http://saloon.deseco.in/token"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.otp_activity)
        buttonContinue.setOnClickListener {
            callOtpApi()

        }
    }

    private fun callOtpApi() {
        object : AsyncTask<Void?, Void?, String?>() {
            override fun onPostExecute(result: String?) {
                var intent = Intent(this@OtpActivity, VerifyOtpActivity::class.java)
                startActivity(intent)
            }

            override fun doInBackground(vararg params: Void?): String? {
                var accountApi = AccountApi().accountLogin(editTextMobile.text.toString(), null)
                return null
            }
        }.execute().get()
    }
}