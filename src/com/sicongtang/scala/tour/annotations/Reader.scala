package com.sicongtang.scala.tour.annotations

import java.io.BufferedReader
import java.io.IOException
import java.io.FileReader

/**
 * @author BobbyTang
 */
class Reader(fname: String) {
  private val in = new BufferedReader(new FileReader(fname))
  @throws(classOf[IOException])
  def read() = in.read()
}