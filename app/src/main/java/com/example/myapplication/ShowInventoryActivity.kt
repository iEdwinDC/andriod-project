package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityShowInventoryBinding
import com.google.firebase.firestore.FirebaseFirestore

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



                binding.editTextStockPulpaMaracuya.text = it.get("Fruta Stock Maracuya") as String?
                binding.editTextEntradaPulpaMaracuya.text = it.get("Fruta Entrada Maracuya") as String?
                binding.editTextInvFPulpaMaracuya.text = it.get("Fruta Total Maracuya") as String?

                binding.editTextStockPulpaGuanabana.text = it.get("Fruta Stock Guanabana") as String?
                binding.editTextEntradaPulpaGuanabana.text = it.get("Fruta Entrada Guanabana") as String?
                binding.editTextInvFPulpaGuanabana.text = it.get("Fruta Total Guanabana") as String?

                binding.editTextStockPulpaLulo.text = it.get("Fruta Stock Lulo") as String?
                binding.editTextEntradaPulpaLulo.text = it.get("Fruta Entrada Lulo") as String?
                binding.editTextInvFPulpaLulo.text = it.get("Fruta Total Lulo") as String?

                binding.editTextStockBanano.text = it.get("Fruta Stock Banano") as String?
                binding.editTextEntradaBanano.text = it.get("Fruta Entrada Banano") as String?
                binding.editTextInvFBanano.text = it.get("Fruta Total Banano") as String?

                binding.editTextStockMora.text = it.get("Fruta Stock Salsa Mora") as String?
                binding.editTextEntradaMora.text = it.get("Fruta Entrada Salsa Mora") as String?
                binding.editTextInvFMora.text = it.get("Fruta Total Salsa Mora") as String?

                binding.editTextStockPiA.text = it.get("Fruta Stock Piña") as String?
                binding.editTextEntradaPiA.text = it.get("Fruta Entrada Piña") as String?
                binding.editTextInvFPiA.text = it.get("Fruta Total Piña") as String?



                binding.editTextStockLeche.text = it.get("Otros Stock Leche") as String?
                binding.editTextEntradaLeche.text = it.get("Otros Entrada Leche") as String?
                binding.editTextInvFLeche.text = it.get("Otros Total Leche") as String?

                binding.editTextStockMilo.text = it.get("Otros Stock Milo") as String?
                binding.editTextEntradaMilo.text = it.get("Otros Entrada Milo") as String?
                binding.editTextInvFMilo.text = it.get("Otros Total Milo") as String?

                binding.editTextStockPitillo.text = it.get("Otros Stock Pitillo") as String?
                binding.editTextEntradaPitillo.text = it.get("Otros Entrada Pitillo") as String?
                binding.editTextInvFPitillo.text = it.get("Otros Total Pitillo") as String?

                binding.editTextStockServilleta.text = it.get("Otros Stock Servilleta") as String?
                binding.editTextEntradaServilleta.text = it.get("Otros Entrada Servilleta") as String?
                binding.editTextInvFServilleta.text = it.get("Otros Total Servilleta") as String?

                binding.editTextStockCuchara.text = it.get("Otros Stock Cucharas") as String?
                binding.editTextEntradaCuchara.text = it.get("Otros Entrada Cucharas") as String?
                binding.editTextInvFCuchara.text = it.get("Otros Total Cucharas") as String?

                binding.editTextStockGuantes.text = it.get("Otros Stock Guantes") as String?
                binding.editTextEntradaGuantes.text = it.get("Otros Entrada Guantes") as String?
                binding.editTextInvFGuantes.text = it.get("Otros Total Guantes") as String?

                binding.editTextStockTapabocas.text = it.get("Otros Stock Tapabocas") as String?
                binding.editTextEntradaTapabocas.text = it.get("Otros Entrada Tapabocas") as String?
                binding.editTextInvFTapabocas.text = it.get("Otros Total Tapabocas") as String?

                binding.editTextStockHielo.text = it.get("Otros Stock Hielo") as String?
                binding.editTextEntradaHielo.text = it.get("Otros Entrada Hielo") as String?
                binding.editTextInvFHielo.text = it.get("Otros Total Hielo") as String?


                binding.total.text = it.get("Total") as String?
                binding.nota.text = it.get("Nota") as String?

        }


    }
}

