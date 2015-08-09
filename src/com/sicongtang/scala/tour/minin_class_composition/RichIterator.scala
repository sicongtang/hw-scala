package com.sicongtang.scala.tour.minin_class_composition

/**
 * @author BobbyTang
 */
trait RichIterator extends AbsIterator {
  def foreach(f: T => Unit) { while (hasNext) f(next) }
}