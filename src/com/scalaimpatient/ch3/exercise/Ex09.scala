package com.scalaimpatient.ch3.exercise

import java.util.TimeZone

/**
 * Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs that are in America.
 * Strip off the "America/" prefix and sort the result.
 * @author BobbyTang
 */
object Ex09 {
  def main(args: Array[String]): Unit = {
    println(TimeZone.getAvailableIDs.filter(_.contains("America/")).toList)
    println(TimeZone.getAvailableIDs.filter(_.contains("America/")).map(_.stripPrefix("America/")).toList)
  }
}