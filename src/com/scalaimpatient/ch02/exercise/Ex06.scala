package com.scalaimpatient.ch02.exercise

/**
 * 6. Write a for loop for computing the product of the Unicode codes of all letters in a string.
 * For example, the product of the characters in "Hello" is 825152896.
 * @author BobbyTang
 */
object Ex06 {
  def main(args: Array[String]): Unit = {
    var prod: Int = 1
    for (i <- "Hello") {
      prod *= i
    }
    println(prod)
  }
}