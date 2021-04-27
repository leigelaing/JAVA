package com.demo01;

import java.util.function.Predicate;

/*
需求：判断一个字符串。
        1.判断字符串的长度是否大于5
        如果字符串的长度大于5，返回false
        如果字符串的粗长度不大于5，返回true
        所以我们可以使用取反符号！对判断的结果进行取反。

      predicate接口中有一个方法negate，也表示取反的意思。
      源码：
      default Predicate<T> negate(){
          return(t)-> !test(t);
      }
 */
public class Demo01Predicate_negate {
    /*
    定义一个方法，方法的参数，传递一个字符串。
    使用Predicate接口判断字符串的长度是否大于5
    */
    public static boolean checkString(String s, Predicate<String> p1){
      //return !p1.test(s);
      return p1.negate().test(s);
    }

    public static void main(String[] args) {
        //定义一个字符串
        String s = "abc";
        //调用checkString方法，参数传递字符串和lambda表达式
        boolean b =  checkString(s,(String str)->{
            return str.length()>5;
        });
        System.out.println(b);
    }
}
