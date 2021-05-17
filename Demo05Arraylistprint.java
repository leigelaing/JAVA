package com.test01;
import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;
import com.test02.Student;
import java.util.ArrayList;
/*
  题目:定义以指定格式打印集合的方法（Arraylist类型作为参数）使用{}括起集合，使用@分割每个元素。
  格式参照 {元素1 @ 元素2 @ 元素3}
 */
public class Demo05Arraylistprint {
    public static void main(String[] args) {
     ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);
        printArraylist (list);
        /*
        定义方法的三要素：
          返回值类型：void
          方法名称：printArraylist
          参数列表：Arraylist
         */
    }
    public static void printArraylist (ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.print(s + " @ ");
        }
        System.out.print("}");
    }
}
