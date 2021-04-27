package com.demo01;

import java.util.function.Predicate;

/*
需求：判断一个字符串，有两个判断条件
     1.判断字符串的长度是否大于5
     2.判断字符串中是否包含a
     两个条件满足一个即可，我们就可以使用||运算符连接两个条件
     predicate接口中有一个方法or，表示或者关系，也可以用于连接两个判断条件
     default Predicate<T> or(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) || other.test(t);
     }
     方法内部的两个条件，也是使用||运算符连接起来。
  */
public class Demo02Predicate_or {
    /*
     定义一个方法，方法的参数，传递一个字符串。
     传递两个Predicate接口
       一个用于判断字符串的长度是否大于5
       一个用于判断字符串中是否包含a
       两个条件满足一个即可
     */
    public static boolean checkString(String s, Predicate<String> p1, Predicate<String>p2){
        // return p1.test(s) || p2.test(s);
          return p1.or(p2).test(s);//等价于return p1.test(s) || p2.test(s);
    }
    public static void main(String[] args) {
        //定义一个字符串
        String s = "fbcdef";
        //调用checkString方法，参数传递字符串和两个lambda表达式
        boolean a = checkString(s,(String str)->{
            //判断字符串的长度是否大于5
            return str.length()>5;
        },(String str)->{
            // 判断字符串中是否包含a
            return str.contains("a");
        });
        System.out.println(a);
    }
}
