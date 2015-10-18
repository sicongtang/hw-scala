package com.scalaimpatient.ch06_objects.exercise

/**
 * The preceding problem wasn’t very object-oriented.
 * Provide a general super- class UnitConversion and define objects InchesToCentimeters, GallonsToLiters, and MilesToKilometers that extend it.
 * @author BobbyTang
 */
object Ex02 {
  class UnitConversion(val conversionFactor: Double) {
    def convert(original: Double) = conversionFactor * original
  }

  object InchesToCentimeters extends UnitConversion(2.54)

  object GallonsToLiters extends UnitConversion(3.78541178)

  object MilesToKilometers extends UnitConversion(1.609344)
}