package Poo.BancoFinanceiro

//Construtor Primario
class Banco(var name: String, var age: Int) {

    private var extrato = 0.0
    private var status = true

    // Construtor Secundario (Sobrecarga de Construtores)
    constructor(name: String, age: Int, isAdmin: Boolean) : this(name, age) {
        this.status = isAdmin
        println("Nao Pode ser aberto a conta devido status esta offiline")
    }

    fun abrirConta() {
        if ((age >= 18) && (this.status)) {
            println("O Cliente $name abriu conta no Banco WillBank ")
            mostraInfConta()
        } else {
            status = false
            println("Conta nao pode ser aberta!!! Devido ser menor de idade ")
        }
    }

    private fun verfAberOuFec(): String {
        var verf = ""
        if (status) verf = "Aberta" else verf = "Fechada"
        return verf
    }

    fun mostraInfConta() {
        val msgInf = """
            =================================================
             Dono da conta: $name
             Extrato: R$${String.format("%.2f", extrato)}
             Status da conta: ${verfAberOuFec()} 
            ================================================= 
         """.trimIndent()
        println(msgInf)
        println()
    }

    fun depositar(walletCont: Double = 0.0) {
        if ((walletCont > 0.0) && (this.status)) {
            this.extrato = walletCont
            println(String.format("Foi depositado na sua conta R$%.2f", extrato))
        } else if ((walletCont <= 0.0) && (this.status)) {
            println("Deposito nao foi realizado devido nao foi inserido dinheiro!!!")
        } else {
            println("O deposito nao foi realizado devido a conta nao esta aberta!!!")
        }
    }

    fun sacar(walletCont: Double) {
        val verfWallet = this.extrato - walletCont
        if ((verfWallet > 0.0) && (this.status)) {
            println("Saque realizado com sucesso!!!")
        } else if ((verfWallet <= 0.0) && (this.status)) {
            println("Nao tem dinheiro para realizar saque R$$extrato")
        } else {
            println("A conta nao esta aberta")
        }
    }
}