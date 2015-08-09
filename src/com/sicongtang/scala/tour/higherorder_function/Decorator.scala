package com.sicongtang.scala.tour.higherorder_function

/**
 * @author BobbyTang
 */
class Decorator(left: String, right: String) {
  def layout[A](x: A) = left + x.toString() + right
}
object FunTest {
  def apply(f: Int => String, v: Int) = f(v)

  def main(args: Array[String]): Unit = {
    val decorator = new Decorator("[", "]")
    println(apply(decorator.layout, 7))
  }
}