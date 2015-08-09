package com.sicongtang.scala.tour.minin_class_composition

/**
 * @author BobbyTang
 */
object StringIteratorTest {
  def main(args: Array[String]) {
    class Iter extends StringIterator(args(0)) with RichIterator
    val iter = new Iter
    iter foreach println
  }
}