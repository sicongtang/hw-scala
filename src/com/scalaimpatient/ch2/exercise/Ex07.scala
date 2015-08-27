package com.scalaimpatient.ch2.exercise

/**
 * Solve the preceding exercise without writing a loop. (Hint: Look at the StringOps Scaladoc.)
 * @author BobbyTang
 */
object Ex07 {
  def main(args: Array[String]): Unit = {
    var prod = 1
    "Hello".foreach { x => prod *= x }
    println(prod)
  }
}