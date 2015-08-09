package com.sicongtang.scala.tour.generic_classes

/**
 * @author BobbyTang
 */

class Stack[T] {
  var elems: List[T] = Nil
  def push(x: T) { elems = x :: elems }
  def top: T = elems.head
  def pop() { elems = elems.tail }
}

object GenericsTest {
  
  def main(args: Array[String]): Unit = {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push('a')
    println(stack.top)
    stack.pop()
    println(stack.top)
  }
}