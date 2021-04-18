package com.demo01;

import java.util.ArrayList;
import java.util.Collection;

/*
   增强For循环，底层使用的也是迭代器，使用For循环的格式，简化了迭代器的书写
   是JDK1.5之后出现的新特性。
   Collection<E> extends It而able<E>;所有的单列集合都可以使用增强for循环。
   public interface Iterable<T> 实现这个接口允许对象成为“Foreach”语句的目标
   增强For循环：用来遍历集合与数组
   格式：
    for(集合/数组的数据类型 变量名 ： 集合名/数组名){
       输出语句（变量名）;
    }
 */
public class zengqiangFor {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {
    //使用增强For循环遍历集合
        //定义一个集合
        Collection<String> coll = new ArrayList<>();
        coll.add("类1");
        coll.add("类2");
        coll.add("类3");
        coll.add("类4");
        coll.add("类5");
        coll.add("类6");
        coll.add("类7");
        coll.add("类8");
        coll.add("类9");
        for(String str : coll){
            System.out.println(str);
        }
    }

    //使用增强for循环进行遍历数组
    private static void demo01() {
       int[] arr = {1,2,3,4,5,6};
       for(int in:arr){
           System.out.println(in);
       }
    }
}
