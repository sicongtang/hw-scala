package org.apache.spark.excel

import java.io.{File, FileOutputStream}

import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.poifs.filesystem.POIFSFileSystem
import org.apache.spark.sql.sources.{BaseRelation, CreatableRelationProvider, DataSourceRegister, RelationProvider}
import org.apache.spark.sql.types.StructType
import org.apache.spark.sql.{DataFrame, SQLContext, SaveMode}


class DefaultSource extends CreatableRelationProvider with RelationProvider with DataSourceRegister {

  override def shortName(): String = "excel"

  override def createRelation(sqlContext: SQLContext, mode: SaveMode, parameters: Map[String, String], data: DataFrame): BaseRelation = {
    println(parameters)
    val writer = new ExcelFileWriter(parameters("path"), parameters("sheetName"), data, mode)
    writer.save()
    new ExcelRelation(sqlContext)
  }

  override def createRelation(sqlContext: SQLContext, parameters: Map[String, String]): BaseRelation = {
    new ExcelRelation(sqlContext)
  }
}

class ExcelRelation(ctx: SQLContext) extends BaseRelation {
  override def sqlContext: SQLContext = ctx

  override def schema: StructType = ???
}

class ExcelFileWriter(path: String,
                      sheetName: String,
                      df: DataFrame,
                      saveMode: SaveMode
                     ) {

  import scala.collection.JavaConverters._

  def save(): Unit = {
    val rows = df.toLocalIterator().asScala.map(_.toSeq)

    val metadataSeq = df.schema.map(_.name).seq

    var wb: HSSFWorkbook = null
    try {
      val fs = new POIFSFileSystem(new File(path))
      wb = new HSSFWorkbook(fs.getRoot, true)
    } catch {
      case e: Exception => {
        e.printStackTrace()
        wb = new HSSFWorkbook()
      }
    }

    val sheet = wb.createSheet(sheetName)
    val fmt = wb.createDataFormat
    val style = wb.createCellStyle()
    style.setDataFormat(fmt.getFormat("@"))
    var rowNum = 1;

    val rowHead = sheet.createRow(0)
    metadataSeq.zipWithIndex.foreach{
      case (e, i) => {
        val cell = rowHead.createCell(i)
        cell.setCellStyle(style)
        cell.setCellValue(e.toString)
      }
    }

    while (rows.hasNext) {
      val row = sheet.createRow(rowNum)
      rowNum = rowNum + 1
      rows.next().zipWithIndex.foreach {
        case (e, i) => {
          val cell = row.createCell(i)
          cell.setCellStyle(style)
          cell.setCellValue(e.toString)
        }
      }
    }

    try {
      val fileOut = new FileOutputStream(new File(path))
      try
        wb.write(fileOut)
      finally if (fileOut != null) fileOut.close()
    }
  }
}