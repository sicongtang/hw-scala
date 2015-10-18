package com.scalaimpatient.ch04.exercise

/**
 * Write a function minmax(values: Array[Int]) that returns a pair containing the smallest and largest values in the array.
 * @author BobbyTang
 */
object Ex08 {

  def minmax(values: Array[Int]) = {
    (values min, values max)
  }

  def main(args: Array[String]): Unit = {
    val ary = Array(123, 24, 3, 435, 235, 1235, 23, 3, 21)
    println(minmax(ary))
  }
}