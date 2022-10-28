package com.example.myapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.myapplication.databinding.ActivityShowInventoryBinding
import com.google.firebase.firestore.FirebaseFirestore
import java.time.LocalDate

class ShowInventoryActivity : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()
    private lateinit var binding: ActivityShowInventoryBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowInventoryBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        db.collection("inventories").document(SelectInventoryActivity.email).collection("Fecha").document(SelectInventoryActivity.date)
            .get().addOnSuccessListener {
            binding.textDate.text = it.get("Fecha") as String?

            binding.editTextStockCholao.text = it.get("Vasos Stock Cholaos") as String?
            binding.editTextEntradaCholao.text = it.get("Vasos Entrada Cholaos") as String?
            binding.editTextInvFCholao.text = it.get("Vasos Total Cholaos") as String?

            binding.editTextStockMaxiCholao.text = it.get("Vasos Stock MaxiCholao") as String?
            binding.editTextEntradaMaxiCholao.text = it.get("Vasos Entrada MaxiCholaos") as String?
            binding.editTextInvFMaxiCholao.text = it.get("Vasos Total MaxiCholaos") as String?

            binding.editTextStockLulada.text = it.get("Vasos Stock Lulada") as String?
            binding.editTextEntradaLulada.text = it.get("Vasos Entrada Lulada") as String?
            binding.editTextInvFLulada.text = it.get("Vasos Total Lulada") as String?

            binding.editTextStockGuanabanada.text = it.get("Vasos Stock Guanabanada") as String?
            binding.editTextEntradaGuanabanada.text = it.get("Vasos Entrada Guanabanada") as String?
            binding.editTextInvFGuanabanada.text = it.get("Vasos Total Guanabanada") as String?

            binding.editTextStockRaspao.text = it.get("Vasos Stock Raspao") as String?
            binding.editTextEntradaRaspao.text = it.get("Vasos Entrada Raspao") as String?
            binding.editTextInvFRaspao.text = it.get("Vasos Total Raspao") as String?
        }


    }
}