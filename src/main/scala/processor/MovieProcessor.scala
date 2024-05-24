package processor

import org.apache.spark.sql.{DataFrame, SparkSession}

import util.CSVUtils

object MovieProcessor {
  def processMovies(spark: SparkSession, moviesPath: String): DataFrame = {
    CSVUtils.loadMovies(spark, moviesPath)
  }

  def processRatings(spark: SparkSession, ratingsPath: String): DataFrame = {
    CSVUtils.loadRatings(spark, ratingsPath)
  }
}
