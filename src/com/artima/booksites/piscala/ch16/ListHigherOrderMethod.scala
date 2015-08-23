package com.artima.booksites.piscala.ch16

/**
 * @author BobbyTang
 */
object ListHigherOrderMethod {
  def main(args: Array[String]): Unit = {
    println(List(1, 2, 3) map (_ + 1))
    val words = List("the", "quick", "brown", "fox")
    //List(3, 5, 5, 3)
    println(words map (_.length))
    //List(eht, kciuq, nworb, xof)
    println(words map (_.toList.reverse.mkString))
    //List(List(t, h, e), List(q, u, i, c, k), List(b, r, o, w, n), List(f, o, x))
    println(words map (_.toList))
    //List(t, h, e, q, u, i, c, k, b, r, o, w, n, f, o, x)
    println(words flatMap (_.toList))
    //List((2,1), (3,1), (3,2), (4,1), (4,2), (4,3))
    println(List.range(1, 5) flatMap (i => List.range(1, i) map (j => (i, j))))

  }
}