package com.scalaimpatient.ch05_classes.exercise

/**
 * Write a class Time with read-only properties hours and minutes and a method before(other: Time): Boolean that checks whether this time comes before the other.
 * A Time object should be constructed as new Time(hrs, min), where hrs is in military time format (between 0 and 23).
 * @author BobbyTang
 */
object Ex03 {
  class Time(val hrs: Int, val min: Int) {
    def before(other: Time): Boolean = {
      if (hrs < other.hrs)
        true
      else if (hrs == other.hrs && min < other.min)
        true
      else
        false
    }

    def before2(other: Time): Boolean = hrs < other.hrs || hrs == other.hrs && min < other.min

  }
}