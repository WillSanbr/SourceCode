package FuncaoSalarioProgFunc

fun main() {

    executeCalc(1250.0, 100, ::aumento)
    executeCalc(1250.0, 5, ::diminuir)


}


fun executeCalc(salary: Double, porc: Int, ope: (Double, Int) -> Double) {
    try {
        val calcSalary = calcSalary(salary = salary, porc = porc, reajuste = ope)
        println(calcSalary)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}


fun calcSalary(salary: Double, porc: Int, reajuste: (Double, Int) -> Double): String {
    val totSalary = reajuste(salary, porc)
    var message: String
    if (porc >= 40) {
        throw IllegalArgumentException("Reajuste muito Alto!!!")
    } else {
        if (totSalary > salary) {
            message = "O salario do funcionario aumento para R$${String.format("%.2f", totSalary)}"
        } else {
            message = "O salario do funcionario diminuiu para R$${String.format("%.2f", totSalary)}"
        }
    }
    return message
}


fun aumento(salary: Double, porc: Int): Double {
    return salary + (salary * (porc.toDouble() / 100.0))
}

fun diminuir(salary: Double, porc: Int): Double {
    return salary - (salary * (porc.toDouble() / 100.0))
}









