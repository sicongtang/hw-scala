package org.apache.spark.examples.udf

import java.sql.Timestamp
import java.time.LocalDateTime

import org.apache.spark.sql.Row
import org.apache.spark.sql.expressions.{MutableAggregationBuffer, UserDefinedAggregateFunction}
import org.apache.spark.sql.types._

class MyWindowAggFunc extends UserDefinedAggregateFunction {
  override def inputSchema: StructType = new StructType()
    .add("transId", StringType)
    .add("qty", DecimalType(38, 18))
    .add("price", DecimalType(38, 18))
    .add("transTime", TimestampType)

  override def bufferSchema: StructType = new StructType()
    .add("rownum", IntegerType)
    .add("transId", StringType)
    .add("qty", DecimalType(38, 18))
    .add("price", DecimalType(38, 18))
    .add("transTime", TimestampType)
    .add("netPrice", DecimalType(38, 18))
    .add("otherTransId", StringType)


  override def dataType: DataType = new StructType()
    .add("rownum", IntegerType)
    .add("transId", StringType)
    .add("netPrice", DecimalType(38, 18))
    .add("otherTransId", StringType)

  override def deterministic: Boolean = true

  override def initialize(buffer: MutableAggregationBuffer): Unit = {
    buffer.update(0, 0)
    buffer.update(1, null)
    buffer.update(2, new java.math.BigDecimal(0L))
    buffer.update(3, new java.math.BigDecimal(0L))
    buffer.update(4, Timestamp.valueOf(LocalDateTime.parse("1900-12-03T10:15:30")))
    buffer.update(5, new java.math.BigDecimal(Long.MaxValue))
    buffer.update(6, null)
    println("initialize >>>" + buffer)
  }

  override def update(buffer: MutableAggregationBuffer, input: Row): Unit = {
    println("update >>>" + input)

    val transId = input.getAs[String](0)
    val qty = input.getAs[java.math.BigDecimal](1)
    val price = input.getAs[java.math.BigDecimal](2)
    val transTime = input.getAs[java.sql.Timestamp](3)

    if (buffer.getAs[Int](0) ==0) {
      buffer.update(0, 1)
      buffer.update(1, transId)
      buffer.update(2, qty)
      buffer.update(3, price)
      buffer.update(4, transTime)
    } else {
      val basePrice = buffer.getAs[java.math.BigDecimal](3)
      val netPrice = buffer.getAs[java.math.BigDecimal](5)
      val newNetPrice = basePrice.subtract(price).abs()
      if (newNetPrice.compareTo(netPrice) == -1) {
        buffer.update(5, newNetPrice)
        buffer.update(6, transId)
      }

    }

  }

  override def merge(buffer1: MutableAggregationBuffer, buffer2: Row): Unit = {
    throw new UnsupportedOperationException("merge methods won't be called by window function")
  }

  override def evaluate(buffer: Row): Any = (buffer.get(0), buffer.get(1), buffer.get(5), buffer.get(6))
}
