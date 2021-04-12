package com.demo3;
/*
   java.util.Date:表示日期和时间的类
   类Date表示特定时间，精确到毫秒
   毫秒：千分之一秒。 1000毫秒==1秒
   特定的瞬间：一个时间点，一刹那时间。
   毫秒值的作用：可以对时间和日期进行计算。
   2009-01-03到2008-02-25一共有多少天
   将日期转换为毫秒计算，计算完毕将毫秒转换为日期

   把日期转换为毫秒：
   当前日期：2088-01-01
   时间原点（0毫秒）：1970年1月1日00:00:00;（英国格林威治的标准时间）
   就是计算当前日期到时间原点之间一共经历了多少毫秒。(1618224616936L)
   注意事项：
   中国属于东八区，会将时间增加8个小时。
   转换为中国的时间原点就是：1970年1月1日08:00:00
   把毫秒转换为日期：
   1天 = 24*60*60 = 86400秒 = 86400*1000 （毫秒）
 */
public class DemoData {
    public static void main(String[] args) {
        //获取当前系统时间，一共到1970年1月1日00:00:00经历了多少毫秒;
        System.out.println(System.currentTimeMillis());
    }
}
