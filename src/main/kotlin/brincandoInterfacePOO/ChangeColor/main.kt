package brincandoInterfacePOO

import brincandoInterfacePOO.ChangeColor.*
import kotlin.system.exitProcess

fun main() {

    val selectColor = escolherCor()
    val renderColor = RenderColor(escolherCor())
    renderColor.pictureScreen()
}

fun escolherCor(): SwitchColor {
    println("Escolhe uma cor: ")
    println("--------------------")
    println(
        "Vermelhor: 1\n" +
                "Verde: 2\n" +
                "Blue: 3\n" +
                "Outra cor: 4\n"
    )
    val choise = readln().toInt()
    val color = seachColor(choise)
    return color
}

fun seachColor(i: Int): SwitchColor {
    val valid: Any = if (i == 1) {
        Red()
    } else if (i == 2) {
        Green()
    } else if (i == 3) {
        Blue()
    } else if (i == 4) {
        println("Digite o nome da cor? ")
        val colorName = readln()
        println("Digite a cor decimal")
        val colorHx = readln()
        val otherCl = OtherColor(colorName, colorHx)
        println(otherCl.colorSelect())
        exitProcess(0)
    } else {
        throw IllegalArgumentException("Operação invalida")
    }
    return valid as SwitchColor
}











