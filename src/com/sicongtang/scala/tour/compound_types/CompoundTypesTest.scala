package com.sicongtang.scala.tour.compound_types

/**
 * @author BobbyTang
 */
trait Cloneable extends java.lang.Cloneable {
  override def clone(): Cloneable = {
    super.clone().asInstanceOf[Cloneable]
  }
}
trait Resetable {
  def reset: Unit
}

object CompoundTypesTest {
  /**
   *  A with B with C ... { refinement }
   */
  def cloneAndReset(obj: Cloneable with Resetable): Cloneable = {
    val cloned = obj.clone();
    obj.reset
    cloned
  }
}