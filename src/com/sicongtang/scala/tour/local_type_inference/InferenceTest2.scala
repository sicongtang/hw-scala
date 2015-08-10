package com.sicongtang.scala.tour.local_type_inference

/**
 * @author BobbyTang
 */
object InferenceTest2 {
  // For recursive methods, the compiler is not able to infer a result type. Here is a program which will fail the compiler for this reason:
  // def fac(n: Int) = if (n == 0) 1 else n * fac(n - 1)
}