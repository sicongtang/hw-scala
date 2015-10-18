package com.scalaimpatient.ch12_highorder_func.exercise

/**
 *
 * 8. In Section 12.8, “Currying,” on page 149, you saw the corresponds method used with two arrays of strings.
 * Make a call to corresponds that checks whether the elements in an array of strings have the lengths given in an array of integers.
 *
 * @author BobbyTang
 */
object Ex08 {
  def areStringLengthCorresponding(strings: Seq[String], lengths: Seq[Int]) = {
    strings.corresponds(lengths)(_.length == _)
  }

  def main(args: Array[String]): Unit = {
  }

}