package com.scalaimpatient.ch03.exercise

/**
 * 5. How do you compute the average of an Array[Double]?
 * @author BobbyTang
 */
object Ex05 {
  def computeAvg(arr: Array[Double]) = {
    arr.sum / arr.length
  }

  def main(args: Array[String]): Unit = {
    val dbl = Array(0.5, 1.2, 3.7, 4.1, 2.2)
    println(computeAvg(dbl))
  }
}