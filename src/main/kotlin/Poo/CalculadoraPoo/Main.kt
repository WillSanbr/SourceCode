package Poo.CalculadoraPoo


fun main() {

   val user1 = User("Maria")
   val calc = Calculator()
   println(user1.escolheu())
   println(calc.fazerOperacao())

   val user2 = User("Joao")
   val calc2 = Calculator(64.0,2.0f)
   println(user2.escolheu())

   val user3 = User("Patricia")
   val calc3 = Calculator(7.0,6.3)
   println(user3.escolheu(7.0,6.3))
   println(calc3.fazerOperacao())




}