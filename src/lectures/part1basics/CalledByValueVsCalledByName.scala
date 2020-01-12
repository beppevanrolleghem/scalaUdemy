package lectures.part1basics

object CalledByValueVsCalledByName extends App {

  def calledByValue(x: Long) : Unit = { //value at time of passing as var
    println("by value: " + x)
    println("by value: " + x)

  }

  def calledByName(x: => Long):Unit = { //value at time of use in code, easier way to understand is x is a function that returns a long.
    println("by name: " + x)
    println("by name: " + x)

  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())
  //


  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int): Unit = {
    println(x)
  }


  printFirst(34, infinite()) //infinite is never resolved here
  printFirst(infinite(), 34)

}
