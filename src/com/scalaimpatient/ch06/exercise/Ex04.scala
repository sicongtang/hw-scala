package com.scalaimpatient.ch06.exercise

/**
 * Define a Point class with a companion object so that you can construct Point instances as Point(3, 4), without using new.
 *  @author BobbyTang
 */
object Ex04 {
  class Point(x: Int, y: Int) extends java.awt.Point(x, y)

  object Point {
    def apply(x: Int, y: Int) = new Point(x, y)
  }

  def main(args: Array[String]): Unit = {
    val p = Point(1, 2)
  }
}