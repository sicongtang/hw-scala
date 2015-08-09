package com.sicongtang.scala.tour.singleton_objects

/**
 * @author BobbyTang
 */
class IntPair(val x: Int, val y: Int)
object IntPair {
  import math.Ordering
  implicit def ipord: Ordering[IntPair] =
    Ordering.by(ip => (ip.x, ip.y))

  def main(args: Array[String]): Unit = {
    val p = new IntPair(4, 9)
    println(IntPair.ipord)
  }
}