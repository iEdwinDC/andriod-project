package com.example.myapplication


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import com.example.myapplication.databinding.ActivityCreateInventoryBinding
import com.google.firebase.firestore.FirebaseFirestore
import java.time.*

class CreateInventoryActivity : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()
    private lateinit var binding: ActivityCreateInventoryBinding

    private val maxicholao = 7000
    private val cholao = 5500
    private val raspado = 3000
    private val guanabanada = 5000
    private val lulada = 5000

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateInventoryBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.ButtonValidate.setOnClickListener{
            calculate()
        }

        binding.ButtonSaveInventory.setOnClickListener {
            validate()
        }

    }


    @RequiresApi(Build.VERSION_CODES.O)
    private fun save(){

        val date = LocalDate.now(ZoneId.of("America/Phoenix"))
            db.collection("inventories").document(LoginActivity.email).collection("Fecha")
                .document(date.toString()).set(
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
                        "Vasos Total Raspao" to binding.editTextInvFRaspao.text.toString(),



                        "Fruta Stock Maracuya" to binding.editTextStockPulpaMaracuya.text.toString(),
                        "Fruta Entrada Maracuya" to binding.editTextEntradaPulpaMaracuya.text.toString(),
                        "Fruta Total Maracuya" to binding.editTextInvFPulpaMaracuya.text.toString(),

                        "Fruta Stock Guanabana" to binding.editTextStockPulpaGuanabana.text.toString(),
                        "Fruta Entrada Guanabana" to binding.editTextEntradaPulpaGuanabana.text.toString(),
                        "Fruta Total Guanabana" to binding.editTextInvFPulpaGuanabana.text.toString(),

                        "Fruta Stock Lulo" to binding.editTextStockPulpaLulo.text.toString(),
                        "Fruta Entrada Lulo" to binding.editTextEntradaPulpaLulo.text.toString(),
                        "Fruta Total Lulo" to binding.editTextInvFPulpaLulo.text.toString(),

                        "Fruta Stock Banano" to binding.editTextStockBanano.text.toString(),
                        "Fruta Entrada Banano" to binding.editTextEntradaBanano.text.toString(),
                        "Fruta Total Banano" to binding.editTextInvFBanano.text.toString(),

                        "Fruta Stock Salsa Mora" to binding.editTextStockMora.text.toString(),
                        "Fruta Entrada Salsa Mora" to binding.editTextEntradaMora.text.toString(),
                        "Fruta Total Salsa Mora" to binding.editTextInvFMora.text.toString(),

                        "Fruta Stock Piña" to binding.editTextStockPiA.text.toString(),
                        "Fruta Entrada Piña" to binding.editTextEntradaPiA.text.toString(),
                        "Fruta Total Piña" to binding.editTextInvFPiA.text.toString(),



                        "Otros Stock Leche" to binding.editTextStockLeche.text.toString(),
                        "Otros Entrada Leche" to binding.editTextEntradaLeche.text.toString(),
                        "Otros Total Leche" to binding.editTextInvFLeche.text.toString(),

                        "Otros Stock Milo" to binding.editTextStockMilo.text.toString(),
                        "Otros Entrada Milo" to binding.editTextEntradaMilo.text.toString(),
                        "Otros Total Milo" to binding.editTextInvFMilo.text.toString(),

                        "Otros Stock Pitillo" to binding.editTextStockPitillo.text.toString(),
                        "Otros Entrada Pitillo" to binding.editTextEntradaPitillo.text.toString(),
                        "Otros Total Pitillo" to binding.editTextInvFPitillo.text.toString(),

                        "Otros Stock Servilleta" to binding.editTextStockServilleta.text.toString(),
                        "Otros Entrada Servilleta" to binding.editTextEntradaServilleta.text.toString(),
                        "Otros Total Servilleta" to binding.editTextInvFServilleta.text.toString(),

                        "Otros Stock Cucharas" to binding.editTextStockCuchara.text.toString(),
                        "Otros Entrada Cucharas" to binding.editTextEntradaCuchara.text.toString(),
                        "Otros Total Cucharas" to binding.editTextInvFCuchara.text.toString(),

                        "Otros Stock Guantes" to binding.editTextStockGuantes.text.toString(),
                        "Otros Entrada Guantes" to binding.editTextEntradaGuantes.text.toString(),
                        "Otros Total Guantes" to binding.editTextInvFGuantes.text.toString(),

                        "Otros Stock Tapabocas" to binding.editTextStockTapabocas.text.toString(),
                        "Otros Entrada Tapabocas" to binding.editTextEntradaTapabocas.text.toString(),
                        "Otros Total Tapabocas" to binding.editTextInvFTapabocas.text.toString(),

                        "Otros Stock Hielo" to binding.editTextStockHielo.text.toString(),
                        "Otros Entrada Hielo" to binding.editTextEntradaHielo.text.toString(),
                        "Otros Total Hielo" to binding.editTextInvFHielo.text.toString(),


                        "Total" to binding.total.text.toString(),
                        "Nota" to binding.nota.text.toString(),
                    )
                )

            acceptanceAlert()

    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun validate(){
        if(binding.editTextStockCholao.text.toString().isEmpty() or binding.editTextEntradaCholao.text.toString().isEmpty() or binding.editTextInvFCholao.text.toString().isEmpty() or
            binding.editTextStockMaxiCholao.text.toString().isEmpty() or binding.editTextEntradaMaxiCholao.text.toString().isEmpty() or binding.editTextInvFMaxiCholao.text.toString().isEmpty() or
            binding.editTextStockLulada.text.toString().isEmpty() or binding.editTextEntradaLulada.text.toString().isEmpty() or binding.editTextInvFLulada.text.toString().isEmpty() or
            binding.editTextStockGuanabanada.text.toString().isEmpty() or binding.editTextEntradaGuanabanada.text.toString().isEmpty() or binding.editTextInvFGuanabanada.text.toString().isEmpty() or
            binding.editTextStockRaspao.text.toString().isEmpty() or binding.editTextEntradaRaspao.text.toString().isEmpty() or binding.editTextInvFRaspao.text.toString().isEmpty() or
            binding.editTextStockPulpaMaracuya.text.toString().isEmpty() or binding.editTextEntradaPulpaMaracuya.text.toString().isEmpty() or binding.editTextInvFPulpaMaracuya.text.toString().isEmpty() or
            binding.editTextStockPulpaGuanabana.text.toString().isEmpty() or binding.editTextEntradaPulpaGuanabana.text.toString().isEmpty() or binding.editTextInvFPulpaGuanabana.text.toString().isEmpty() or
            binding.editTextStockPulpaLulo.text.toString().isEmpty() or binding.editTextEntradaPulpaLulo.text.toString().isEmpty() or binding.editTextInvFPulpaLulo.text.toString().isEmpty() or
            binding.editTextStockBanano.text.toString().isEmpty() or binding.editTextEntradaBanano.text.toString().isEmpty() or binding.editTextInvFBanano.text.toString().isEmpty() or
            binding.editTextStockMora.text.toString().isEmpty() or binding.editTextEntradaMora.text.toString().isEmpty() or  binding.editTextInvFMora.text.toString().isEmpty() or
            binding.editTextStockPiA.text.toString().isEmpty() or  binding.editTextEntradaPiA.text.toString().isEmpty() or binding.editTextInvFPiA.text.toString().isEmpty() or
            binding.editTextStockLeche.text.toString().isEmpty() or binding.editTextEntradaLeche.text.toString().isEmpty() or  binding.editTextInvFLeche.text.toString().isEmpty() or
            binding.editTextStockMilo.text.toString().isEmpty() or binding.editTextEntradaMilo.text.toString().isEmpty() or binding.editTextInvFMilo.text.toString().isEmpty() or
            binding.editTextStockPitillo.text.toString().isEmpty() or binding.editTextEntradaPitillo.text.toString().isEmpty() or binding.editTextInvFPitillo.text.toString().isEmpty() or
            binding.editTextStockServilleta.text.toString().isEmpty() or binding.editTextEntradaServilleta.text.toString().isEmpty() or binding.editTextInvFServilleta.text.toString().isEmpty() or
            binding.editTextStockCuchara.text.toString().isEmpty() or binding.editTextEntradaCuchara.text.toString().isEmpty() or binding.editTextInvFCuchara.text.toString().isEmpty() or
            binding.editTextStockGuantes.text.toString().isEmpty() or binding.editTextEntradaGuantes.text.toString().isEmpty() or binding.editTextInvFGuantes.text.toString().isEmpty() or
            binding.editTextStockTapabocas.text.toString().isEmpty() or binding.editTextEntradaTapabocas.text.toString().isEmpty() or binding.editTextInvFTapabocas.text.toString().isEmpty() or
            binding.editTextStockHielo.text.toString().isEmpty() or binding.editTextEntradaHielo.text.toString().isEmpty() or binding.editTextInvFHielo.text.toString().isEmpty()
        ){
            disapproveAlert()

        }else{
            save()

        }
    }

    private fun acceptanceAlert() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Guardado")
        builder.setMessage("El inventario se guardo exitosamente.")
        builder.setPositiveButton("Aceptar"){
                _, _ -> exit()
        }
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun disapproveAlert(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("El inventario tiene casillas vacias.")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    @SuppressLint("SetTextI18n")
    private fun calculate(){
        if(binding.editTextStockCholao.text.toString().isEmpty() or binding.editTextEntradaCholao.text.toString().isEmpty() or binding.editTextInvFCholao.text.toString().isEmpty() or
        binding.editTextStockMaxiCholao.text.toString().isEmpty() or binding.editTextEntradaMaxiCholao.text.toString().isEmpty() or binding.editTextInvFMaxiCholao.text.toString().isEmpty() or
        binding.editTextStockLulada.text.toString().isEmpty() or binding.editTextEntradaLulada.text.toString().isEmpty() or binding.editTextInvFLulada.text.toString().isEmpty() or
        binding.editTextStockGuanabanada.text.toString().isEmpty() or binding.editTextEntradaGuanabanada.text.toString().isEmpty() or binding.editTextInvFGuanabanada.text.toString().isEmpty() or
        binding.editTextStockRaspao.text.toString().isEmpty() or binding.editTextEntradaRaspao.text.toString().isEmpty() or binding.editTextInvFRaspao.text.toString().isEmpty()){

            disapproveAlert()
        }else{
            val total = (binding.editTextStockCholao.text.toString().toInt() + binding.editTextEntradaCholao.text.toString().toInt()-binding.editTextInvFCholao.text.toString().toInt())*cholao+
                    (binding.editTextStockMaxiCholao.text.toString().toInt() + binding.editTextEntradaMaxiCholao.text.toString().toInt()-binding.editTextInvFMaxiCholao.text.toString().toInt())*maxicholao+
                    (binding.editTextStockLulada.text.toString().toInt() + binding.editTextEntradaLulada.text.toString().toInt()-binding.editTextInvFLulada.text.toString().toInt())*lulada+
                    (binding.editTextStockGuanabanada.text.toString().toInt() + binding.editTextEntradaGuanabanada.text.toString().toInt()-binding.editTextInvFGuanabanada.text.toString().toInt())*guanabanada+
                    (binding.editTextStockRaspao.text.toString().toInt() + binding.editTextEntradaRaspao.text.toString().toInt()-binding.editTextInvFRaspao.text.toString().toInt())*raspado
            binding.total.text = ""+total
        }

    }

    private fun exit(){

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }
}
