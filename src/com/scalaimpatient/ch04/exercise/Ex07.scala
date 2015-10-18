package com.scalaimpatient.ch04.exercise

import scala.collection.JavaConversions.propertiesAsScalaMap
/**
 * Print a table of all Java properties, like this:
 * You need to find the length of the longest key before you can print the table.
 * @author BobbyTang
 */
object Ex07 {
  def main(args: Array[String]): Unit = {
    val props: scala.collection.Map[String, String] = System.getProperties()
    val maxLengthKey = props.keySet.toList.maxBy(_ size)
    println(maxLengthKey)

    for ((k, v) <- props) {
      println(k + " " * ((maxLengthKey size) - (k size)) + " | " + v)
    }
  }
}