package org.apache.spark.examples.udf

import org.apache.spark.sql.{Column, Row}
import org.apache.spark.sql.catalyst.expressions.{Add, AggregateWindowFunction, AttributeReference, Expression, If, IsNotNull, LessThanOrEqual, Literal, ScalaUDF, Subtract}
import org.apache.spark.sql.types._
import org.apache.spark.unsafe.types.UTF8String


object MyUDWF {

  case class SessionUDWF(id: Expression, transTime: Expression, price: Expression, qty: Expression) extends AggregateWindowFunction {

    override val initialValues: Seq[Expression] = _
    override val updateExpressions: Seq[Expression] = _
    override val evaluateExpression: Expression = _

    override def aggBufferAttributes: Seq[AttributeReference] = ???

    override def children: Seq[Expression] = ???

    override def prettyName: String = "bobby_udf"
  }



  def calculateSession(id: Column, transTime: Column, price: Column, qty: Column): Column = withExpr {
    SessionUDWF(id.expr, transTime.expr, price.expr, qty.expr)
  }

  private def withExpr(expr: Expression): Column = new Column(expr)
}