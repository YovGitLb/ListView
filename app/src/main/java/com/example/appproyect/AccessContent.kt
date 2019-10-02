package com.example.appproyect

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_access_content.*

class AccessContent : AppCompatActivity() {

    var ArrayCatalogo = arrayOf("laptos","mouse","tablet","auriculares","Computadoras")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_access_content)

        btncircle.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.acceso, R.drawable.accescomputing)
            .addSubMenu(Color.parseColor("#25BCF"), R.drawable.lapto)
            .addSubMenu(Color.parseColor("6D4C41"), R.drawable.mause)
            .addSubMenu(Color.parseColor("ff0000"), R.drawable.tableta)
            .addSubMenu(Color.parseColor("#la237e"), R. drawable.auriculares)
            .addSubMenu(Color.parseColor("#03a9f4"), R. drawable.images)

            .setOnMenuSelectedListener{
                index -> Toast.makeText(this,"Selected" +ArrayCatalogo[index], Toast.LENGTH_SHORT).show()


                when(ArrayCatalogo[index])
                {
                    "laptos" -> {
                        val intent = Intent(this,LaptoCatalog:: class.java)
                        startActivity(intent)
                    }



                }




            }

    }
}
