package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x = 42
  println(x)
  //VALS ARE IMMUTABLE cant change after set
  //val types are optional (compiler can infer types)

  val aString: String = "hello"
  println(aString); val twoString: String = "semicolons are to seperate statements, but not necessary"


  val aBoolean: Boolean = true

  var aChar: Char = 'q'
  val anInt: Int = aChar
  val aShort: Short = 495
  val aLong: Long = 394198431432809L
  val aFloat: Float = 2.02f
  val aDouble: Double = 3.1415
  // variables
  var aVariable:  Int = 4
  aVariable += 2
  aVariable = 5 //side effects? prolly some functional shit

//prefer vals over vars

}
