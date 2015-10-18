package com.scalaimpatient.ch03_arrays.exercise

/**
 * 4. Given an array of integers, produce a new array that contains all positive values of the original array,
 * in their original order, followed by all values that are zero or negative, in their original order.
 * @author BobbyTang
 */
object Ex04 {

  def posThenNeg(arr: Array[Int]) = {
    Array.concat(for (elem <- arr if elem > 0) yield elem, for (elem <- arr if elem <= 0) yield elem)
  }

  def posThenNeg2(arr: Array[Int]) = {
    Array.concat(arr filter { _ > 0 }, arr filter { _ <= 0 })
  }

  def main(args: Array[String]): Unit = {
    println(posThenNeg(Array(123, -35, -45, 45, 4325, -43, 454, -234)).toList)
    println(posThenNeg2(Array(123, -35, -45, 45, 4325, -43, 454, -234)).toList)
  }

}