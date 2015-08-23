package com.artima.booksites.piscala.ch16

/**
 * @author BobbyTang
 */
object ProcessMultiListTogether {
  def main(args: Array[String]): Unit = {
    println((List(10, 20), List(3, 4, 5)).zipped.map(_ * _))
    println((List("abc", "de"), List(3, 2)).zipped.forall(_.length == _))
    println((List("abc", "de"), List(3, 2)).zipped.exists(_.length != _))
  }
}