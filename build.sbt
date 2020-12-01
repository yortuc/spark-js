name := "spark-js"

version := "0.1"

scalaVersion := "2.11.12"

val sparkVersion = "2.3.4"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)