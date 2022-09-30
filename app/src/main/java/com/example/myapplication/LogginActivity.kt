package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LogginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loggin)

        val btn: Button = findViewById(R.id.button_submit)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}