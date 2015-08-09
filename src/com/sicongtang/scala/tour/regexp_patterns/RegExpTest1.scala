package com.sicongtang.scala.tour.regexp_patterns

/**
 * @author BobbyTang
 */
object RegExpTest1 {
  def containsScala(x: String): Boolean = {
    val z: Seq[Char] = x
    z match {
      case Seq('s', 'c', 'a', 'l', 'a', rest @ _*) =>
        println("rest is " + rest)
        true
      case Seq(_*) =>
        false
    }
  }
  def main(args: Array[String]): Unit = {
    println(RegExpTest1.containsScala("scala345345"))
  }
}