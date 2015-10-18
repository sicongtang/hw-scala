package com.scalaimpatient.ch03.exercise

/**
 * 2. Write a loop that swaps adjacent elements of an array of integers. For example, Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
 * @author BobbyTang
 */
object Ex02 {

  def swapPairsInPlace(arr: Array[Int]) = {
    for (i <- 0 until (if (arr.length % 2 == 0) arr.length else arr.length - 1, 2)) {
      val t = arr(i)
      arr(i) = arr(i + 1)
      arr(i + 1) = t
    }
    arr
  }

  def main(args: Array[String]): Unit = {
    println(swapPairsInPlace(Array(1, 2, 3, 4, 5)).toList)
    println(swapPairsInPlace(Array(1, 2, 3, 4, 5, 6)).toList)
  }
}