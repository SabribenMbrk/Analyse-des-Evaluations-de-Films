package runner

import org.apache.spark.sql.SparkSession
import processor.MovieProcessor

object MovieRatingsApp {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder
      .appName("Movie Ratings App")
      .master("local[*]")
      .getOrCreate()

    val moviesFilePath = "E:/MovieRatingsProject/data/movies.csv"
    val ratingsFilePath = "E:/MovieRatingsProject/data/ratings.csv"

    val moviesDS = MovieProcessor.processMovies(spark, moviesFilePath)
    val ratingsDS = MovieProcessor.processRatings(spark, ratingsFilePath)

    // Ajoutez ici le code pour travailler avec moviesDS et ratingsDS
    moviesDS.show(20)
    ratingsDS.show(20)

    spark.close()
  }
}
