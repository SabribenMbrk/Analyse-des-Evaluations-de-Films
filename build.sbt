ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.12.18"

lazy val root = (project in file("."))
  .settings(
    name := "MovieRatingsProject",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.3.1" % Test,
      "org.apache.spark" %% "spark-core" % "3.3.1",
      "org.apache.spark" %% "spark-sql" % "3.3.1",
      "org.apache.hadoop" % "hadoop-client" % "3.3.1",
      "com.typesafe" % "config" % "1.4.3"
    )
  )


