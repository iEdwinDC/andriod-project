package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InventoriesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inventories2)

        val button_backToMenu: Button = findViewById(R.id.button_backToMenu)
        button_backToMenu.setOnClickListener {
            val intent: Intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

    }
}