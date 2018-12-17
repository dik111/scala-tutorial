class whileAndif {

}
object whileAndif{
  def main(args: Array[String]): Unit = {
    val args:String ="I like Scala"

    var i = 0
    while (i < args.length) {
      print(args(i))
      i += 1
    }

  }

}