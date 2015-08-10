package com.sicongtang.scala.tour.polymorphic_methods

/**
 * @author BobbyTang
 */
object PolyTest {
  def dup[T](x: T, n: Int): List[T] =
    if (n == 0)
      Nil
    else
      x :: dup(x, n - 1)

  def main(args: Array[String]): Unit = {
    println(dup[Int](3, 4))
    println(dup("three", 3)) //The type system of Scala can infer such types. 
  }
}