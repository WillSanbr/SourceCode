package FuncaoLAMBDA

fun main() {

    val listaPerson = listOf(
        PersonEX("Pedro", 34),
        PersonEX("Maria", 25),
        PersonEX("Julio", 22),
        PersonEX("Ana", 17),
    )

    //filter e map funçoes
    val pessoasNovas = listaPerson.filter { it.age < 26 }
        .map { it.name }


    println(pessoasNovas)


}