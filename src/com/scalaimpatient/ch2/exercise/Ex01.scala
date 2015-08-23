package com.scalaimpatient.ch2.exercise

/**
 *
 * 1. The signum of a number is 1 if the number is positive, –1 if it is negative, and 0 if it is zero.
 * Write a function that computes this value.
 * @author BobbyTang
 */
object Ex01 {
  def signum(num: Int) = {
    if (num > 0) 1 else if (num < 0) -1 else 0
  }

  def main(args: Array[String]): Unit = {
    println(signum(9))
    println(signum(0))
    println(signum(-9))
  }
}