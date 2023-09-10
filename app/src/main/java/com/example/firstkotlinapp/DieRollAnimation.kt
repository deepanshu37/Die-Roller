package com.example.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.Toast
import app.rive.runtime.kotlin.RiveAnimationView
import app.rive.runtime.kotlin.core.Rive
import com.example.firstkotlinapp.databinding.ActivityDieRollAnimationBinding

class DieRollAnimation : AppCompatActivity() {
/*
    private lateinit var binding : ActivityDieRollAnimationBinding
*/
    private val stateMachineName = "State Machine 1"
    private val handler = Handler(Looper.getMainLooper())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_die_roll_animation)

        val dieRolled = findViewById<RiveAnimationView>(R.id.dieRolled)
        val btn_1 = findViewById<Button>(R.id.one)

        btn_1.setOnClickListener{
            /*binding.*/dieRolled.controller.setBooleanState(stateMachineName,"isRolled", true)
           /* binding.*/dieRolled.controller.setNumberState(stateMachineName,"Number?", 1F)
            Toast.makeText(this,"1 will appear", Toast.LENGTH_SHORT).show()
            handler.postDelayed({
                dieRolled.controller.setBooleanState(stateMachineName, "isRolled", false)
                Toast.makeText(this,"Cleared the Animation, Ready to roll again", Toast.LENGTH_SHORT).show()
            }, 2000)
        }

        val btn_2 = findViewById<Button>(R.id.two)
        btn_2.setOnClickListener{
            /*binding.*/dieRolled.controller.setBooleanState(stateMachineName,"isRolled", true)
            /*binding.*/dieRolled.controller.setNumberState(stateMachineName,"Number?", 2F)
            Toast.makeText(this,"2 will appear", Toast.LENGTH_SHORT).show()
            handler.postDelayed({
                dieRolled.controller.setBooleanState(stateMachineName, "isRolled", false)
            }, 2000)
        }

        val btn_3 = findViewById<Button>(R.id.three)
        btn_3.setOnClickListener{
            /*binding.*/dieRolled.controller.setBooleanState(stateMachineName,"isRolled", true)
            /*binding.*/dieRolled.controller.setNumberState(stateMachineName,"Number?", 3F)
            Toast.makeText(this,"3 will appear", Toast.LENGTH_SHORT).show()
            handler.postDelayed({
                dieRolled.controller.setBooleanState(stateMachineName, "isRolled", false)
                Toast.makeText(this,"Cleared the Animation, Ready to roll again", Toast.LENGTH_SHORT).show()
            }, 2000)
        }

        val btn_4 = findViewById<Button>(R.id.four)
        btn_4.setOnClickListener{
            /*binding.*/dieRolled.controller.setBooleanState(stateMachineName,"isRolled", true)
            /*binding.*/dieRolled.controller.setNumberState(stateMachineName,"Number?", 4F)
            Toast.makeText(this,"4 will appear", Toast.LENGTH_SHORT).show()
            handler.postDelayed({
                dieRolled.controller.setBooleanState(stateMachineName, "isRolled", false)
                Toast.makeText(this,"Cleared the Animation, Ready to roll again", Toast.LENGTH_SHORT).show()
            }, 2000)
        }

        val btn_5 = findViewById<Button>(R.id.five)
        btn_5.setOnClickListener{
            /*binding.*/dieRolled.controller.setBooleanState(stateMachineName,"isRolled", true)
            /*binding.*/dieRolled.controller.setNumberState(stateMachineName,"Number?", 5F)
            Toast.makeText(this,"5 will appear", Toast.LENGTH_SHORT).show()
            handler.postDelayed({
                dieRolled.controller.setBooleanState(stateMachineName, "isRolled", false)
                Toast.makeText(this,"Cleared the Animation, Ready to roll again", Toast.LENGTH_SHORT).show()
            }, 2000)
        }

        val btn_6 = findViewById<Button>(R.id.six)
        btn_6.setOnClickListener{
            /*binding.*/dieRolled.controller.setBooleanState(stateMachineName,"isRolled", true)
            /*binding.*/dieRolled.controller.setNumberState(stateMachineName,"Number?", 6F)
            Toast.makeText(this,"6 will appear", Toast.LENGTH_SHORT).show()
            handler.postDelayed({
                dieRolled.controller.setBooleanState(stateMachineName, "isRolled", false)
                Toast.makeText(this,"Cleared the Animation, Ready to roll again", Toast.LENGTH_SHORT).show()
            }, 2000)
        }

        /*binding=ActivityDieRollAnimationBinding.inflate(layoutInflater)
        setContentView(*//*binding.*//*root)*/

        Rive.init(this)

    }
}