package lectures.part1basics


import scala.annotation.tailrec

object DefaultArgs extends App {

  @tailrec //acc standard 1
  def trFact(n: Int, acc: Int = 1): Int = {
    if (n<=1) acc
    else trFact(n-1, n*acc)
  }

  val fact10 = trFact(10)
  val fact210 = trFact(10,2)


  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")



  savePicture(width=200,format="bmp")








}
