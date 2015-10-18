package com.scalaimpatient.ch12_highorder_func.exercise

/**
 * Write a function largest(fun: (Int) => Int, inputs: Seq[Int]) that yields the largest value of a function within a given sequence of inputs.
 * For example, largest(x => 10 * x - x * x, 1 to 10) should return 25. Don’t use a loop or recursion.
 *
 * @author BobbyTang
 */
object Ex05 {
  def max(inputs: Seq[Int]) = {
    inputs.reduceLeft((a, b) => if (a >= b) a else b)
  }

  def largest(fun: (Int) => Int, inputs: Seq[Int]) = {
    max(inputs.map(fun(_)))
  }

  def main(args: Array[String]): Unit = {
    println(largest(x => 10 * x - x * x, 1 to 10))
  }
}