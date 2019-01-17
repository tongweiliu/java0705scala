package com.atguigu.chapter01

/**
  * @define
  * scaladoc -d d:/scalaMyDoc Comment.scala 生成文档命令
  * @author liutongwei
  * @create 2019-01-16 9:30
  */
object Comment {
  def main(args: Array[String]): Unit = {
    println("hello,world!")
  }

  /**
    * @deprecated 过期
    * @example
    * 输入n1 = 10 n2 = 20 return 30
    * @param n1
    * @param n2
    * @return 两个参数的和
    */
  def sum(n1: Int, n2: Int): Int = {

    var str = "hell0" + "hell0" + "hell0" + "hell0" + "hell0" + "hell0" + "hell0" + "hell0" + "hell0" + "hell0" + "hell0" + "hell0" + "hell0" + "hell0" + "hell0"

    return n1 + n2
  }
}
