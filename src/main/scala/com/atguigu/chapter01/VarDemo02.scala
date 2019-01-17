package com.atguigu.chapter01

/**
  * @author liutongwei
  * @create 2019-01-16 10:40
  */
object VarDemo02 {
  def main(args: Array[String]): Unit = {
    //类型推导
    var num = 10 //这时num就是Int
    //方式1，可以利用idea的提示来证明，给出提示
    //方式2，使用isInstanceOf[Int]判断
    println(num.isInstanceOf[Int])

    //类型确认后，就不能修改，说明Scala是强数据类型语言()

    //3.在声明/定义一个变量时，可以使用var或者val来修饰，var修饰的变量可改变，val修饰的变量不可改
    var age = 10 //即age是可以改变的
    age = 30 //ok
    val num2 = 40
    //num2 = 50 报错的
    /**
      * scala设计者为什么设计 var 和 val
      * 1、在实际编程，我们更多的需求是获取/创建一个对象后，读取该对象的属性
      * 或者是修改改对象的属性值，但是我们很少去改变这个对象本身
      * 2、因为val没有线程安全问题，因此效率高，scala的设计者推荐我们val
      * 3、如果对象需要改变，则使用var
      */
    val dog = new Dog
    dog.age=90
    dog.name="小花"
  }
}
class Dog{
  var age:Int=0
  var name:String=""
}