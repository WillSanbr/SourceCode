package Poo.Velocidade

class Carro constructor(modl: String, mrca: String, maxVel: Int) {

    private val modelo = modl
    private val marca = mrca
    private val velocMax = maxVel

    fun acelerarNoTalo() {
        println("================================")
        println("Vru Vru Vrum!!!")
        for (i in 0..velocMax step 5) {
            println("A velocidade $i km/h ")
        }
        println("Velocidade Maxima!!! Rum rum rum!!!!!")
        println("================================")
    }

    fun reduzindoVelocidade(){
        println("================================")
        println("Reduzindo")
        for (r in velocMax downTo 0 step 5){
            println("A velocidade $r km/h")
        }
        println("Parou!!!")
        println("================================")
        println()
    }
}