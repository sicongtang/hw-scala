package com.sicongtang.scala.tour.minin_class_composition

/**
 * @author BobbyTang
 */
abstract class AbsIterator {
  type T
  def hasNext: Boolean
  def next: T
}