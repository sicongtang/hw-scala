package com.sicongtang.scala.style.namingconvention

/**
 * @author BobbyTang
 */
object Mutator {
  def main(args: Array[String]): Unit = {
    val foo = new Foo
    val bar2 = new Bar
    foo.bar // accessor
    foo.bar = bar2 // mutator
    foo.isBaz // boolean property
  }
}
class Bar {

}

class Foo {
  var v: Bar = new Bar
  def bar = v
  def bar_=(bar: Bar) {
    v = bar
  }
  def isBaz = {
    v.isInstanceOf
  }
}