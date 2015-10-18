package com.scalaimpatient.ch03.exercise

import scala.util.Random

/**
 * Write a code snippet that sets a to an array of n random integers between 0 (inclusive) and n (exclusive).
 * @author BobbyTang
 */
object Ex01 {

  def randomInts(n: Int) = {
    for (i <- 0 until n) yield Random.nextInt(n)
  }

  def main(args: Array[String]): Unit = {
    println(randomInts(5))
  }
}