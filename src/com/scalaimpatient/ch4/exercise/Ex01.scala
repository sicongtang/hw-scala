package com.scalaimpatient.ch4.exercise

/**
 * Set up a map of prices for a number of gizmos that you covet.
 * Then produce a second map with the same keys and the prices at a 10 percent discount.
 * @author BobbyTang
 */
object Ex01 {
  def main(args: Array[String]): Unit = {
    val wishlist = Map(
      "thinking in java" -> 55.50,
      "programming in scala" -> 35.50,
      "programming  scala" -> 45.50)
      
    var result = for ((k, v) <- wishlist) yield (k, v * 0.9)
    var result2 = for ((k, v) <- wishlist) yield k -> v * 0.9

    println(result)
    println(result2)
  }
}