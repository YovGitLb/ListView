package com.example.appproyect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details_laptos.*
import kotlinx.android.synthetic.main.item_lapto.*
import kotlinx.android.synthetic.main.item_lapto.view.*

class DetailsLaptos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_laptos)



        val producto= intent.getSerializableExtra("lapto_toshiba") as Laptos

        marcadetalle.text= producto.marca
        precio_detalle.text="S/.${producto.precio}"
        descripcion_detalle.text=producto.descripcion
        imagen_detalle.setImageResource(producto.imagen)





    }
}
