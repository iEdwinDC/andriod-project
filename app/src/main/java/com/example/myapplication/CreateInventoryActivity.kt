package com.example.myapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import com.example.myapplication.databinding.ActivityCreateInventoryBinding
import com.google.firebase.firestore.FirebaseFirestore
import java.time.LocalDate

class CreateInventoryActivity : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()
    private lateinit var binding: ActivityCreateInventoryBinding

    @RequiresApi(Build.VERSION_CODES.O)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateInventoryBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val date = LocalDate.now()

        binding.ButtonSaveInventory.setOnClickListener {
            db.collection("inventories").document(LoginActivity.email).collection("Fecha").document(date.toString()).
            set(
                hashMapOf(
                    "Fecha" to date.toString(),
                    "Vasos Stock Cholaos" to binding.editTextStockCholao.text.toString(),
                    "Vasos Entrada Cholaos" to binding.editTextEntradaCholao.text.toString(),
                    "Vasos Total Cholaos" to binding.editTextInvFCholao.text.toString(),

                    "Vasos Stock MaxiCholao" to binding.editTextStockMaxiCholao.text.toString(),
                    "Vasos Entrada MaxiCholaos" to binding.editTextEntradaMaxiCholao.text.toString(),
                    "Vasos Total MaxiCholaos" to binding.editTextInvFMaxiCholao.text.toString(),

                    "Vasos Stock Lulada" to binding.editTextStockLulada.text.toString(),
                    "Vasos Entrada Lulada" to binding.editTextEntradaLulada.text.toString(),
                    "Vasos Total Lulada" to binding.editTextInvFLulada.text.toString(),

                    "Vasos Stock Guanabanada" to binding.editTextStockGuanabanada.text.toString(),
                    "Vasos Entrada Guanabanada" to binding.editTextEntradaGuanabanada.text.toString(),
                    "Vasos Total Guanabanada" to binding.editTextInvFGuanabanada.text.toString(),

                    "Vasos Stock Raspao" to binding.editTextStockRaspao.text.toString(),
                    "Vasos Entrada Raspao" to binding.editTextEntradaRaspao.text.toString(),
                    "Vasos Total Raspao" to binding.editTextInvFRaspao.text.toString()

                )
            )
            showAlert()
        }
    }

    private fun showAlert() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Guardado")
        builder.setMessage("El inventario se guardo exitosamente.")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}
