package com.scalaimpatient.ch3.exercise

/**
 * Repeat the preceding assignment, but produce a new array with the swapped values. Use for/yield.
 * @author BobbyTang
 */
object Ex03 {
  def swapPairsInPlace(arr: Array[Int]) = {
    (for (i <- 0 until arr.length)
      yield if (i == arr.length - 1 & i % 2 == 0) arr(i) else if (i % 2 == 0) arr(i + 1) else arr(i - 1)).toArray
  }

  def main(args: Array[String]): Unit = {
    println(swapPairsInPlace(Array(1, 2, 3, 4, 5)).toList)
    println(swapPairsInPlace(Array(1, 2, 3, 4, 5, 6)).toList)
  }

}