package Poo.Velocidade

fun main() {

    print("Marca: ")
    val marca = readln()

    print("Modelo: ")
    val model = readln()

    print("Velocidade Maxima: ")
    val velocMax = readln().toInt()

    val carro = Carro(model, marca, velocMax)

    carro.acelerarNoTalo()
    carro.reduzindoVelocidade()

}