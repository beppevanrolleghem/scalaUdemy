package exercises

abstract class MyList (val ints : Array[Int]) {

  def head: Int = ints(0)

  def tail = (ints.slice(1,ints.length))

  def isEmpty: Boolean = ints.length == 0

  def add(i: Int):Array[Int] = ints :+ i

  override def toString: String = {
    loop(ints, "(") + ")"
  }

  private def loop(rest: Array[Int], acc: String): String = {
    if (rest.length != 1) return acc
    else {
      loop(rest.slice(1,rest.length) , acc + s"${rest.head}")
    }

  }
  /*
  implement collection
  single linked list holds int's
  head = first element of list
  tail = remainder of the list
  isEmpty = boolean
  add(int) => new List with element added
  override toString => a string representation of the list
   */
}

//i'm an idiot

abstract class TrueList {
  def head: Int
  def tail: TrueList
  def isEmpty: Boolean
  def add(element: Int): TrueList

  //polymorphic
  def printElements: String

  override def toString: String = s"[$printElements]"
}

object Empty extends TrueList {
  override def head: Int = throw new NoSuchElementException

  override def tail: TrueList = throw new NoSuchElementException

  override def isEmpty: Boolean = true

  override def add(element: Int): TrueList = new Cons(element, Empty)

  override def printElements: String = ""
}


class Cons(h: Int, t: TrueList) extends TrueList {
  override def head: Int = h

  override def tail: TrueList = t

  override def isEmpty: Boolean = false

  override def add(element: Int): TrueList = new Cons(element, this)

  override def printElements: String = if (t.isEmpty) "" + h else s"$h ${t.printElements}"
}



object ListTest extends App {
  val list = new Cons(1, new Cons(2, new Cons(3, Empty)))
  println(list.tail.head)
  println(list.add(4).head)
  println(list.isEmpty)

  println(list.toString)
}