package Poo

import kotlin.random.Random

fun main() {

  val agendaD1 = Agendamento()
  agendaD1.marcarConsulta()
  agendaD1.marcarConsulta()

}

 class Cliente() {

    var name = ""
    private var cpf = ""
    private var telefone = ""
    private var endereco: String? = "(Desconhecido)" //conceito nullable

    fun cadastrarUser() {
        print("Nome do Paciente: ")
        name = readln()

        print("Cpf Paciente: ")
        cpf = readln()

        print("Telefone: ")
        telefone = readln()

        println(
            "Deseja informar a Rua \n" +
                    "sim: s nao: n"
        )
        val escInf = readln()[0]
        val opcioAndress = validacaoEnd(escInf)
        endereco = opcioAndress

    }

    fun exibirInfCliente(): String {
        val msg = """
            O nome do paciente: $name
            Cpf: $cpf
            Telefone: $telefone
            Endereço: $endereco
        """.trimIndent()
        return msg
    }

    private fun validacaoEnd(vl: Char): String {
        if (vl == 's') {
            println("Seleciona o seu endereço: ")
            endereco = readln()
        } else {
            endereco
        }
        return endereco.toString()
    }

}

open class Agendamento {
    private var c1 = Cliente()

    fun marcarConsulta(){
        c1.cadastrarUser()
        val sortDay = Random.nextInt(32)
        val sortMes = Random.nextInt(13)
        val infCliente = c1.exibirInfCliente()
        println("$infCliente ")
        println("O passiente ${c1.name} foi marcado $sortDay/$sortMes/2023")
    }
}




