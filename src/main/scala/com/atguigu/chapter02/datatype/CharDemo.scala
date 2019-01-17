package com.atguigu.chapter02.datatype

/**
  * @author liutongwei
  * @create 2019-01-16 15:35
  */
object CharDemo {
  def main(args: Array[String]): Unit = {
    var char1: Char = 97
    //当我们输出一个char类型时，他会输出譔数字对应的实际行动(码值表unicode)
    println("char1", char1) //a

    //char 可以当做数字进行运行
    var char2: Char = 'a'
    var num = 10 + char2
    println("num=" + num)

    //原因和分析
    /**
      * 1、当把一个计算的结果赋值一个变量，则编译器会进行类型转换及判断(即会看范围+类型)
      * 2、当把一个字面量赋值一个变量，则编译器会进行范围的判定
      *
      */
    //    var c2: Char = 'a' + 1
    //    var c3: Char = 97 + 1
    //    var c4: Char = 98
  }
}
