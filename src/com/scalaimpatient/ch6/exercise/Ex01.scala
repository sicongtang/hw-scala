package com.scalaimpatient.ch6.exercise

/**
 * Write an object Conversions with methods inchesToCentimeters, gallonsToLiters, and milesToKilometers.
 * @author BobbyTang
 */
object Ex01 {
  object Conversions {
    
    def inchesTocentimeters(inches: Double) = 2.54 * inches
    
    def gallonsToLiters(gallons: Double) = 3.78541178 * gallons
    
    def milesToKilometers(miles: Double) = 1.609344 * miles
  }
}