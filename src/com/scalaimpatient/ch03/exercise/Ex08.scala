package com.scalaimpatient.ch03.exercise

/**
 * Rewrite the example at the end of Section 3.4, “Transforming Arrays,” on page 34 using the drop method for dropping the index of the first match.
 *
 * Look the method up in Scaladoc.
 * @author BobbyTang
 */
object Ex08 {
  def main(args: Array[String]): Unit = {
    val arr = Array(12,321,123,123,123)
    println(arr.drop(2).toList)
  }
}