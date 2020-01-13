package lectures.part2oop

object MethodNotations extends App {


  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = name.reverse
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"


  }


  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom))

  //this functionality is nice, but i will never use it because using a . is way more clear to me

  println(1 + 2)
  println(1.+(2))


  // all operators are methods.
  val x = -1
  val y = 1.unary_-
  println(x == y)

  //unary only works with - + ~ !
  //this on the other hand seems really usefull for certain things
  println(!mary)

  //println(mary isAlive) //postfix notation


  //apply
  println(mary.apply())
  println(mary()) //so apply is kindof a default method


}
