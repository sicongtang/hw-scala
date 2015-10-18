package com.scalaimpatient.ch04_maps_tuples.exercise

/**
 * 9. Write a function lteqgt(values: Array[Int], v: Int) that returns a triple containing the counts of values less than v, equal to v, and greater than v.
 * @author BobbyTang
 */
object Ex09 {

  def letggt(values: Array[Int], v: Int) = {
    (values count (_ < v), values count (_ == v), values count (_ > v))
  }

  def main(args: Array[String]): Unit = {
    val ary = Array(123, 24, 3, 435, 235, 1235, 23, 3, 21)
    println(letggt(ary, 24))
  }
}