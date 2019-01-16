package com.yuwen.exercise

import scala.math
//import BigInt

object exercise01 {
  def main(args: Array[String]): Unit = {
    val values = 3
    val squareroot_values = math.sqrt(values) //平方根
    val squareroot_values_square = squareroot_values * squareroot_values //平方根的平方
    val difference = squareroot_values_square - 3
    //println(difference)

    //10、用BigInt计算2的1024次方
    val square1024 = BigInt(2).pow(1024)
    //println(square1024)

    //11、在Scala中如何获取字符串“Hello”的首字符和尾字符
    val string1 = "Hello"
    val first_str = string1.charAt(0)
    val last_str = string1.charAt(string1.length-1)
    println(last_str)
  }

}

