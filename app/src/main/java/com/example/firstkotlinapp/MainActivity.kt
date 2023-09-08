package com.example.firstkotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Declaring the button and setting the onClickListener*/
        val btn = findViewById<Button>(R.id.shortToastBtn)
        btn.setOnClickListener{
            Toast.makeText(this,"The button for short toast is clicked",Toast.LENGTH_SHORT).show()
        }

        val btnLT = findViewById<Button>(R.id.longToastBtn)
        btnLT.setOnClickListener{
            Toast.makeText(this,"The button for long toast is clicked",Toast.LENGTH_LONG).show()
        }

        val btnSA = findViewById<Button>(R.id.seeAni)
        btnSA.setOnClickListener{
            startActivity(Intent(this,DieRollAnimation::class.java))
        }
    }
}