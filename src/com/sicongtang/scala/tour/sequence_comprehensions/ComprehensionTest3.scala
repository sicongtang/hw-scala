package com.sicongtang.scala.tour.sequence_comprehensions

/**
 * @author BobbyTang
 */
object ComprehensionTest3 {
  def main(args: Array[String]): Unit = {
    for (
      i <- Iterator.range(0, 20);
      j <- Iterator.range(i, 20) if i + j == 32
    ) println("(" + i + ", " + j + ")")

  }
}