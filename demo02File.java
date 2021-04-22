package com.Demo02;

import java.io.File;

/*
  路径：
      绝对路径：是一个完整的路径
            以盘符（C D盘）开始的路径
             C:\\users\\itcast\\IdeaProject\\shuangyuan\\123.txt
      相对路径：是一个简化的路径
            相对指的是相对于当前项目的跟目录：
            （ C:\\users\\itcast\\IdeaProject\\shuangyuan\\123.txt）
         C:\\users\\itcast\\IdeaProject\\shuangyuan\\123.txt
        简化为——>123.txt（可以省略项目的根目录）
        注意：
        1.路径是不区分大小写的
        2.路径中的文件名称分隔符windows使用反斜杠，反斜杠是转义字符，两个反斜杠代表一个普通的斜杠。
 */
public class demo02File {
    public static void main(String[] args) {
     /*
      File类非构造方法：
      */
        show01();
        show02("c:\\","a.txt");
        show02("d:\\","a.txt");
        show03();
    }
    /*
    File(String pathname)
    通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
      参数：
      String pathnam：字符串的路径名称
      路径可以是以文件结尾，也可以是文件夹结尾
      路径可以是相对路径，也可以是绝对路径
      路径可以是存在的，也可以是不存在的
      创建File对象，只是把字符串封装为File对象，不考虑路径的真假情况。
     */
    private static void show01() {
     File file = new File("C:\\users\\itcast\\IdeaProject\\shuangyuan\\123.txt");
     System.out.println(file);//重写了Object类的toString方法
    //以文件夹结尾
        File file1 = new File("C:\\users\\itcast\\IdeaProject\\shuangyuan");
        System.out.println(file1);//重写了Object类的toString方法
      //相对路径
        File file2 = new File("123.txt");
        System.out.println(file2);//重写了Object类的toString方法
    }
    /*
     File(String parent, String child)
         从父路径名字符串和子路径名字符串创建新的 File实例。
         参数：  把路径分为两部分，
          一部分叫：String parent（父路径）
          另一部分叫：String child（子路径）
          好处：
          父路径与子路径，可以单独书写，使用起来非常灵活，父路径与子路径都可以变化
     */
    private static void show02(String parent, String child) {
        File file3 = new File(parent,child);
        System.out.println(file3);
    }
    /*
       File(File parent, String child)
      从父抽象路径名和子路径名字符串创建新的 File实例。
       参数：  把路径分为两部分，
          一部分叫：String parent（父路径）
          另一部分叫：String child（子路径）
       好处：
        1.父路径与子路径，可以单独书写，使用起来非常灵活，父路径与子路径都可以变化
        2.父路径是File类型，可以使用File类的方法，对路径进行一些操作，再使用路径创建对象。
     */
    private static void show03() {
        File parent = new File("C:\\");
        File file5 = new File(parent,"Hellow.java");
        System.out.println(file5);
    }
}

