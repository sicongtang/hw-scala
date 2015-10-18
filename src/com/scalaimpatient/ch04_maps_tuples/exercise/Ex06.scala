package com.scalaimpatient.ch04_maps_tuples.exercise

import java.util.Calendar

import scala.collection.mutable.LinkedHashMap

/**
 * Define a linked hash map that maps "Monday" to java.util.Calendar.MONDAY, and similarly for the other weekdays.
 * Demonstrate that the elements are visited in insertion order.
 * @author BobbyTang
 */
object Ex06 {
  def main(args: Array[String]): Unit = {
    val linkedHashMap = LinkedHashMap[String, Int]()
    linkedHashMap += ("Monday" -> Calendar.MONDAY)
    linkedHashMap += ("Tuesday" -> Calendar.TUESDAY)
    linkedHashMap += ("Wednesday" -> Calendar.WEDNESDAY)
    
    println(linkedHashMap)
  }
}