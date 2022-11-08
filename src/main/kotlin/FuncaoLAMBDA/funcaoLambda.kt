package FuncaoLAMBDA


fun main(args: Array<String>) {

    val ss = arrayOf(2, 3, 45, 64)


    //Expressao lambda sem Retorno
    val message = { parametro: String -> println(parametro) }
    message("Hello World!!!")

    //Expressao lambda com Retorno
    val mediaAluno = { nome: String, nota: Double ->
        if (nota >= 7.0) "O aluno(a) $nome está aprovado com uma $nota"
        else "O aluno $nome tem que estudar Mais!!!"
    }

    //Expressao de calculo matematica com retorno Inteiro
    val soma = { x: Int, y: Int -> x + y }
    val diminuir = { x: Int, y: Int -> x - y }
    val multiplicar = { x: Int, y: Int -> x * y }
    val dividir = { x: Int, y: Int -> x / y }

    println(soma(4, 4))
    println(diminuir(4, 4))
    println(multiplicar(4, 4))
    println(dividir(4, 4))
    println(mediaAluno("Joao", 7.5))


}

