package com.scalaimpatient.ch02.exercise

/**
 * Write a function product(s : String) that computes the product, as described in the preceding exercises.
 * @author BobbyTang
 */
object Ex08 {
  def product(s: String) = {
    var prod = 1
    s.foreach { x => prod *= x }
    prod
  }

  def main(args: Array[String]): Unit = {
    println(product("Hello"))
  }
}