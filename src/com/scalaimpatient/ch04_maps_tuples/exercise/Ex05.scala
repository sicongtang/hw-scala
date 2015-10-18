package com.scalaimpatient.ch04_maps_tuples.exercise

import java.io.File
import java.util.TreeMap

/**
 * Repeat the preceding exercise with a java.util.TreeMap that you adapt to the Scala API.
 * @author BobbyTang
 */
object Ex05 {
  def main(args: Array[String]): Unit = {
    val in = new java.util.Scanner(new File("src/com/scalaimpatient/ch4/exercise/ex02.txt"))
    val wordlist = new TreeMap[String, Int]()

    while (in hasNext) {
      val word = in next;
      if (!(wordlist containsKey word)) wordlist put (word, 0)
      wordlist put (word, (wordlist get word) + 1)
    }

    println(wordlist)
  }
}