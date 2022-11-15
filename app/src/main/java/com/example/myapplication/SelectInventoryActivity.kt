package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class SelectInventoryActivity : AppCompatActivity(), RadioGroup.OnCheckedChangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_inventory)

        val etDate: EditText = findViewById(R.id.edittext_date)

        val bottomContinue: Button = findViewById(R.id.button_continue)

        bottomContinue.setOnClickListener {
            val intent = Intent(this, ShowInventoryActivity::class.java)
            startActivity(intent)
        }

        val radioGroup: RadioGroup = findViewById(R.id.radio_group)

        radioGroup.setOnCheckedChangeListener(this)


        etDate.setOnClickListener { showDatePickerDialog() }
    }

    private fun showDatePickerDialog() {

        val datePicker = DatePickerFragment { day, month, year -> onDateSelected(day, month+1, year) }
        datePicker.show(supportFragmentManager, "datePicker")
    }

    @SuppressLint("SetTextI18n")
    fun onDateSelected(day: Int, month: Int, year: Int) {
        val etDate: EditText = findViewById(R.id.edittext_date)
        val date = "$year-$month-$day"
        SelectInventoryActivity.date = date

        etDate.setText("Fecha: $day/$month/$year")

    }

    override fun onCheckedChanged(p0: RadioGroup?, idRadio: Int) {

        val radioButtonGPSoacha: RadioButton = findViewById(R.id.radiobutton_GPSoacha)
        val radioButtonMercurio: RadioButton = findViewById(R.id.radiobutton_Mercurio)
        val radioButtonTunal: RadioButton = findViewById(R.id.radiobutton_Tunal)
        val radioButtonAltavista: RadioButton = findViewById(R.id.radiobutton_Altavista)
        val radioButtonEnsueno: RadioButton = findViewById(R.id.radiobutton_Ensueño)

        when(idRadio){
            radioButtonGPSoacha.id -> email = "gpsoachacholao@gmail.com"
            radioButtonMercurio.id -> email = "mercuriocholao@gmail.com"
            radioButtonAltavista.id -> email = "altavistacholao@gmail.com"
            radioButtonTunal.id -> email = "tunalcholao@gmail.com"
            radioButtonEnsueno.id -> email ="ensueño@gmail.com"
        }

    }

    companion object {
        var date: String = ""
        var email: String = ""
    }

}




