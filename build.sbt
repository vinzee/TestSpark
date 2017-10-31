name := "TestScala"

version := "0.1"

// Spark does not have builds for Scala version 2.12.x. So set the Scala version to 2.11.x

scalaVersion := "2.11.4"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.0"

//libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.0"
//libraryDependencies += "org.apache.spark" %% "spark-graphx" % "2.2.0"
//libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.2.0"