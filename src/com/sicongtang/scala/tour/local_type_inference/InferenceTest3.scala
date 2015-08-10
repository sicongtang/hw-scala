package com.sicongtang.scala.tour.local_type_inference

/**
 * @author BobbyTang
 */
case class MyPair[A, B](x: A, y: B);

object InferenceTest3 {
  def main(args: Array[String]): Unit = {
    def id[T](x: T) = x
    val p = MyPair(1, "scala") // type: MyPair[Int, String]
    val q = id(1) // type: Int

    // The last two lines of this program are equivalent to the following code where all inferred types are made explicit:
    val x: MyPair[Int, String] = MyPair[Int, String](1, "scala")
    val y: Int = id[Int](1)
  }
}