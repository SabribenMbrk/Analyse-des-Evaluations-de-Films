package runner

import org.apache.spark.sql.SparkSession
import processor.MovieProcessor

object MovieRatingsApp {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("MovieRatingsApp")
      .master("local[*]")
      .getOrCreate()

    val moviesPath = "E:/MovieRatingsProject/data/movies.csv"
    val ratingsPath = "E:/MovieRatingsProject/data/ratings.csv"

    val moviesDF = MovieProcessor.processMovies(spark, moviesPath)
    val ratingsDF = MovieProcessor.processRatings(spark, ratingsPath)


    spark.stop()
  }
}
