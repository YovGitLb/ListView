package com.example.appproyect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lapto_catalog.*

class LaptoCatalog : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lapto_catalog)


        val lapto_toshiba = Laptos(marca =  "Toshiba", precio= 1500.00, descripcion= "Modelo: XV02145", imagen = R.drawable.toshiba)
        val lapto_intel=Laptos(marca = "Intel", precio = 2800.00, descripcion = "Modelo: IT1254XV", imagen = R.drawable. intel)
        val lapto_sansung=Laptos(marca="Sansung", precio = 2500.00, descripcion = "Modelo:P21Y5871", imagen = R.drawable.sansung)
        val lapto_ace=Laptos(marca = "Ace", precio = 1980.00, descripcion = "Modelo: JK1DE203", imagen = R.drawable.ace)


        val ListLapto= listOf(lapto_toshiba, lapto_intel, lapto_sansung,lapto_ace)

        val adapter=  LaptosAdaptador(this, ListLapto )

        lista.adapter = adapter


        lista.setOnItemClickListener { parent, view, position, id ->

            val intent= Intent (this, DetailsLaptos::class.java)
            intent.putExtra("lapto_toshiba", ListLapto[position])

            startActivity(intent)



        }


    }
}
