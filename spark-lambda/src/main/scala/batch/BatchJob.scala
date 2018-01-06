package batch

import java.lang.management.ManagementFactory
import org.apache.spark.{SparkContext, SparkConf}

object BatchJob {
  def main(args: Array[String]): Unit = {

    // get spark configuration
    val conf = new SparkConf()
      .setAppName("Lambda with Spark")

    conf.setMaster("local[2]")

    println("Initializing")
    // setup spark context
    val sc = new  SparkContext(conf)

    // initialize input RDD
    val sourceFile = "/Users/jwalantdattani/boxes/spark-kafka-cassandra-applying-lambda-architecture/vagrant/data.tsv"
    val input = sc.textFile(sourceFile)

   input.foreach(println)

  }
}
