package exercises

object ooExcercises extends App {




  // novel and a writer class
  // writer: first name, surname, year of birth
  // =method full name
  // novel: name, year of release, author
  // -method authorAge (age at year of release), isWrittenBy(author), copy(new year of release) = new instance of Novel with new year of release

  val au1 = new writer("beppe", "vanrolleghem", 1996)
  val au2 = new writer("beppe2", "vanrolleghem2", 1997)
  val nov1 = new novel("somebook",2004,au1)
  println(nov1.isWrittenBy(au2))
  println(au1.fullName())
  println(nov1.authorAge())
  val nov2 = nov1.copy(2020)
  println(nov2.authorAge())



  // counter class
  // receives an int value
  // method returns current count
  //method to increment/decrement => new Counter
  //overload inc/dec to receive an amount = new counter


  var c = new counter(5)
  println(c.currentCount())
  c = c.increment()
  c = c.increment()
  println(c.currentCount())
  println(c.decrement(3).currentCount())


}





class writer(firstName: String, surName: String, val yearOfBirth: Int) {
  def fullName(): String = s"$firstName $surName"

}

class novel(name: String, yearOfRelease: Int, author: writer) {
  def authorAge(): Int = yearOfRelease - author.yearOfBirth
  def isWrittenBy(author: writer): Boolean = this.author == author
  def copy (newYearOfRelease: Int): novel = new novel(name, newYearOfRelease, author)
}



class counter(i: Int) {
  def currentCount(): Int = i
  def increment(): counter = new counter(i+1)
  def decrement(): counter = new counter(i-1)
  def increment(in: Int): counter = new counter(i+in)
  def decrement(de: Int): counter = new counter(i-de)
}
