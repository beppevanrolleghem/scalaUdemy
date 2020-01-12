package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 //this is called an expression
  println(x)
  println(2+3*4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ... side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF Expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF Expression
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // loops are discouraged
  // iteration will be explained later

  // everything is an expression
  // only definitions arent

  val aWeirdValue = (aVariable = 3) // Unit === void

  // since everything is an expression everything has a return value. Everything that is useless (side effects) or has a useless return value is called a unit.
  // this assignemnt for instance returns a unit, i can save that while loop in a var and it will also return a unit


  println(aWeirdValue)


  // Code Blocks

  val aCodeBlock = {
    val y = 2
    val z = y+1
    if (z > 2) "hello" else "goodbye"
  }

  //value of a block is  the value of teh last expression

  println(aCodeBlock)

  // Instructions are executed (think Java), expressions are evaluated(Scala)


}
