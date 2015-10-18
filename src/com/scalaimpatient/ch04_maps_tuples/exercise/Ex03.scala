package com.scalaimpatient.ch04_maps_tuples.exercise

import java.io.File

/**
 * Repeat the preceding exercise with an immutable map.
 * @author BobbyTang
 */
object Ex03 {
  
  def main(args: Array[String]): Unit = {
    val in = new java.util.Scanner(new File("src/com/scalaimpatient/ch4/exercise/ex02.txt"))
    // immutable
    var wordlist = Map[String, Int]() withDefault (_ => 0); // awesome
    
    while (in.hasNext()) {
      val word = in.next()
      val currentcount = wordlist(word)
      // create a new map, but it is not inefficient
      wordlist = wordlist - word + (word -> (currentcount + 1))
    }

    println(wordlist)
  }
}