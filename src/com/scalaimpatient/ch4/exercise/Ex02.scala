package com.scalaimpatient.ch4.exercise

import java.io.File
import scala.collection.mutable
/**
 * Write a program that reads words from a file. Use a mutable map to count how often each word appears.
 * To read the words, simply use a java.util.Scanner:
 * val in = new java.util.Scanner(java.io.File("myfile.txt")) while (in.hasNext()) process in.next()
 * Or look at Chapter 9 for a Scalaesque way.
 * At the end, print out all words and their counts.
 *
 * @author BobbyTang
 */
object Ex02 {
  def main(args: Array[String]): Unit = {
    val in = new java.util.Scanner(new File("src/com/scalaimpatient/ch4/exercise/ex02.txt"))
    // take care here Map package names, if you want a mutable map, need to declare its explicitly
    val wordCounts = mutable.Map[String, Int]() withDefault (_ => 0); // awesome
    
    while (in hasNext) wordCounts(in next) += 1 // previous line's "awesome" makes this easy
    println(wordCounts)
  }
}