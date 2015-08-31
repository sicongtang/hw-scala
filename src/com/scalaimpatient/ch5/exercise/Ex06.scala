package com.scalaimpatient.ch5.exercise

/**
 * In the Person class of Section 5.1, “Simple Classes and Parameterless Methods,” on page 51, provide a primary constructor that turns negative ages to 0.
 * @author BobbyTang
 */
object Ex06 {
  class Person(val name: String, val ageParam: Int) {
    println("Just constructed another person")
    val age = if (ageParam < 0) 0 else ageParam
  }

  def main(args: Array[String]): Unit = {
    val p = new Person("John", -234)
    println("age: " + p.age)
  }
}