import org.apache.spark.{SparkConf, SparkContext}

object HelloWorld extends App {
  val conf = new SparkConf().setAppName("HelloWorld").setMaster("local") // .set("spark.executor.memory","2g")
  val sc = new SparkContext(conf)

  println("************")
  println("************")
  println("Hello, world!")
  println("************")
  println("***********")

  sc.stop()

}
