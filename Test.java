package com.demo3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
  练习题：请使用日期函数API，计算出一个人出生了多少天
  分析：
  1.获取出生日期：Scanner 方法
  2.使用DateFormat类中的方法，parse方法，把字符串解析为Date格式
  3.把Date格式的出生日期，转换为毫秒值
  4.把获取的当前日期也转换为毫秒值。
  5.使用当前日期的毫秒值 - 出生日期的毫秒值
  6.把毫秒值的差值转换为天（s/1000/60/60/24）；


 */
public class Test {
    public static void main(String[] args) throws ParseException {
      // 1.获取出生日期：Scanner 方法
        Scanner input = new Scanner(System.in);
        System.out.println("请输入出生日期：格式为：yyyy-MM-dd");
        String birthday = input.next();
      // 2.使用DateFormat类中的方法，parse方法，把字符串解析为Date格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdaydate = sdf.parse(birthday);
      // 3.把Date格式的出生日期，转换为毫秒值
       long birthdaytime = birthdaydate.getTime();
      //  4.把获取的当前日期也转换为毫秒值。
      long today = new Date().getTime();
       //5.使用当前日期的毫秒值 - 出生日期的毫秒值
        long time = today - birthdaytime;
        //6.把毫秒值的差值转换为天（s/1000/60/60）；
        System.out.println(time/1000/60/60/24);

    }
}
