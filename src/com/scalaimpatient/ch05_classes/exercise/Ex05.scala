package com.scalaimpatient.ch05_classes.exercise

import scala.beans.BeanProperty

/**
 * Make a class Student with read-write JavaBeans properties name (of type String) and id (of type Long).
 * What methods are generated? (Use javap to check.)
 * Can you call the JavaBeans getters and setters in Scala? Should you?
 *
 * @author BobbyTang
 */
object Ex05 {
  class Student(@BeanProperty var name: String, @BeanProperty var id: Long) {
    override def toString() = "name: " + name + ", id: " + id
  }

  def main(args: Array[String]): Unit = {
    val st = new Student("John", 32)

    st.setName("John 1")
    st.setId(33)
    
    
  }
}