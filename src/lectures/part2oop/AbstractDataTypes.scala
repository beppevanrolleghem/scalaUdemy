package lectures.part2oop

object AbstractDataTypes extends App {

  // abstract
  abstract class Animal {
    val creatureType: String = "wild"
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"

    def eat: Unit = println("crunch crunch")
  }


  // traits
  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferedMeal: String = "fresh meat"
  }


  trait ColdBlooded
  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "croc"

    override def eat: Unit = println("nomnomnom")

    override def eat(animal: Animal): Unit = println(s"i'm a croc and i'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)




  // traits vs abstract classes

  // 1 traits do not have constructor parameters

  // 2 can only extend 1 class, but can extend multiple traits (same class)

  // 3 traits are meant to describe behavior, abstract class describes a thing

}
