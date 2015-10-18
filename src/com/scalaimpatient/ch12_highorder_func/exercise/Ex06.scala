package com.scalaimpatient.ch12_highorder_func.exercise

/**
 * Modify the previous function to return the input at which the output is largest.
 * For example, largestAt(x => 10 * x - x * x, 1 to 10) should return 5.
 * Don’t use a loop or recursion.
 * @author BobbyTang
 */
object Ex06 {

  def largestAt(fun: (Int) => Int, inputs: Seq[Int]) = {
    inputs.map(x => (x, fun(x))).reduceLeft((a, b) => if (a._2 >= b._2) a else b)._1
  }

  def main(args: Array[String]): Unit = {
    println(largestAt(x => 10 * x - x * x, 1 to 10))
  }
}