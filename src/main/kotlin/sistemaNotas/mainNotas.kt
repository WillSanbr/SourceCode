package sistemaNotas

fun main() {

    val listaTurmaA = listOf(
        SistemasNotas(87432, "Joao", 7.0, 7.0, 7.0),
        SistemasNotas(53252, "Maria", 9.0, 9.0, 9.0),
        SistemasNotas(67545, "Pedro", 7.0, 7.0, 7.0),
    )

    mediaIgual(listaTurmaA[0], listaTurmaA[2])
    maiorNotaDosAlunos()

}

fun mediaIgual(nota1: SistemasNotas, nota2: SistemasNotas) {
    val igualNota: Boolean = nota1.getNota() == nota2.getNota()
    if (igualNota) println("Media do aluno é igual(=)") else println("Media do aluno é diferente(!=)")
}

fun maiorNotaDosAlunos() = SistemasNotas.mediaMaior()



