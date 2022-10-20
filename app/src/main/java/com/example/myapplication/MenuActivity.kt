package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

enum class ProviderType{
        BASIC
}
class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inventories)

        val buttonInventory: Button = findViewById(R.id.button_inventory)
        buttonInventory.setOnClickListener {
            val intent: Intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        val buttonStatic: Button = findViewById(R.id.button_statistics)
        buttonStatic.setOnClickListener {
            val intent: Intent = Intent(this, InventoryListActivity::class.java)
            startActivity(intent)
        }
    }
}