package com.gna.myfoodapp.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.activity.ComponentActivity
import com.gna.myfoodapp.R

class WelcomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_welcome)

    }

    fun register(view: View) {

            startActivity(Intent(this, RegistrationActivity::class.java))

    }

    fun login(view: View) {
        startActivity(Intent(this, RegistrationActivity::class.java))
    }


}


