package com.sicongtang.scala.tour.auto_typedependent_closure_construction

/**
 * @author BobbyTang
 */
object TargetTest2 {
  def loop(body: => Unit): LoopUnlessCond =
    new LoopUnlessCond(body)
  protected class LoopUnlessCond(body: => Unit) {
    // Class LoopUnlessCond has a method unless which we can use as a infix operator.
    def unless(cond: => Boolean) {
      body
      if (!cond) unless(cond)
    }
  }

  def main(args: Array[String]): Unit = {
    var i = 10
    loop {
      println("i = " + i)
      i -= 1
    } unless (i == 0)
  }
}