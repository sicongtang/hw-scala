package com.sicongtang.scala.tour.extractor_objects

/**
 * @author BobbyTang
 */
object Twice {
  def apply(x: Int): Int = x * 2
  def unapply(z: Int): Option[Int] = if (z % 2 == 0) Some(z / 2) else None
}

object TwiceTest {
  def main(args: Array[String]): Unit = {
    val x = Twice(21) //val x = Twice.apply(21)
    x match { case Twice(n) => Console.println(n) } // Twice.apply(n)
  }
}