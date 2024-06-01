package com.gna.myfoodapp.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.gna.myfoodapp.MainActivity
import com.gna.myfoodapp.R

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun register(view: View) {
        startActivity(Intent(this, RegistrationActivity::class.java))
    }

    fun mainActivity(view: View) {
        startActivity(Intent(this, MainActivity::class.java))
    }
}


