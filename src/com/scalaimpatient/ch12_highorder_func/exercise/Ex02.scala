package com.scalaimpatient.ch12_highorder_func.exercise

/**
 * How do you get the largest element of an array with reduceLeft?
 * @author BobbyTang
 */
object Ex02 {

  def main(args: Array[String]): Unit = {
    val array = Array(34, 234, 234, 1, 23, 4, 1234, 1254, 34, 3, 4)
    val max = array.reduceLeft((x, y) => if (x >= y) x else y)
    println(max)
  }

}