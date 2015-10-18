package com.scalaimpatient.ch12_highorder_func.exercise

/**
 * The previous implementation needed a special case when n < 1. Show how you can avoid this with foldLeft.
 * (Look at the Scaladoc for foldLeft. It’s like reduceLeft, except that the first value in the chain of combined values is supplied in the call.)
 * @author BobbyTang
 */
object Ex04 {
  def factorial(num :Int) = {
    (1 to num).foldLeft(1)(_ * _)  
  }
  
  def main(args: Array[String]): Unit = {
    println(factorial(1))
    println(factorial(2))
    println(factorial(3))
  }
  
}