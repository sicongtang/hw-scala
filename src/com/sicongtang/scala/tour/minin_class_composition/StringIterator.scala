package com.sicongtang.scala.tour.minin_class_composition

/**
 * @author BobbyTang
 */
class StringIterator(s: String) extends AbsIterator {
  type T = Char
  private var i = 0
  def hasNext = i < s.length()
  def next = { val ch = s charAt i; i += 1; ch }
}