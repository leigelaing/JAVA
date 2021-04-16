package com.demo01;

import java.util.Locale;

/*
   java.lang.StringBuilder类：字符串缓冲区，可以提高字符串的效率
   构造方法：
   StringBuilder()：构造一个不带任何字符的的字符串生成器，其初始容量为16个字符。
   StringBuilder(String str)： 构造一个初始化为指定字符串内容的字符串构建器。
 */
/*
   StringBuilder的常用方法：
     public StringBuilder oppend();添加任意数据的字符串形式，并返回当前对象自身。

     StringBuilder和String可以相互转换：
     String ——>StringBuilder   可以使用StringBuilder的构造方法。
         StringBuilder(String str)： 构造一个初始化为指定字符串内容的字符串构建器。
     StringBuilder——> String   可以使用StringBuilder中的toString方法。
     public String toString（）;将当前StringBuilder对象转换为String对象。

*/
public class StringBuilderMain {
    public static void main(String[] args) {

        // String ——>StringBuilder
        String str = "huhuhula";
        System.out.println(str);
        StringBuilder bu = new StringBuilder(str);
        //往StringBuilder中添加数据
        bu.append("world");
        System.out.println(bu);
        // StringBuilder——> String
        String s = bu.toString();
        System.out.println(s);
        //不带参数的构造方法
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1"+bu1);
       //带参构造方法
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2"+bu2);
       //创建StringBuilder对象
        StringBuilder bu3 = new StringBuilder();
        //添加oppend方法中往StringBuilder添加数据。
        //append方法返回的是this，调用方法的对象，this = bu3
        //把bu3的地址赋值给sb，因此使用append方法无需接收返回值
        StringBuilder sb = bu3.append("abc");
        System.out.println(bu3);
        System.out.println(sb);
        System.out.println(sb == bu3);//比较的是地址
        bu3.append("abc");
        bu3.append(1);
        bu3.append(true);
        bu3.append(8.8);
        bu3.append("中");
        System.out.println(bu3);
        /*
          链式编程：方法返回值是一个对象，我可以继续调用方法。
         */
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase());
        bu3.append("abc").append(8.8).append(1).append(true).append("中");
        System.out.println(bu3);
    }
}
