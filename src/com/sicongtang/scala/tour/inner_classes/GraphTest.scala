package com.sicongtang.scala.tour.inner_classes

/**
 * @author BobbyTang
 */
object GraphTest {
  def main(args: Array[String]): Unit = {
    val g = new Graph
    val n1 = g.newNode
    val n2 = g.newNode
    val n3 = g.newNode
    n1.connectTo(n2)
    n3.connectTo(n1)
    
  }
}