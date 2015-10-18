package com.scalaimpatient.ch12_highorder_func.exercise

/**
 * Implement the factorial function using to and reduceLeft, without a loop or recursion.
 * @author BobbyTang
 */
object Ex03 {

  def factorial(num: Int) = {
    (1 to num).reduceLeft(_ * _)
  }

  def main(args: Array[String]): Unit = {
    println(Array(1, 2, 3, 4).reduceLeft(_ * _))
    println(factorial(4))
  }
}