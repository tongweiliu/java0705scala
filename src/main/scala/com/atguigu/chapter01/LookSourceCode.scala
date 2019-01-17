package com.atguigu.chapter01

/**
  * @author liutongwei
  * @create 2019-01-16 10:31
  */
object LookSourceCode {
  def main(args: Array[String]): Unit = {
    var arr: Array[Int] = new Array[Int](10)
    for (item <- arr) {
      println("item=", item)
    }
  }
}
