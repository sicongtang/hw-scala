package com.sicongtang.scala.tour.local_type_inference

/**
 * @author BobbyTang
 */
object InferenceTest1 {
  def main(args: Array[String]): Unit = {
    val x = 1 + 2 * 3 // the type of x is Int
    val y = x.toString() // the type of y is String
    def succ(x: Int) = x + 1 // method succ returns Int values
  }
}