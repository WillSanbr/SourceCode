fun main() {

    ProcessandoNotas()

}


private fun ProcessandoNotas() {

    var listaNomes = mutableListOf<String>()
    var listaNotas = mutableListOf<Float>()
    var maiorMedia = 0.0f
    var menorMedia = 9.99999f

    println("Digite quantos alunos? ")
    val qtdeAlun = readln().toInt()

    var cont = 1
    while (cont <= qtdeAlun) {

        println("Nome do $cont aluno? ")
        val nomeAl = readln()

        print("Primeira nota: ")
        val nota1 = readln().toFloat()

        print("Segunda nota: ")
        val nota2 = readln().toFloat()

        print("Terceira nota: ")
        val nota3 = readln().toFloat()

        println()

        val media = (nota1 + nota2 + nota3) / 3.0f

        if (media > maiorMedia) {
            maiorMedia = media
        }

        if(media < menorMedia){
            menorMedia = media
        }
        listaNomes.add(nomeAl)
        listaNotas.add(media)
        cont++
    }
    exibirNotasDosAlunos(listaNomes, listaNotas, maiorMedia, menorMedia)
}

private fun exibirNotasDosAlunos(
    listaAlunos: List<String>, listaNotas: List<Float>, maiorMedia: Float, menorMedia: Float
) {

    println(
        "(-----------------)\n" +
                "Alunos | Notas"
    )

    for (l in listaNotas.indices) {
        println(String.format("%s = %.1f", listaAlunos[l], listaNotas[l]))
    }
    println("(-----------------)")
    maiorNotaMedia(listaAlunos, listaNotas, maiorMedia)
    menorMediaNota(listaAlunos, listaNotas, menorMedia)

}

private fun maiorNotaMedia(alunos: List<String>, notas: List<Float>, maior: Float) {
    for (m in notas.indices)
        if (notas[m] >= maior)
            println(
                String.format(
                    "A media maior foi o aluno %s com a nota %.1f",
                    alunos[m], notas[m]
                )
            )
}

private fun menorMediaNota(alunos: List<String>, notas: List<Float>, menor: Float){
    for (m in notas.indices){
        if(notas[m] <= menor) println(
            String.format("A menor nota foi o aluno(a) %s com a nota %.1f",alunos[m],notas[m]))
    }
}




