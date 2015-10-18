package com.scalaimpatient.ch03_arrays.exercise

import scala.util.Sorting

/**
 * How do you rearrange the elements of an Array[Int] so that they appear in
 * reverse sorted order? How do you do the same with an ArrayBuffer[Int]?
 * @author BobbyTang
 */
object Ex06 {
  def main(args: Array[String]): Unit = {
    var arr = Array(12, 234, 23423, 4234, 3)
    Sorting.quickSort(arr)
    println(arr.reverse.toList)

    var arr2 = Array(12, 234, 23423, 4234, 3)
    val aBuf = arr2.toBuffer
    println(aBuf.sortWith(_ > _))

  }
}