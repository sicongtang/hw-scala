package com.sicongtang.scala.tour.sequence_comprehensions

/**
 * @author BobbyTang
 */
object ComprehensionTest1 {
  def even(from: Int, to: Int): List[Int] =
    for (i <- List.range(from, to) if i % 2 == 0) yield i
    
  def main(args: Array[String]): Unit = {
    Console.println(even(0, 20))
  }
}