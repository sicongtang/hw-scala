package com.scalaimpatient.ch06_objects.exercise

import com.scalaimpatient.ch06_objects.exercise.PlayingCard._
/**
 * Implement a function that checks whether a card suit value from the preceding exercise is red.
 * @author BobbyTang
 */
object Ex07 {
  def isRed(cardSuit: PlayingCard) = cardSuit == PlayingCard.Heart || cardSuit == PlayingCard.Diamond

  def main(args: Array[String]): Unit = {
    println(for (suit <- PlayingCard.values) yield (suit, isRed(suit)))

  }
}