package PessoaCompanionObj

class Pessoa(name: String, age: Int) {

    companion object {
        var cdastPerson = 0
        private val listaNomes = mutableListOf<String>()
        private val listaIdades = mutableListOf<Int>()
    }

    init {
        cdastPerson++
        listaNomes.add(name)
        listaIdades.add(age)
    }


    fun exibirPesCadastr() {
        println("Pessoas Cadastradas $cdastPerson")
    }

    fun nomesDasPessoas() {
        print("Nomes das pessoas foram: ")
        for (l in listaNomes) {
            print("$l ,")
        }
        println()
    }

    fun mediaDasIdades() {
        var totIdade = 0
        for (l in listaIdades.indices) {
            totIdade += listaIdades[l]
        }
        val mediaIda = totIdade / cdastPerson
        println("A media das idades das pessoas foram: $mediaIda")
    }


}