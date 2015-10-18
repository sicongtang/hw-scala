package com.scalaimpatient.ch05.exercise

/**
 * Make a class Car with read-only properties for manufacturer, model name, and model year, and a read-write property for the license plate.
 * Supply four constructors. All require the manufacturer and model name.
 * Optionally, model year and license plate can also be specified in the constructor.
 * If not, the model year is set to -1 and the license plate to the empty string.
 *
 * Which constructor are you choosing as the primary constructor? Why?
 *
 * @author BobbyTang
 */
object Ex08 {
  class Car(val manufacturer: String, val modelName: String, val modelYear: Int = -1, var licensePlate: String = "") {
    override def toString() = {
      "Manufacturer: " + manufacturer + " Model: " + modelName + " Year: " + modelYear + " Plate: " + licensePlate
    }
  }

  def main(args: Array[String]): Unit = {
    println(new Car("Ford", "Taurus"))
    println(new Car("Toyota", "Tundra", 2006))
    println(new Car("Fiat", "European", licensePlate = "ABC-123"))
    val c = new Car("Mystery", "Machine", 1969, "ZOINKS")
    println(c)
    c.licensePlate = "ZOINKS!"
    println(c)
  }
}