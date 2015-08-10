package com.sicongtang.scala.tour.minin_class_composition

/**
 * @author BobbyTang
 */
object NamedParameters {
  def printName(first: String = "John", last: String = "Smith") = {
    println(first + " " + last)
  }
  
  def main(args: Array[String]): Unit = {
    printName(last = "Hanks")
  }
}