package com.sicongtang.scala.tour.case_classes

/**
 * @author BobbyTang
 */
object TermTest {
  def printTerm(term: Term) {
    term match {
      case Var(n) =>
        print(n)
      case Fun(x, b) =>
        print("^" + x + ".")
        printTerm(b)
      case App(f, v) =>
        print("(")
        printTerm(f)
        print(" ")
        printTerm(v)
        print(")")
    }
  }
  def isIdentityFun(term: Term): Boolean = term match {
    case Fun(x, Var(y)) if x == y => true
    case _ => false
  }
  
  def main(args: Array[String]): Unit = {
    val id = Fun("x", Var("x"))
    val id2 = Fun("x", Fun("x", Var("x")));
    val id3 = Fun("x", Var("y"));
    val t = Fun("x", Fun("y", App(Var("x"), Var("y"))))
    printTerm(t)
    println("\n=============")
    println(isIdentityFun(id))
    println(isIdentityFun(id2))
    println(isIdentityFun(id3))
    println(isIdentityFun(t))
  }
}