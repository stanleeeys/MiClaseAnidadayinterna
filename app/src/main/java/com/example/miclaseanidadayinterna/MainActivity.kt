package com.example.miclaseanidadayinterna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var etn_valor1:EditText?=null
    lateinit var etn_Valor2: EditText
    lateinit var tv_Resultado:TextView
    lateinit var rb_sum: RadioButton
    lateinit var rb_rest: RadioButton
    lateinit var rb_mult: RadioButton
    lateinit var rb_div: RadioButton




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etn_valor1 = findViewById(R.id.etn_Valor1)
        etn_Valor2 = findViewById(R.id.etn_Valor2)
        tv_Resultado = findViewById(R.id.tv_Result)
        rb_sum = findViewById(R.id.rb_suma)
        rb_rest = findViewById(R.id.rb_resta)
        rb_mult = findViewById(R.id.rb_multiplicacion)
        rb_div = findViewById(R.id.rb_division)

        //claseAnidadasyInternas()
    }
    fun calcular(vista:View){

        val  valor1_String = etn_valor1?.text.toString()
        val  valor2_String = etn_Valor2?.text.toString()

        val valor1_Int = valor1_String.toInt()
        val valor2_Int = Integer.parseInt(valor2_String)

        if (rb_sum.isChecked==true) {
            val suma = valor1_Int + valor2_Int
            val resultado = suma.toString()
            tv_Resultado.setText(resultado)
        }else if (rb_rest.isChecked==true) {
            val resta = valor1_Int + valor2_Int
            val resultado = resta.toString()
            tv_Resultado.setText(resultado)

        }else if (rb_mult.isChecked==true) {
        val multiplicacion = valor1_Int + valor2_Int
        val resultado = multiplicacion.toString()
        tv_Resultado.setText(resultado)

    }else if (rb_div.isChecked==true) {
        val division = valor1_Int + valor2_Int
        val resultado = division.toString()
        tv_Resultado.setText(resultado)
    }else{
        Toast.makeText(this, "No puede dividir entre 0",Toast.LENGTH_LONG).show()
        }
    }
    /*private fun claseAnidadasyInternas(){
        val miClaseAnidada = miClaseAnidadayInterna.miClaseAnidada()
        val sumarDosNum = miClaseAnidada.suma(n1=5,n2=6)
        println("El resultado de la suma es $sumarDosNum")

    }*/
}



