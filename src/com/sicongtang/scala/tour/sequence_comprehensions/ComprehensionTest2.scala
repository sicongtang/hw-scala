package com.sicongtang.scala.tour.sequence_comprehensions

/**
 * @author BobbyTang
 */
object ComprehensionTest2 {
  def foo(n: Int, v: Int) =
    for (
      i <- 0 until n;
      j <- i until n if i + j == v
    ) yield Pair(i, j);

  def main(args: Array[String]): Unit = {
    foo(20, 32) foreach {
      case (i, j) =>
        println("(" + i + ", " + j + ")")
    }
  }
}