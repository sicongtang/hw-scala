package com.scalaimpatient.ch3.exercise

/**
 * Write a code snippet that produces all values from an array with duplicates removed. (Hint: Look at Scaladoc.)
 * @author BobbyTang
 */
object Ex07 {
  def main(args: Array[String]): Unit = {
    val arr = Array(12, 32, 12, 32, 12, 31, 21, 31)
    println(arr.distinct.toList)
  }
}