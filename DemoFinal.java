package com.demo5;
/*
  final 关键字代表最终的，不可改变的
  常见的四种用法：
  1.可以用来修饰一个类
  2.可以用来修饰一个方法
  3.可以用来修饰一个成员变量
  4.可以用来修饰一个局部变量
 */
public class DemoFinal {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        num = 20;
        System.out.println(num);

        //一旦使用final用来修饰局部变量，那么这个变量就不能进行更改。
        //“一次使用终身不改”
        final int num2 = 200;
        System.out.println(num2);
        //num2已经被final修饰，不能被改变。
        //num2 = 300;
        //num2已经被final修饰，不能被改变,重新赋值200也是不可以的。
        //num2 = 200;

        //以下是正确写法，只要保证唯一一次赋值即可。
        final int num3 ;
        num3 = 3;

        //对于基本类型来说，不可改变说的是变量当中的数据不可改变
        //对于引用类型来说，不可改变说的是变量当中的地址值不可改变。

        Student student = new Student("张研萌");
        System.out.println(student.getName());
        System.out.println(student);
        student = new Student("儿子");
        System.out.println(student.getName());
        System.out.println(student);
        System.out.println("===================");
        final Student student1 = new Student("爸爸");
        System.out.println(student1.getName());
        //student已经被final修饰不能改变，final引用数据类型，其中的地址值不可改变
        //student1 = new Student("妈妈");

        //注意：对于引用类型来说，不可改变说的是变量当中的地址值不可改变。就是来创建对象名明不能指向其他变量
        //也就是说 对象名里面的地址值不能再被改变，但是地址存储的内容是可以改变的、
        //请看以下代码
        final Student student2 = new Student("爷爷");
        System.out.println(student1.getName());
        //意思就是 地址值因为final值不能发生改变，但是地址值对应存储里面的内容已经被改变了，可以改变
        student2.setName("婆");
        System.out.println(student2.getName());
    }

}
