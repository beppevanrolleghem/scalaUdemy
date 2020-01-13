package lectures.part2oop

object OOBasics extends App {

  val person = new Person("Beppe",23)
  println(person.age)
  println(person.x)
  person.greet()
  person.greet("Fred")

}


class NoFieldPerson(name: String, age: Int)

// class parameters != fields

class fieldPerson(name: String, val age: Int) //person.age not accessible, fieldPerson.age is accessible

class Person(name: String, val age: Int) {
  //body
  val x = 2
  println(1 + 3)

  //this, fields etc...
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")


  //overload
  def greet(): Unit = println(s"Hi, I am $name")

  //multiple constructors
  //new constructor calls original constructor here
  //means only usable for easyer default constructors, which can be easily fixed by using default parameters
  def this(name: String) = this(name, 0)


}