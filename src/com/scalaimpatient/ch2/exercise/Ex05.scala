package com.scalaimpatient.ch2.exercise

/**
 * 5. Write a procedure countdown(n: Int) that prints the numbers from n to 0.
 * @author BobbyTang
 */
object Ex05 {
  def countdown(n: Int) {
    for (i <- n to (0, -1)) {
      println(i)
    }
  }

  def main(args: Array[String]): Unit = {
    countdown(10)
  }
}