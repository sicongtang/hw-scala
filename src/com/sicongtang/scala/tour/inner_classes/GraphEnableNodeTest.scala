package com.sicongtang.scala.tour.inner_classes

/**
 * @author BobbyTang
 */
object GraphEnableNodeTest {
  def main(args: Array[String]): Unit = {
    val g: GraphEnableNode = new GraphEnableNode
    val n1: g.Node = g.newNode
    val n2: g.Node = g.newNode
    n1.connectTo(n2) // legal
    val h: GraphEnableNode = new GraphEnableNode
    val n3: h.Node = h.newNode
    n1.connectTo(n3) // illegal!
  }
}