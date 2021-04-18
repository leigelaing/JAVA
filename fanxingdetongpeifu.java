package com.demo02;

import java.util.ArrayList;
import java.util.Iterator;

/*
   泛型的通配符 ：“？”：代表任意的数据类型
   使用方式：
   不能创建对象使用，只能作为方法的参数使用。
 */
public class fanxingdetongpeifu {
    public static void main(String[] args) {
        ArrayList<Integer> in1 = new ArrayList<>();
        in1.add(1);
        in1.add(2);
        in1.add(3);
        in1.add(4);
        in1.add(5);
        ArrayList<String> in2 = new ArrayList<>();
         in2.add("abc");
         in2.add("def");
         in2.add("bnb");
        printArray(in1);
        printArray(in2);
       // 不能创建对象使用，只能作为方法的参数使用.
        //ArrayList<?> arrl = new ArrayList<?>(); //报错
    }
    /*
       定义一个方法，能遍历所有ArrayList集合
       这时候我们并不知道ArrayList集合使用什么数据类型
       此时使用泛型的通配符“？”来接收数据类型
       注意泛型是没有继承概念的ArrayList<Object>是不对的。
     */
    public static void printArray(ArrayList<?> list){
        //使用迭代器遍历集合
        Iterator<?> it = list.iterator();
        while(it.hasNext()){
            //it.next()方法，取出的元素类型是Object，可以接收任意的数据类型。
            Object  O = it.next();
            System.out.println(O);
        }
    }
}
