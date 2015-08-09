package com.sicongtang.scala.tour.pattern_matching

/**
 * @author BobbyTang
 */
object MatchTest2 {
  def matchTest(x: Any): Any = x match {
    case 1      => "one"
    case "two"  => 2
    case y: Int => "scala.Int"
  }

  def main(args: Array[String]): Unit = {
    println(matchTest(1))
    println(matchTest("two"))
    println(matchTest(3))
    println(matchTest(3.111))
  }

}