package programacaoFuncional

import sistemaNotas.SistemasNotas

fun main() {

    val stud1 = listOf(
        SistemasNotas(213131, "Maria", 10.0, 10.0, 10.0),
        SistemasNotas(111111, "Maria", 5.6, 7.5, 9.5),
        SistemasNotas(333333, "Maria", 5.6, 7.5, 8.5),
    )

    val stud2 = listOf(
        SistemasNotas(9999, "Maria", 5.6, 7.5, 8.5),
        SistemasNotas(9999, "Maria", 2.6, 5.5, 2.5),
        SistemasNotas(54353, "Maria", 2.6, 4.5, 8.5),
        SistemasNotas(24352, "Maria", 2.6, 2.5, 8.5),
    )

    val listStudents = listOf(stud1, stud2).flatten()
    // lista Objeto (t) => lista Double
    val totNotes = listStudents.map { nota -> nota.getNota() }

    val menorNotas = totNotes.filter(::notaMenor)
    println(menorNotas)

    /*
         Função Unior

      val nomesA = listOf("Willian","Pedro","Julio","Helio")
      val nomesb = listOf("Pedro","Pedro","Maria")

      //Junta a lista e transforma lista do SET
      val todosNomes = nomesA.union(nomesb)
      println(todosNomes)
     */
}


fun notaMenor(nota: Double): Boolean {
    return nota <= 6.0
}







