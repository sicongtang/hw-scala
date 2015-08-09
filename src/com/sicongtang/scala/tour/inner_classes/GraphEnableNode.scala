package com.sicongtang.scala.tour.inner_classes

/**
 * @author BobbyTang
 */
class GraphEnableNode {
  class Node {
    var connectedNodes: List[GraphEnableNode#Node] = Nil
    def connectTo(node: GraphEnableNode#Node) {
      if (connectedNodes.find(node.equals).isEmpty) {
        connectedNodes = node :: connectedNodes
      }
    }
  }
  var nodes: List[Node] = Nil
  def newNode: Node = {
    val res = new Node
    nodes = res :: nodes
    res
  }
}