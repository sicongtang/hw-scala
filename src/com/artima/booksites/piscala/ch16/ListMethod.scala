package com.artima.booksites.piscala.ch16

/**
 * @author BobbyTang
 */
object ListMethod {
  def main(args: Array[String]): Unit = {
    println(List.apply(1, 2, 3)) // List(1,2,3)
    println(List.range(1, 10, 2))
    println(List.range(10, 1, -2))
    println(List.fill(5, 2)("a")) // http://docs.scala-lang.org/style/declarations.html - Multiple Parameter Lists
    println(List.tabulate(5)(n => n * n))
    println(List.tabulate(5, 5)(_ * _))
    println(List.concat(List('a'), List('c')))
    println(List.concat(List('a'), List(1)))
    println(List.concat())

  }

}