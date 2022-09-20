package com.example.miclaseanidadayinterna

class miClaseAnidadayInterna {
    private val uno = 1
    private fun retornarUno():Int
    {
        return uno
    }
    inner class miClaseAnidada{
        fun suma(n1:Int,n2:Int):Int{
            return n1+n2+uno
        }
    }
    inner class miClaseInterna(){
        fun sumarDos(num:Int):Int
        {
            return num + uno +retornarUno()
        }
    }
}