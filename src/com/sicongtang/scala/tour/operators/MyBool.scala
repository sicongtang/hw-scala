package com.sicongtang.scala.tour.operators

/**
 * Any method which takes a single parameter can be used as an infix operator in Scala.
 *
 * @author BobbyTang
 */
class MyBool(x: Boolean) {
  def and(that: MyBool): MyBool = if (x) that else this
  def or(that: MyBool): MyBool = if (x) this else that
  def negate: MyBool = new MyBool(!x)

  def not(x: MyBool) = x negate; // semicolon required here
  def xor(x: MyBool, y: MyBool) = (x or y) and not(x and y)

  def not2(x: MyBool) = x.negate; // semicolon required here
  def xor2(x: MyBool, y: MyBool) = x.or(y).and(x.and(y).negate)
}

object MyBoolTest {
  def main(args: Array[String]): Unit = {
    val b = new MyBool(true)
  }
}