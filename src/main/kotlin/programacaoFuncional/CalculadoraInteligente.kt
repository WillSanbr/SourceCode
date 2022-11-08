package programacaoFuncional

fun main() {
    /*
       Resolvendo Problemas Matematicos:
                Programação Funcional
     */

    calc(7, 7, '+', ::sum)
    calc(7, 7, '-', ::minusa)
    calc(7, 7, '*', ::divide)
    calc(7, 7, '/', ::mul)
    //calc(7, 7, '&', ::sum) Erro de Execução Programa

    //expressao Lambdas
    calc(5, 5, '/') { x, y, _ -> x / y }

}

fun calc(a: Int, b: Int, op: Char, operation: (Int, Int, Char) -> Int) {
    val result = when (op) {
        '+' -> operation(a, b, op)
        '-' -> operation(a, b, op)
        '*' -> operation(a, b, op)
        '/' -> operation(a, b, op)
        else -> null
    }
    if (result != null) println("O resultado da operação é $result")
    else println("Erro de Operação!!!!")
}


fun sum(x: Int, y: Int, op: Char): Int {
    return x + y
}

fun minusa(x: Int, y: Int, op: Char): Int {
    return x - y
}

fun mul(x: Int, y: Int, op: Char): Int {
    return x * y
}

fun divide(x: Int, y: Int, op: Char): Int {
    return x / y
}

