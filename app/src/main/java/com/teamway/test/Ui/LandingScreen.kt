package com.teamway.test.Ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.teamway.test.databinding.ActivityLandingScreenBinding

class LandingScreen : AppCompatActivity(){
    private lateinit var LandingScreenbinding: ActivityLandingScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //for view binding support
        //ActivityLandingScreenBinding is a binding file for the layout activity_landing_screen
        LandingScreenbinding = ActivityLandingScreenBinding.inflate(layoutInflater)
        setContentView(LandingScreenbinding.root)

        // Handler().postDelayed will help to do task after some delay
        // 3000 means 3 secound, for 4 secound it should be 4000
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
        },3000)

    }
}