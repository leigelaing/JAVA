package com.demo3;
import java.text.ParseException;
import java.util.Date;

import java.text.SimpleDateFormat;


public class DataFormart {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }
/*
    使用DataFormat类中的parse方法，把文本解析为日期
        使用步骤：
        1.创建SimpleDateFormat对象，构造方法中传递指定模式
        2.调用SimpleDateFormat对象中的方法parse，把符合构造方法中模式的字符串，解析为Date日期。
        注意事项：
         public Date parse(String source)throws ParseException
         parse方法声明了一个异常叫：ParseException（解析异常）
         如果字符串和构造方法的模式不一样，那么程序就会抛出此异常。
         调用一个抛出异常的方法，就必须的处理这个异常，要么throws继续抛出异常，要么try catch
           自己处理。

 */
    private static void demo02() throws ParseException {
        SimpleDateFormat si = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
       Date da = si.parse("2021年04月12日19时48分13秒");
        System.out.println(da);
    }

    /*
       使用DataFormat类中的方法format，把日期格式为文本
        使用步骤：
        1.创建SimpleDateFormat对象，构造方法中传递指定模式
        2.调用SimpleDateFormat对象中的方法，
        按照构造方法中指定的模式，把Data日期格式化为符合模式的字符串（文本）。

     */
    private static void demo01() {
       // 1.创建SimpleDateFormat对象，构造方法中传递指定模式
        SimpleDateFormat si = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
       //2.调用SimpleDateFormat对象中的方法，
        // 按照构造方法中指定的模式，把Data日期格式化为符合模式的字符串（文本）。
        //String format (Data data);  按照指定格式，把Data日期格式化为符合模式的字符串
        //先创建一个Data
        Date date = new Date(); //使用Data类的无参构造方法，获取当前电脑时间
        String d = si.format(date);
        System.out.println(date);
        System.out.println(d);
    }
}
