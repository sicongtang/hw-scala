package com.scalaimpatient.ch6.exercise

/**
 * Write an enumeration describing the four playing card suits so that the toString method returns ß, ®, ©, or TM.
 * @author BobbyTang
 */
object Ex06 {
  def main(args: Array[String]): Unit = {
    println(PlayingCard.Clover)
    println(PlayingCard.values)
  }
}

object PlayingCard extends Enumeration {
  type PlayingCard = Value
  val Clover = Value("♣")
  val Diamond = Value("♦")
  val Heart = Value("♥")
  val Spade = Value("♠")
}