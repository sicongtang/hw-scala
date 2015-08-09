package com.sicongtang.scala.tour.unified_types

/**
 * In contrast to Java, all values in Scala are objects (including numerical values and functions).
 * @author BobbyTang
 */
class UnifiedTypes extends App {
  val set = new scala.collection.mutable.LinkedHashSet[Any]
  set += "This is a string"
  set += 732
  set += 'c'
  set += true
  set += main _
  val iter: Iterator[Any] = set.iterator
  while (iter.hasNext) {
    println(iter.next.toString())
  }
}
