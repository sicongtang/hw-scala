package com.sicongtang.scala.tour.default_parameter_values

/**
 * @author BobbyTang
 */
class HashMap[K, V](initialCapacity: Int = 16, loadFactor: Float = 0.75f) {

}

object DefaultParameterValuesTest {
  def main(args: Array[String]): Unit = {
    // Uses the defaults
    val m1 = new HashMap[String, Int]
    // initialCapacity 20, default loadFactor
    val m2 = new HashMap[String, Int](20)
    // overriding both
    val m3 = new HashMap[String, Int](20, 0.8f)
    // override only the loadFactory via
    // named arguments
    val m4 = new HashMap[String, Int](loadFactor = 0.8f)
  }
}