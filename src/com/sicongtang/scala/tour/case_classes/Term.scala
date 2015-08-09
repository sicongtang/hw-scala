package com.sicongtang.scala.tour.case_classes

/**
 * @author BobbyTang
 */
abstract class Term
case class Var(name: String) extends Term
case class Fun(arg: String, body: Term) extends Term
case class App(f: Term, v: Term) extends Term

object TermTT {
  def main(args: Array[String]): Unit = {
    val x1 = Var("x")
    val x2 = Var("x")
    val y1 = Var("y")
    println("" + x1 + " == " + x2 + " => " + (x1 == x2))
    println("" + x1 + " == " + y1 + " => " + (x1 == y1))

    println()
    println("====================")

    val f1 = Fun("x", x1)
    val f2 = Fun("x", x2)
    val f3 = Fun("x", y1)
    println("" + f1 + " == " + f2 + " => " + (f1 == f2))
    println("" + f1 + " == " + f3 + " => " + (f1 == f3))
  }
}