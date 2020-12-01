import javax.script.{Compilable, Invocable, ScriptEngine, ScriptEngineManager}
import org.apache.spark.sql.SparkSession

import scala.io.Source

object Start extends App {
  val engine = new ScriptEngineManager()
    .getEngineByName("nashorn")
    .asInstanceOf[ScriptEngine with Invocable with Compilable]

  val spark = SparkSession
    .builder()
    .appName("deneme")
    .master("local[1]")
    .getOrCreate()

  case class SparkJS() {
    def readJson(path: String): Array[String] ={
      println(s"reading json from: $path")
      val jsonFile = spark.read.json(path)
      jsonFile.show()
      jsonFile.toJSON.collect()
    }
  }

  val fileContents = Source.fromFile("run.js").getLines.mkString("\n")

  engine.compile(fileContents).eval()
}