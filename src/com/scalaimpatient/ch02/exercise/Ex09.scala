package com.scalaimpatient.ch02.exercise

/**
 * 9. Make the function of the preceding exercise a recursive function.
 * @author BobbyTang
 */
object Ex09 {
  //: Int rescurisve function need to declare return type explicitly
  def productRec(s: String): Int = {
    val tail = s.tail
    s.head * (if (tail.size == 0) 1 else productRec(s.tail))
  }

}