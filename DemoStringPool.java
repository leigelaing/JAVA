package com.wanshang;
/*
  字符串常量池：程序当中直接写上双引号字符串，就在字符串常量池中。

  对于基本类型来说， ==  是进行数值的比较
  对于引用类型来说， ==  是进行【地址值】的比较
 */

public class DemoStringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] charsArray = {'a','b','c'};
        String str3 = new String(charsArray);
        System.out.println(str1 == str2);//true
        System.out.println(str2 == str3);//false
        System.out.println(str3 == str1);//false
    }
}