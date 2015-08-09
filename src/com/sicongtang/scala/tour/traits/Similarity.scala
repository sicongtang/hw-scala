package com.sicongtang.scala.tour.traits

/**
 * @author BobbyTang
 */
trait Similarity {
  def isSimilar(x: Any): Boolean
  def isNotSimilar(x: Any): Boolean = !isSimilar(x)
}