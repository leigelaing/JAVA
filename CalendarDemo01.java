package com.demo01;
import java.util.Calendar;
import java.util.Date;
/*
  Calender类的成员方法：
  public int get（int field）：返回给定日历字段的值。
  public void set（int field，int value）：将给定的日历字段设置为给定值。
  public abstract void add（int field，int amount）：根据日历的规则，为给定的日历字段添加或减去
  指定的时间量。
  public Date gettime（）：返回一个表示此Calender时间值，（从历元到现在的毫秒偏移量）的Date对象。
  成员方法：
  int field：日历类的字段，可以使用Calender类的静态成员变量获取：
        public static final int  YEAR = 1；  年
        public static final int  MONTH = 2； 月
        public static final int  DATE = 5；月中的某一天
        public static final int  DAY_OF_MONTH = 5;月中的某一天
        public static final int  HOUR = 10；时
        public static final int  MINUTE = 12； 分
        public static final int  SECOND = 13；秒
 */
public class CalendarDemo01 {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();
    }
   /*
     public Date gettime（）
     ：返回一个表示此Calender时间值，（从历元到现在的毫秒偏移量）的Date对象。
     作用：把日历对象转换为日期对象
   */
    private static void demo04() {
        //使用getInstance方法获取Calender对象。
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }
    /*
    public abstract void add（int field，int amount）：根据日历的规则，为给定的日历字段添加或减去
    指定的时间量。
    参数：
      int field：传递指定的日历字段（YEAR，MONTH...）
      int amount：增加/减少指定的值
       正数：增加
       负数：减少
     */
    private static void demo03() {
        //使用getInstance方法获取Calender对象。
        Calendar c = Calendar.getInstance();
        //把年增加两年
        c.add(Calendar.YEAR,2);
        //月份减少3个月
        c.add(Calendar.MONTH,-3);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);//返回当前对应的  年
        int month = c.get(Calendar.MONTH);
        System.out.println(month+1);//返回当前对应的  月（注意西方的月份是0-11）所有后面加1
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);//返回当前对应的  月中的某一天
    }
    /*
       public void set（int field，int value）：将给定的日历字段设置为给定值。
       参数：
            int field 传递指定的日历字段（YEAR，MONTH...）
            int value 给指定字段设置的值
    */
    private static void demo02() {
        //使用getInstance方法获取Calender对象。
        Calendar c = Calendar.getInstance();
        //设置年为5555
        c.set(Calendar.YEAR,5555);
         //设置月为9月(为外国的月，注意减1)
        c.set(Calendar.MONTH,9);
        //设置日 9日
        c.set(Calendar.DATE,9);
        //同时设置年月日：可以使用set的重载方法
        c.set(8888,555,444);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);//返回当前对应的  年
        int month = c.get(Calendar.MONTH);
        System.out.println(month+1);//返回当前对应的  月（注意西方的月份是0-11）所有后面加1
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);//返回当前对应的  月中的某一天
    }
    /*
      public int get（int field）：返回给定日历字段的值。
        参数：传递指定的日历字段（YEAR，MONTH...）
        返回值：日历字段代表具体值
     */
    private static void demo01() {
        //使用getInstance方法获取Calender对象。
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);//返回当前对应的  年
        int month = c.get(Calendar.MONTH);
        System.out.println(month+1);//返回当前对应的  月（注意西方的月份是0-11）所有后面加1
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);//返回当前对应的  月中的某一天
    }
}
