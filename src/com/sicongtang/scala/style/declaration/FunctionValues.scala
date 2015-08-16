package com.sicongtang.scala.style.declaration

/**
 * @author BobbyTang
 */
object FunctionValues {
  def main(args: Array[String]): Unit = {
    val f1 = ((a: Int, b: Int) => a + b) //preferred
    val f2 = (a: Int, b: Int) => a + b
    val f3 = (_: Int) + (_: Int)
    val f4: (Int, Int) => Int = (_ + _) //preferred
  }
}