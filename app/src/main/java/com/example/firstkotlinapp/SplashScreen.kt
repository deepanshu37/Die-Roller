package com.example.firstkotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        /*The handler thread to freeze the splash screen for 2 seconds*/
        Handler(Looper.getMainLooper()).postDelayed({
        startActivity(Intent(this,MainActivity::class.java)) /*An explicit intent (knows where will it take) is created*/
            finish()
        },2000)
    }
}