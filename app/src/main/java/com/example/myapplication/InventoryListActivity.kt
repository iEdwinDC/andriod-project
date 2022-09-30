package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InventoryListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inventory_list)

        val button_inventory_january: Button = findViewById(R.id.button_inventory_january)
        button_inventory_january.setOnClickListener {
            val intent: Intent = Intent(this, InventoriesActivity::class.java)
            startActivity(intent)
        }

        val button_inventory_february: Button = findViewById(R.id.button_inventory_february)
        button_inventory_february.setOnClickListener {
            val intent: Intent = Intent(this, InventoriesActivity::class.java)
            startActivity(intent)
        }

        val button_inventory_march: Button = findViewById(R.id.button_inventory_march)
        button_inventory_march.setOnClickListener {
            val intent: Intent = Intent(this, InventoriesActivity::class.java)
            startActivity(intent)
        }

        val button_inventory_april: Button = findViewById(R.id.button_inventory_april)
        button_inventory_april.setOnClickListener {
            val intent: Intent = Intent(this, InventoriesActivity::class.java)
            startActivity(intent)
        }
    }


}




