//CSVUtils.scala
package util

import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.spark.sql.functions.col
import org.apache.spark.sql.types.TimestampType

object CSVUtils {
  def loadMovies(spark: SparkSession, path: String): DataFrame = {
    spark.read.option("header", "true").csv(path)
  }

  def loadRatings(spark: SparkSession, path: String): DataFrame = {
    spark.read.option("header", "true").csv(path)
      .withColumn("timestamp", col("timestamp").cast(TimestampType))
  }
}
