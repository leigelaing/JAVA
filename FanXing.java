package com.demo01;

import java.util.ArrayList;
import java.util.Iterator;

public class FanXing {
    public static void main(String[] args) {
        //show01();
        show02();
    }
     /*
       创建集合对象，使用泛型
       好处：
       1.避免了集合转换的麻烦，存储的是什么类型，取出的就是什么类型。
       2.把运行期异常（代码运行之后会抛出的异常），提升到了编译期（写代码的时候就会报错）。
       弊端：
       泛型是什么类型，只能存储什么类型的数据
     */
    public  static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("我爱你");
        list.add("affg");
        //list.add(123);//不能存储整型
        //使用迭代器遍历list集合
        //获取迭代器
        Iterator <String> it = list.iterator();
        //使用迭代器中的方法叫HasNext（）遍历集合
        while(it.hasNext()){
            //取出元素也是Object类型
            String ob = it.next();
            System.out.println(ob);
            System.out.println(ob.length());
    }
    /*
       创建集合对象，不使用泛型
       好处：
        集合不使用泛型，默认的类型就是Object类型，可以存放任意数据类型
        弊端：
        不安全 会引发异常
    */
  //  public static void show01(){
      //  ArrayList list = new ArrayList();
        list.add("张研萌");
    //    list.add(3);
        //使用迭代器遍历list集合
        //获取迭代器
     //   Iterator it = list.iterator();
        //使用迭代器中的方法叫HasNext（）遍历集合
        while(it.hasNext()){
            //取出元素也是Object类型
            Object ob = it.next();
            System.out.println(ob);
            //想要使用String类特有的方法，length获取字符串的长度，不能使用，多态 Object ob = "abc";
            //需要向下转型
            //ClassCastException(类型转换异常)   不能把Integer类型转换为String类型。
            String s = (String)ob;
            System.out.println(s.length());
        }
    }
}
