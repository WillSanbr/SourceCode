package BrincandoListas

fun main() {

    /*
    val notaTurma = listOf(
        Alunos("Pedor",7.5),
        Alunos("WIllian",9.5),
        Alunos("Maria",6.2),
        Alunos("Fer",5.5),
        Alunos("Julio",4.5)
    )

    val media = notaTurma.filter { Alunos ->  Alunos.nota <= 6.5}
    media.forEach { println(it) }
     */

    //Juntar lista dinamica = FIXA
    val turmaA = listOf(
        Alunos("Pedro", 7.5),
        Alunos("WIllian", 9.5),
        Alunos("Victor", 9.5),
    )

    //lista Mutavel
    val turmaB = mutableListOf(
        Alunos("Patricia", 3.5),
        Alunos("Julio", 5.6),
        Alunos("Vitoria", 8.5)
    )

    val conjunto = listOf(turmaA, turmaB)

    val juntando = conjunto.flatten() //Função flatten = junta as listas
    //juntando.forEach{ println(it) }

    println(juntando.firstOrNull())


    val igual = mediaIgual(juntando[0], juntando[2])
    println(messageIgual(igual))


}


data class Alunos(val nome: String, val nota: Double)


private fun mediaIgual(aluno1: Alunos, aluno2: Alunos): Boolean = aluno1.nota == aluno2.nota


private fun messageIgual(equals: Boolean): String {
    return if (equals) "A media do aluno é igual(==)" else "A media do aluno é diferente(!=)"
}


