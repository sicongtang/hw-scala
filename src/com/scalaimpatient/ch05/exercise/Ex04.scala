package com.scalaimpatient.ch05.exercise

/**
 *  Reimplement the Time class from the preceding exercise so that the internal representation is the number of minutes since midnight (between 0 and 24 × 60 – 1).
 *  Do not change the public interface. That is, client code should be unaffected by your change.
 *
 * @author BobbyTang
 */
object Ex04 {
  class Time(val hrs: Int, val min: Int) {
    private val minSinceMidnight = hrs * 60 + min

    def before(other: Time): Boolean = minSinceMidnight < other.minSinceMidnight

  }
}