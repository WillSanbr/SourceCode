package Agendas

abstract class Person() {

    companion object {
        val personMap = mutableMapOf<String, Int>()
        val listHeight = mutableListOf<Double>()
        fun storePeople(manyPr: Int) {
            if (manyPr <= 0) {
                println("Quantidade de pessoas nao informada!!!")
            } else {
                for (i in 1..manyPr) {
                    println("==============================")
                    println("Digite o nome da $i pessoa: ")
                    val name = readln()
                    println("Digite a idade da $i pessoa: ")
                    val age = readln().toInt()
                    println("Digite a altura da $i pessoa: ")
                    val height = readln().toDouble()
                    println("==============================")
                    personMap[name] = age
                    listHeight.add(height)
                }
            }
        }
    }

    abstract fun removerPerson(name: String)
    abstract fun searchPerson(name: String)

}

class Diary : Person() {

    fun registerPerson(manyPr: Int) {
        Person.storePeople(manyPr)
    }

    override fun removerPerson(name: String) {
        val deletName = personMap.containsKey(name)
        if (deletName) {
            val listNames = personMap.map { it.key }
            for (l in listNames.indices) {
                if (listNames[l] == name) {
                    personMap.remove(name)
                    listHeight.removeAt(l)
                }
            }
        } else if (personMap.isEmpty() && !deletName) {
            println("Agenda está vazia")
        } else {
            println("Informação invalida e nao foi deletada")
        }

    }

    override fun searchPerson(name: String) {
        val searchPerson = personMap.containsKey(name)
        val listPerson = personMap.map { it.key }
        if (searchPerson) {
            for (p in listPerson.indices) {
                if (listPerson[p] == name) println("Na agenda $name está posição $p")
            }
        } else {
            for (i in 1..5) {
                println("Carregando...")
            }
            println("Busca nao encontrada")
        }
    }

    fun printDiary() {
        val names = personMap.map { it.key }
        val age = personMap.map { it.value }
        val height = listHeight

        if (names.isEmpty()) {
            println("Agenda vazia")
        } else {
            for (i in names.indices) {
                println("$i pessoa ${names[i]} tem idade de ${age[i]} anos e altura ${height[i]} m")
            }
        }


    }


}

