class testlist {

}
object testlist{
  def main(args: Array[String]): Unit = {
    val oneTwo = List(1,2)
    val threeFour = List(3,4)
    val oneTwoThreeFour = oneTwo ::: threeFour //oneTwo 连接 threeFour
    println (oneTwo + " and " + threeFour + " were not mutated.")
    println ("Thus, " + oneTwoThreeFour + " is a new list")

    val oneTwoThree  = 1 :: 2 :: 3 :: Nil
    println(oneTwoThree)

    val oneTwoThree1 = Nil.::(3).::(2).::(1) //调用空列表对象 Nil 的 ::方法
    println(oneTwoThree1)
  }
}
