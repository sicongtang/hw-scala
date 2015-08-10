package com.sicongtang.scala.tour.auto_typedependent_closure_construction

/**
 * @author BobbyTang
 */
object TargetTest1 {
  def whileLoop(cond: => Boolean)(body: => Unit): Unit =
    if (cond) {
      body
      whileLoop(cond)(body)
    }

  def main(args: Array[String]): Unit = {
    var i = 10
    whileLoop(i > 0) {
      println(i)
      i -= 1
    }
  }
}