package br.com.arthurjf.cursoandroid.applistavip.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Menu
import br.com.arthurjf.cursoandroid.applistavip.R

class SplashActivity : AppCompatActivity() {
    private val TIME_OUT_SPLASH: Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            val mainIntent = Intent(this, MainActivity::class.java)
            startActivity(mainIntent)
            finish()
        }, TIME_OUT_SPLASH)
    }
}