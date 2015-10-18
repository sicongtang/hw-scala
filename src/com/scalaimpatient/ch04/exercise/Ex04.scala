package com.scalaimpatient.ch04.exercise

import java.io.File
import scala.collection.immutable

/**
 * Repeat the preceding exercise with a sorted map, so that the words are printed in sorted order.
 * @author BobbyTang
 */
object Ex04 {
  def main(args: Array[String]): Unit = {
    val in = new java.util.Scanner(new File("src/com/scalaimpatient/ch4/exercise/ex02.txt"))
    var wordlist = immutable.SortedMap[String, Int]() withDefault (_ => 0)

    while (in hasNext) {
      val word = in.next()
      val occurence = wordlist(word)
      wordlist = wordlist - word + (word -> (occurence + 1))
    }

    print(wordlist)
  }
}