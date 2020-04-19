package gojeck.weather

import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import gojeck.weather.models.LoginData
import gojeck.weather.utils.DataProcessor
import io.swagger.client.api.AccountApi
import kotlinx.android.synthetic.main.otp_activity.*


class OtpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.otp_activity)
        var loginData = Gson().fromJson(DataProcessor(this).getStr(DataProcessor.LOGIN_DATA),LoginData::class.java)
        if (loginData!= null && loginData.ok!= null && loginData.ok.toInt() == 200) {
            var intent = Intent(this@OtpActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        buttonContinue.setOnClickListener {
            if (editTextMobile.text.toString().length >= 10) {
                progressbar.visibility = View.VISIBLE
                MyTask().execute()
            }
        }
    }

    inner class MyTask : AsyncTask<String?, String?, String?>() {
        override fun doInBackground(vararg params: String?): String? {
            var accountApi = AccountApi()
            var response = accountApi.accountLogin(editTextMobile.text.toString(), null)
            return ""
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            progressbar.visibility = View.GONE
            startTask()
        }

        override fun onPreExecute() {
            super.onPreExecute()
        }
    }

    private fun startTask() {
        var intent = Intent(this@OtpActivity, VerifyOtpActivity::class.java)
        VerifyOtpActivity.MOBILE_NUMBER = editTextMobile.text.toString()
        startActivity(intent)
    }
}