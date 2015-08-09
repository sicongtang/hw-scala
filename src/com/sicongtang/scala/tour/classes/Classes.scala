package com.sicongtang.scala.tour.classes

/**
 * @author BobbyTang
 */
object Classes {
  def main(args: Array[String]): Unit = {
    val pt = new Point(1, 2)
    println(pt)
    pt.move(10, 10)
    println(pt)
  }
}