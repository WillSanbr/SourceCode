fun main() {

    println(
        "===========================\n" +
                "\tCadastro de login\n" +
                "==========================="
    )
    println("Seleciona nome de usuario: ")
    val userCliente = readln()

    println("Seleciona sua senha: ")
    val password = readln()

    crud(userCliente, password)

}

fun crud(us: String, pw: String) {

    var userSys = arrayListOf<String>()
    var userpaswd = arrayListOf<String>()

    //funcao cadastra
    fun cadastraPes(): String {
        userSys.add(us)
        userpaswd.add(pw)
        return "O usuario ${userSys.get(0)} cadastrado com sucesso!!!!!"
    }

    println(cadastraPes())

    //funcao loga usuario
    fun loginIn(): String {
        println("Digite o login: ")
        val userLog = readln()

        println("Digite a sua senha: ")
        val paswSyst = readln()

        var validacao = ""

        if ((userLog == userSys[0]) && (paswSyst == userpaswd[0])) {
            validacao = "logado com sucesso!!!".toUpperCase()
        } else {
            validacao = "Informação incorreta"
        }
        return validacao
    }

    //altera login do usuario
    fun alterLogin() {
        println(
            "=======================\n" +
                    "selecionar: \n" +
                    "digite 1: troca nome de usuario\n" +
                    "digite 2: troca senha\n" +
                    "======================="
        )
        val escLog = readln().toInt()

        //remove as informaçoes das listas
        when (escLog) {
            1 -> userSys.removeAt(0)
            2 -> userpaswd.removeAt(0)
            else -> println("informacao invalida")
        }
        if (escLog == 1) {
            println("Qual nome voce deseja alterar")
            val altName = readln()
            userSys.add(0, altName)
            println("O seu nome de usuario foi alterado para ${userSys[0]}")
        } else if (escLog == 2) {
            println("Qual senha voce deseja alterar?")
            val altpassw = readln()
            userpaswd.add(0, altpassw)
            println("O seu nome de usuario foi alterado para ${userpaswd[0]}")
        }
    }

    fun removerLogin() {
        print("A sua conta foi deletada!!!!")
        userSys.clear()
        userpaswd.clear()
    }

    fun menuControle() {

        println(
            "===============================\n" +
                    "digite 1: logar\n" +
                    "digite 2: Alterar Login\n" +
                    "digite 3: Remover\n" +
                    "==============================="
        )
        val mCont = readln().toInt()

        when (mCont) {
            1 -> println(loginIn())//retorna string
            2 -> alterLogin()
            3 -> removerLogin()
        }
    }
     menuControle()
}




