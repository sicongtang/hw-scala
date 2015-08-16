package com.sicongtang.scala.style.declaration

/**
 * @author BobbyTang
 */
object MultiExpressionFunction {
  def main(args: Array[String]): Unit = {
    // Parameters should be on the same line as the opening brace
    val f1 = { (a: Int, b: Int) =>
      val sum = a + b
      sum
    }
  }
}