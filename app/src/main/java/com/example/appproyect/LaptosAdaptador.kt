package com.example.appproyect

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_lapto.view.*

class LaptosAdaptador(private val mcontext: Context, private val listaLapto: List<Laptos>) : ArrayAdapter<Laptos>(mcontext, 0, listaLapto)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layout = LayoutInflater.from(mcontext).inflate(R.layout.item_lapto, parent, false)

        val lapto= listaLapto[position]

        // poniendo la informacion

        layout.marca.text= lapto.marca
        layout.precio.text="S/.${lapto.precio}"
        layout.lapto_toshiba.setImageResource(lapto.imagen)

        return layout

    }



}