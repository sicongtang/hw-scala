package com.sicongtang.scala.tour.inner_classes

/**
 * @author BobbyTang
 */
object IllegalGraphTest {
  def main(args: Array[String]): Unit = {
    val g: Graph = new Graph
    val n1: g.Node = g.newNode
    val n2: g.Node = g.newNode
    n1.connectTo(n2) // legal
    val h: Graph = new Graph
    val n3: h.Node = h.newNode
    //n1.connectTo(n3) // illegal!
  }
}