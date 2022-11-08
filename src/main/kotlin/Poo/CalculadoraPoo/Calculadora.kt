package Poo.CalculadoraPoo

class Calculator(var n1: Double, var n2: Double, var numberSpec: Float = 0.0f) {

    constructor() : this(0.0,0.0, 0.0f){
        println("Impossivel realizar operação devido \n" +
                "todo numero que é ${n1.toInt()} sempre vai dar por ele mesmo")
    }

   constructor(n1: Double, numberSpec: Float) : this(n1, 0.0, numberSpec){
         potencia()
   }

    fun fazerOperacao(){
        println("Valores sao $n1 = $n2")
        println("Somar: $n1 + $n2 = ${n1.toInt() + n2.toInt()}")
        println("Diminuir: $n1 - $n2 = ${n1 - n2}")
        println("Multiplicar: $n1 * $n2 = ${n1 * n2}")
        println("Dividir: $n1 / $n2 = ${n1 / n2}")
        println()
    }

    private fun potencia(){
        val poten = Math.pow(n1,numberSpec.toDouble())
        println("Calculo de potencia!!!!")
        println("A base ${n1.toInt()} a potencia ${numberSpec.toInt()} = ${poten.toInt()}")
        println()
    }



}