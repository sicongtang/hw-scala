package com.scalaimpatient.ch12_highorder_func.exercise

/**
 * It’s easy to get a sequence of pairs, for example val pairs = (1 to 10) zip (11 to 20)
 * Now suppose you want to do something with such a sequence—say, add up the values. But you can’t do pairs.map(_ + _)
 * The function _ + _ takes two Int parameters, not an (Int, Int) pair.
 * Write a function adjustToPair that receives a function of type (Int, Int) => Int and returns the equivalent function that operates on a pair.
 * For example, adjustToPair(_ * _)((6, 7)) is 42.
 * Then use this function in conjunction with map to compute the sums of the elements in pairs.
 *
 * @author BobbyTang
 */
object Ex07 {
  def adjustToPair[A, B, C](fun: (A, B) => C)(pair: (A, B)) = fun(pair._1, pair._2)
  
  def main(args: Array[String]): Unit = {
    
    val pairs = (1 to 10) zip (11 to 20)
    println(pairs.map(adjustToPair(_ * _)))
  }
}