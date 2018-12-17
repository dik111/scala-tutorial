class defineFunction {

}

object defineFunction{
  def main(args: Array[String]): Unit = {
    val s = max(3,4)
    println(s)
  }
  def max(x:Int,y:Int) : Int = {
    if (x>y) x
    else y
  }
}
