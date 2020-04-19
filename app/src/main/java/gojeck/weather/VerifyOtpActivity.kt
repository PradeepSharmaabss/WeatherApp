package gojeck.weather


import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.google.gson.Gson
import gojeck.weather.utils.DataProcessor
import gojeck.weather.utils.Utills
import io.swagger.client.api.AccountApi
import kotlinx.android.synthetic.main.activity_verify_otp.*


class VerifyOtpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_otp)
        buttonSignIn.setOnClickListener {
            if (editTextCode.text.toString().length >= 4) {
                progressbar.visibility = View.VISIBLE
                MyTask().execute()
            }
        }
    }

    private fun startTask() {
        var intent = Intent(this@VerifyOtpActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    inner class MyTask : AsyncTask<String?, String?, String?>() {
        override fun doInBackground(vararg params: String?): String? {
            var accountApi = AccountApi();
            var response = accountApi.accountLogin(MOBILE_NUMBER, editTextCode.text.toString())
            var dataProcessor = DataProcessor(this@VerifyOtpActivity)
            dataProcessor.setStr(DataProcessor.LOGIN_DATA, Gson().toJson(response))
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

    companion object {
        var MOBILE_NUMBER = ""
    }
}