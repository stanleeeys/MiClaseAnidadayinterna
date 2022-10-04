package com.example.miclaseanidadayinterna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class listview : AppCompatActivity() {
    private var lvlenguajes: ListView?=null
    private var tvSeleccion: TextView?=null

    private val lenguaje = arrayOf("kotlin","Java","C++","C#","PHP","VB.NET")
    private val posicion = arrayOf("1","6","3","2","4","5")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)
        lvlenguajes=findViewById((R.id.lv_lenguajes))
        tvSeleccion=findViewById((R.id.tv_seleccion))

        var adartador:ArrayAdapter<String> = ArrayAdapter<String>(this,R.layout.list_items_claseprogra,lenguaje)
        lvlenguajes?.adapter=adartador
        lvlenguajes?.onItemClickListener= object :AdapterView.OnItemClickListener{
            override fun onItemClick(parent: AdapterView<*>?,
                                        view: View?,
                                        position: Int,
                                        id: Long) {
                tvSeleccion?.text="La posicion del lenguaje ${lvlenguajes?.getItemAtPosition(position)} es ${posicion[position]}"
            }



        }




    }
}