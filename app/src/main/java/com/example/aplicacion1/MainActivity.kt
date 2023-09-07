package com.example.aplicacion1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton:Button=findViewById(R.id.btnComparar)
        boton.setOnClickListener {comparar()}
    }

    @SuppressLint("SetTextI18n")
    private fun comparar() {

        val campo1: EditText=findViewById(R.id.txt1)
        val campo2: EditText=findViewById(R.id.txt2)
        val lblRespuesta:TextView=findViewById(R.id.lbl_respuesta)

        lblRespuesta.text= campo1.text.toString().compareTo(campo2.text.toString()).toString()

        if(campo1.text.toString() == campo2.text.toString()){
            lblRespuesta.text="No hay diferencias."
        }else{
            lblRespuesta.text=
                "La diferencia entre las 2 cadenas son:\n${campo1.text}\n${campo2.text}"
        }
    }
}