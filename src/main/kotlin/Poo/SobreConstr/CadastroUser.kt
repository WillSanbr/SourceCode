package Poo.SobreConstr

class CadastroUser(var name: String, var tef: String, var rua: String) {

    constructor(name: String, tef: String) : this(name, tef, "(Endereço nao informado)")

    fun exibirUsuario() {
        val msg = """
            O nome da pessoa : $name
            Endereço : $rua
            Telefone : $tef
        """.trimIndent()
        println(msg)
    }

}


