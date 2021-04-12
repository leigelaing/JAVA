package com.demo3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
  java.lang.Object类
  类Object是类层次的根类（最顶层的类），
  每个类都使用Object作为超类。
  所有对象（包括数组）都实现这个类的方法
 */
public class ToString {
    public static void main(String[] args) {
   /*
      person默认继承了Object类。所以可以使用Object类中的toString方法。
       String toString();
       返回值对象的字符串表示。
    */
        Person p = new Person("张三",20);
        String s = p.toString();//com.demo3.Person@1b6d3586

        System.out.println(s);//com.demo3.Person@1b6d3586
        //直接打印对象的名字，其实就是调用对象的toString方法，p = p.toString
        System.out.println(p);

       //看一个类是否重写toString方法，直接打印这个类对应对象的名字即可，
        // 如果没有重写toString方法，那么打印的就是对应的地址值。
        //如果重写了，那就按照重写的内容进行打印

        //没有重写toString方法
        Random r = new Random();
        System.out.println(r);
        //有重写toString方法
        Scanner b = new Scanner(System.in);
        System.out.println(b);
       //有重写toString方法
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
    }
}
