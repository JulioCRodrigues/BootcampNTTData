package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val altura = findViewById<TextView>(R.id.altura)
        val peso = findViewById<TextView>(R.id.peso)
        val calculo = findViewById<Button>(R.id.btn_calcular)

        calculo.setOnClickListener(){
            print("Olá!!!")
        }

    }


}