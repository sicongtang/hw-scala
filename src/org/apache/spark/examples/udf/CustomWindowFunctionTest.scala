package org.apache.spark.examples.udf

import java.sql.Timestamp
import java.time.LocalDateTime

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.functions._
import org.scalatest.FlatSpec


case class Trade(transId: String, symbol: String, transTime: java.sql.Timestamp, price: java.math.BigDecimal, qty: java.math.BigDecimal)


class CustomWindowFunctionTest extends FlatSpec {

  val spark = SparkSession
    .builder()
    .appName("local[2]")
    .config("spark.master", "local")
    .getOrCreate()
  val sqlc = spark.sqlContext
  val sc = spark.sparkContext

  import sqlc.implicits._

  val tradeArray = Array[Trade](
    Trade("1", "IBM", Timestamp.valueOf(LocalDateTime.parse("2007-12-03T10:15:30")), new java.math.BigDecimal(20L), new java.math.BigDecimal(100L)),
    Trade("2", "IBM", Timestamp.valueOf(LocalDateTime.parse("2007-12-03T10:15:32")), new java.math.BigDecimal(21L), new java.math.BigDecimal(100L)),
    Trade("3", "IBM", Timestamp.valueOf(LocalDateTime.parse("2007-12-03T10:15:34")), new java.math.BigDecimal(22L), new java.math.BigDecimal(100L)),
    Trade("4", "IBM", Timestamp.valueOf(LocalDateTime.parse("2007-12-03T10:15:35")), new java.math.BigDecimal(23L), new java.math.BigDecimal(100L)),
    Trade("5", "IBM", Timestamp.valueOf(LocalDateTime.parse("2007-12-03T10:15:45")), new java.math.BigDecimal(24L), new java.math.BigDecimal(100L)),
    Trade("6", "IBM", Timestamp.valueOf(LocalDateTime.parse("2007-12-03T10:15:46")), new java.math.BigDecimal(24.5D), new java.math.BigDecimal(100L)),
    Trade("7", "IBM", Timestamp.valueOf(LocalDateTime.parse("2007-12-03T10:15:47")), new java.math.BigDecimal(24.1D), new java.math.BigDecimal(100L))

  )

  val tsToLong = (s: java.sql.Timestamp) => s.getTime()
  val tsToLongUDF = udf(tsToLong)

  "sum" should "calculate the total qty within the window " in {
    val df = sqlc.createDataFrame(sc.parallelize(tradeArray))

    val myWindowAggFunc = new MyWindowAggFunc()

    val window = Window.partitionBy($"symbol").orderBy(tsToLongUDF($"transTime").asc).rangeBetween(0L, 3000L)
    val res = df.withColumn("window_total_qty", sum($"qty").over(window))
      .withColumn("my_window", myWindowAggFunc($"transId", $"qty", $"price", $"transTime").over(window))

    res.collect().foreach(println(_))
  }



}