package com.scalaimpatient.ch05_classes.exercise

/**
 * Consider the class
 * class Employee(val name: String, var salary: Double) {
 *    def this() { this("John Q. Public", 0.0) }
 * }
 * 
 * Rewrite it to use explicit fields and a default primary constructor. Which form do you prefer? Why?
 * @author BobbyTang
 */
object Ex09 {
  class Employee(defName: String = "John Q. Public", defSalary: Double = 0.0) {
    val name = defName
    var salary = defSalary

  }

  def main(args: Array[String]): Unit = {
    new Employee("Frank Sinatra")
    new Employee(defSalary = 500.55)
  }
}