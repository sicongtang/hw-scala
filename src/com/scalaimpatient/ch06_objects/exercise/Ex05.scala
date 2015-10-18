package com.scalaimpatient.ch06_objects.exercise

/**
 * Write a Scala application, using the App trait, that prints the command-line arguments in reverse order, separated by spaces.
 * For example, scala Reverse Hello World should print World Hello.
 * @author BobbyTang
 */
object Ex05 {
  object InnerApp extends App {
    for (arg <- args.reverse) print(arg + " ")
  }

  def main(args: Array[String]): Unit = {
    InnerApp.main(Array("asd", "asdfasd", "werw"))
  }
}