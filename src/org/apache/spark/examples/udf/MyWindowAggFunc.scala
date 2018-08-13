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
    .add("transId", StringType)
    .add("qty", DecimalType(38, 18))
    .add("price", DecimalType(38, 18))
    .add("transTime", TimestampType)

  override def dataType: DataType = new StructType()
    .add("transId", StringType)
    .add("qty", DecimalType(38, 18))
    .add("price", DecimalType(38, 18))
    .add("transTime", TimestampType)

  override def deterministic: Boolean = true

  override def initialize(buffer: MutableAggregationBuffer): Unit = {
    buffer.update(0, "transIdxxxx")
    buffer.update(1, new java.math.BigDecimal(1.1))
    buffer.update(2, new java.math.BigDecimal(0.001))
    buffer.update(3, Timestamp.valueOf(LocalDateTime.parse("2007-12-03T10:15:30")))
  }

  override def update(buffer: MutableAggregationBuffer, input: Row): Unit = {}

  override def merge(buffer1: MutableAggregationBuffer, buffer2: Row): Unit = {}

  override def evaluate(buffer: Row): Any = buffer
}
