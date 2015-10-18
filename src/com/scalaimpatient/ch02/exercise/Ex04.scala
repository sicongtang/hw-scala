package com.scalaimpatient.ch02.exercise

/**
 * 4. Write a Scala equivalent for the Java loop
 * for (int i = 10; i >= 0; i--) System.out.println(i);
 * @author BobbyTang
 */
object Ex04 {

  def main(args: Array[String]): Unit = {
    for (i <- 10 to (0, -1)) {
      println(i)
    }
  }
}