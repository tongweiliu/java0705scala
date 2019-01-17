package com.atguigu.chapter02.datatype

/**
  * @author liutongwei
  * @create 2019-01-16 15:49
  */
object TypeDemo02 {
  def main(args: Array[String]): Unit = {
    println(sayHello)
    var num=1.2
    var num2=1.7f
    num2=num.toFloat
  }

  def sayHello: Nothing ={
    throw new Exception("抛出异常")
  }
}
