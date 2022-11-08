fun main() {

    print("Numero 1: ")
    val number1 = readln().toDouble()

    print("Seleciona [+ - * /]: ")
    val ope = readln()[0]

    print("Numero 2: ")
    val number2 = readln().toDouble()

    when (ope) {
        '+' -> println("O resultado é ${somar(number1.toInt(), number2.toInt())}")
        '-' -> println("O resultado é ${dim(number1.toInt(), number2.toInt())}")
        '*' -> println("O resultado é ${Mult(number1, number2)}")
        '/' -> println("O resultado é ${Div(number1, number2)}")
        else -> println("Erro de execução dx90423")
    }
}

private fun somar(x: Int, y: Int): Int = x + y

private fun dim(x: Int, y: Int): Int = x - y

private fun Mult(x: Double, y: Double): Double {
    return x * y
}

private fun Div(x: Double, y: Double): Double {
    return x / y
}