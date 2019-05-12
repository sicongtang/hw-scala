package org.apache.spark.excel

import org.apache.spark.sql.{SaveMode, SparkSession}
import org.scalatest.{BeforeAndAfterEach, FunSuite}


class ExcelFileFormatTest extends FunSuite with BeforeAndAfterEach {
  var sparkSession: SparkSession = _

  override def beforeEach() {
    sparkSession = SparkSession.builder().appName("my spark session")
      .master("local")
      .config("", "")
      .getOrCreate()
  }

  test("test excel output") {
    val df = sparkSession.createDataFrame(Seq(MyBean(1, "a"), MyBean(2, "b"), MyBean(3, "b")))
    df.write.format("org.apache.spark.excel").mode(SaveMode.Append)
      .option("sheetName", "test1")
      .save("myexcelfile.xls")

    val df2 = sparkSession.createDataFrame(Seq(MyBean(4, "a"), MyBean(5, "b"), MyBean(6, "b")))
    df2.write.format("org.apache.spark.excel").mode(SaveMode.Append)
      .option("sheetName", "test2")
      .save("myexcelfile.xls")

  }

  override def afterEach() {
    sparkSession.stop()
  }
}


case class MyBean(i: Int, name: String)