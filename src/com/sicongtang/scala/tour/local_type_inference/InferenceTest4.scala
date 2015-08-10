package com.sicongtang.scala.tour.local_type_inference

/**
 * @author BobbyTang
 */
object InferenceTest4 {
  def main(args: Array[String]): Unit = {
    var obj = null
    // obj = new Object()
    // This program does not compile because the type inferred for variable obj is Null.
    // Since the only value of that type is null, it is impossible to make this variable refer to another value.
  }
}