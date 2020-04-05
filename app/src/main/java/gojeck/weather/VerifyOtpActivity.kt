package gojeck.weather


import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mukesh.OtpView
import kotlinx.android.synthetic.main.activity_verify_otp.*
import kotlinx.android.synthetic.main.otp_activity.*


class VerifyOtpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_otp)
        buttonSignIn.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}