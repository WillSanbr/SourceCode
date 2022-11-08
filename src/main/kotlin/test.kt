fun main() {

    val password = "dsssx"

    if(password.contains("x@") && password.length > 8){
        println("Senha segura")
    }else{
        println("Nao segura")
    }

    val result = somarN(5,6)
    println("O resultado é $result")


}


fun somarN(a: Int, b: Int): Int = a + b


