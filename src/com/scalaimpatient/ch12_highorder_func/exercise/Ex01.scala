package com.scalaimpatient.ch12_highorder_func.exercise

/**
 * Write a function values(fun: (Int) => Int, low: Int, high: Int) that yields a collection of function inputs and outputs in a given range.
 * For example, values(x => x * x, -5, 5) should produce a collection of pairs (-5, 25), (-4, 16), (-3, 9), . . ., (5, 25)
 */
object Ex01 {

  def values(fun: (Int) => Int, low: Int, high: Int) = {
    for (i <- low to high ) yield (i, fun(i).abs)
  }

  def main(args: Array[String]): Unit = {
    val result = values(x => x * x, -5, 5)
    println(result)
  }

}