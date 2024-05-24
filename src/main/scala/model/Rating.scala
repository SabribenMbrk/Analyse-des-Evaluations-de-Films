package model

case class Rating(user_id: Int, movie_id: Int, rating: Double, timestamp: java.sql.Timestamp)

