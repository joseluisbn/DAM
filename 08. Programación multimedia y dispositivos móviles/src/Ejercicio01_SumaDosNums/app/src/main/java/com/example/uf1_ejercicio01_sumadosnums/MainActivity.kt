package com.example.uf1_ejercicio01_sumadosnums

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//Para acceder a los elementos del layout
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Configuramos el botón Sumar
        button.setOnClickListener {
            val nro1 = et1.text.toString().toInt()
            val nro2 = et2.text.toString().toInt()
            val suma = nro1 + nro2
            tv1.text = "La suma de los números es: ${suma.toString()}"
        }


    }
}