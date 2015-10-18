package com.scalaimpatient.ch05.exercise

/**
 * Improve the Counter class in Section 5.1, “Simple Classes and Parameterless Methods,” on page 51 so that it doesn’t turn negative at Int.MaxValue.
 * @author BobbyTang
 */
object Ex01 {

  class Counter {
    private var value = Int.MaxValue - 1 // You must initialize the field
    def increment() { if (value < Int.MaxValue) value += 1 } // Methods are public by default def current() = value
    def current() = value

    override def toString() = "value: " + value
  }

  def main(args: Array[String]): Unit = {
    val counter = new Counter()
    println(counter)
    counter.increment()
    println(counter)
    counter.increment()
    println(counter)
    counter.increment()
    println(counter)
  }

}