package com.demo3;

import java.util.Date;

public class DemoData1 {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }
    /*
      long getTime()：把当前日期转换为毫秒值（相当于currentTimeMillis()方法）
      返回自1970年1月1日00：00：00 GMT 以来此时Data对象表示毫秒数。
    */
    private static void demo03() {
        Date data = new Date();
        long time = data.getTime();
        System.out.println(time);

    }

    /*
      Data类的带参构造方法
      Data（long data）：传递毫秒值，把毫秒值转换为Data日期
    */
    private static void demo02() {
        Date data = new Date(0L);
        System.out.println(data);//Thu Jan 01 08:00:00 CST 1970
    }
    /*
      Date类的空参数构造方法
      Date（）：获取当前系统的日期和时间
   */
    private static void demo01() {
        Date data = new Date();
        System.out.println(data);//Mon Apr 12 19:01:07 CST 2021
    }
}
