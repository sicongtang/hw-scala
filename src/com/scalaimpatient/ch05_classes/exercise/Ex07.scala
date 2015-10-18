package com.scalaimpatient.ch05_classes.exercise

/**
 * Write a class Person with a primary constructor that accepts a string containing a first name, a space, and a last name, such as new Person("Fred Smith").
 * Supply read-only properties firstName and lastName.
 * Should the primary constructor parameter be a var, a val, or a plain parameter? Why?
 *
 * @author BobbyTang
 */
object Ex07 {
  class Person(fullName: String) {
    val firstName = fullName.split(" ")(0)
    val lastName = fullName.split(" ")(1)

    // http://stackoverflow.com/questions/2381666/multiple-assignment-of-non-tuples-in-scala
    val Array(first, last) = fullName.split(' ')

  }

  def main(args: Array[String]): Unit = {
    val p = new Person("Fred Smith")

    println("firstName: " + p.firstName + " lastName: " + p.lastName)
  }
}