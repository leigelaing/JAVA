package com.demo01;

import java.util.function.Predicate;
/*
  java.util.function.Predicate<T>接口
  作用：对某种数据类型的数据进行判断，结果返回一个boolean值
  predicate接口中包含一个抽象方法:
  boolean test(T t):用来对指定数据类型的数据进行判断的方法。
    结果：
        符合条件：true
        不符合条件：flase
 */
public class demo01Predicate {
  /*
    定义一个方法：
     参数传递一个String类型的字符串
     传递一个Predicate接口，泛型使用String
     使用Predicate中的方法test对字符串进行判断，并把判断值返回
  */
    public static boolean  method(String name, Predicate<String> p){
        return p.test(name);
    }

    public static void main(String[] args) {
        //定义一个字符串
        String s = "abcde";
        //调用method方法对字符串进行校验，参数传递字符串和lambda表达式
        boolean b = method(s, (String str) -> {
            //对参数传递的字符串进行判断，判断的字符串长度是否大于5，并把判断的结果返回
            return str.length() > 5;
        });
        System.out.println(b);
        //优化lambda表达式
        boolean b1 = method(s, (String str) ->
            //对参数传递的字符串进行判断，判断的字符串长度是否大于5，并把判断的结果返回
             str.length() > 5
        );
    }
}
