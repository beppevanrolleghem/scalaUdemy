package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int) = {
    a + " " + b
  }


  println(aFunction("hello", 3))
  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)


  def aRepeatedFunction(aString: String, n: Int) : String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 5))
  // we loop using recursion

  def aFunctionWithSideEffects(aString: String): Unit = {
    println(aString)
  }

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n-1)
  }




  // greeting function (name, age) => "Hi, my name is name, and i am age years old"

  def greeting(name: String, age: Int) = "Hi, my name is " + name + ", and i am " + age + " years old"

  greeting("beppe", 22)

  //factorial function 1 * 2 * 3 * .. * n

  def fact(n: Int): Int = {
    if (n == 1) n
    else n * fact(n-1)
  }

  println(fact(5))

  // a fibonacci function f(1) = 1 f(2) = 1

  def feb(n: Int): Int = {
    if (n <= 2) 1
    else feb(n-1) + feb(n-2)
  }

  println(feb(8))


  // check Prime

  def isPrime(n: Int) : Boolean = {
    def checkNum(m: Int) : Int = {
      if (m <= 1) throw IsPrimeException()
      if (n % m == 0 && m != 1) throw IsNotPrimeException(m + "")
      else checkNum(m-1)
    }
    try {
      checkNum(n-1)
    } catch {
      case int: IsPrimeException => return true
      case ex: IsNotPrimeException => return false
    }
    true
  }
  println(isPrime(1))
  println(isPrime(5))
  println(isPrime(4))
  println(isPrime(3))
  println(isPrime(7))
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))


}

case class IsPrimeException() extends Throwable

case class IsNotPrimeException(str: String) extends Throwable
