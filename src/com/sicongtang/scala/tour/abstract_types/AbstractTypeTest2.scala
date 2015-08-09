package com.sicongtang.scala.tour.abstract_types

/**
 * @author BobbyTang
 */
abstract class Buffer2[+T] {
  val element: T
}
abstract class SeqBuffer2[U, +T <: Seq[U]] extends Buffer2[T] { // +T <: Seq[U] ---->   T <: Seq[U]
  def length = element.length
}
object AbstractTypeTest2 {
  def newIntSeqBuf(e1: Int, e2: Int): SeqBuffer2[Int, Seq[Int]] = // Seq[Int] ----> List[Int]
    new SeqBuffer2[Int, List[Int]] {
      val element = List(e1, e2)
    }

  def main(args: Array[String]): Unit = {
    val buf = newIntSeqBuf(7, 8)
    println("length = " + buf.length)
    println("content = " + buf.element)
  }
}