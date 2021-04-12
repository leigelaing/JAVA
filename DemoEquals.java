package com.demo3;

import java.util.AbstractList;
import java.util.ArrayList;

public class DemoEquals {
    public static void main(String[] args) {
        /*
          person类继承了Object类，所以可以使用Object类的equals方法。
          equals方法的作用：
          比较其他某个对象与此对象是否“相等”。
          equals方法的源码：
          public boolean equals(Object obj) {
                return (this == obj);
           }
           参数：
           Object  obj :可以传递任意对象。
                 ==    ：比较运算符  返回的是一个boolean
             基本数据类型：比较的是值
             引用数据类型：比较的是两个对象的地址值
              this是谁？：那个对象调用的方法，this就代表那个对象。
              obj是谁：传递过去的参数值；
         */
        Person p1 = new Person("哈哈",18);
       // Person p2 = new Person("呵呵",20);
        Person p2 = new Person("哈哈",19);
        System.out.println(p1);//p1的地址
        System.out.println(p2);//p2的地址
         //将p2的地址值给p1
      //  p1 = p2;

        AbstractList<String> list = new ArrayList<>();

        boolean b = p1.equals(null);
        System.out.println(b);



    }
}
