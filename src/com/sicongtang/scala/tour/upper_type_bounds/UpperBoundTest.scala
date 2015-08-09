package com.sicongtang.scala.tour.upper_type_bounds

/**
 * @author BobbyTang
 */
trait Similar {
  def isSimilar(x: Any): Boolean
}
case class MyInt(x: Int) extends Similar {
  def isSimilar(m: Any): Boolean =
    m.isInstanceOf[MyInt] &&
      m.asInstanceOf[MyInt].x == x
}
object UpperBoundTest {
  def findSimilar[T <: Similar](e: T, xs: List[T]): Boolean =
    if (xs.isEmpty) false
    else if (e.isSimilar(xs.head)) true
    else findSimilar[T](e, xs.tail)

  def main(args: Array[String]): Unit = {
    val list: List[MyInt] = List(MyInt(1), MyInt(2), MyInt(3))
    println(findSimilar[MyInt](MyInt(4), list))
    println(findSimilar[MyInt](MyInt(2), list))

  }
}