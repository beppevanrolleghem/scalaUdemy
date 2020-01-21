package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {


  def factorial(n: Int): Int ={
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("computed factorial of " + n)
      result
    }
  }

  println(factorial(10))
  //println(factorial(5000))


  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x-1, x * accumulator) //recursion on last line is better for performance
    }

    factHelper(n, 1)
  }
    //tail recursion = use recursive call as last expression, less expensive on stack
  println(anotherFactorial(10))
  println(anotherFactorial(5000))

  // when you need loops, use tail recursion


  //concat a string n times using tail recursion

  @tailrec
  def aRepeatedFunction(aString: String, n: Int, accumulator: String) : String = {
    if (n <= 1) accumulator
    else aRepeatedFunction(aString, n-1, accumulator + aString)
  }

  println(aRepeatedFunction("beppe",5,""))



  //isprime tail recursive

  def isPrime(n: Int) : Boolean = {
    @tailrec
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

  println(isPrime(2003))

  //fibonacci function tail recursive
  def fib(n: Int): Int = {
    @tailrec
    def fibo(i: Int, acc: Int, acc2: Int): Int = {
      if (i >= n) acc
      else fibo(i+1, acc + acc2, acc)
    }
    if (n <= 2) 1
    else fibo(2, 1, 1)
  }
  println(fib(8))


}
