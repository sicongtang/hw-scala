package com.scalaimpatient.ch06_objects.exercise

/**
 * Write an enumeration describing the eight corners of the RGB color cube.
 * As IDs, use the color values (for example, 0xff0000 for Red).
 * @author BobbyTang
 */
object Ex08 {
  object RGBCubeCorners extends Enumeration {
    val Black = Value(0x000000)
    val Red = Value(0xff0000)
    val Green = Value(0x00ff00)
    val Blue = Value(0x0000ff)
    val Yellow = Value(0xffff00)
    val Cyan = Value(0x00ffff)
    val Magenta = Value(0xff00ff)
    val White = Value(0xffffff)
  }
  def main(args: Array[String]): Unit = {
    println(for (color <- RGBCubeCorners.values) yield ("0x%06x".format(0xFFFFFF & color.id), color))
  }
}