package com.demo01;

import java.io.File;
/*
    File类获取功能的方法：
      public String  getAdsolutePath（）；返回File的绝对路径名字符串
      public String getPath();将此File转换为路径名字符串
      public String getName();返回由此File表示的文件或目录的名称
      public long  length(); 返回由此File表示的文件的长度
 */
public class Demo01File {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();

    }
  /*
    public long  length(); 返回由此File表示的文件的长度.
    获取的是构造方法指定的文件的大小，以字节为单位。
    注意事项：
    1.文件夹没有大小概念的，不能获取文件夹大小
    2.如果构造方法中给出的路径不存在，那么length方法返回 0
    */
    private static void show04() {
        File f7 = new File("F:\\Javayunama\\leigeliang\\a.txt");
        long g = f7.length();
        System.out.println(g);
        //不能是文件夹大小：返回结果为 0  文件夹没有大小概念的
        File f8 = new File("F:\\Javayunama");
        long h = f8.length();
        System.out.println(h);
    }
    /*
       public String getName();返回由此File表示的文件或目录的名称
       获取就是构造方法传递路径的结尾部分（结尾要么是一个文件 或者是一个文件夹）
    */
    private static void show03() {
        File f5 = new File("F:\\Javayunama\\leigeliang\\a.txt");
        String e = f5.getName();
        System.out.println(e);//a.txt
        File f6 = new File("F:\\Javayunama\\leigeliang");
        String f = f6.getName();
        System.out.println(f);//leigeliang
    }
    /*
       public String getPath();将此File转换为路径名字符串
        获取的构造方法中传递的路径
        传入什么路径就返回什么路径
        toString（）方法，调用的就是getpath（）方法；
        源码：
         public String toString() {
         return getPath();
        }
    */
    private static void show02() {
        File f3 = new File("F:\\Javayunama\\leigeliang\\a.txt");
        String c = f3.getPath();
        System.out.println(c);//F:\Javayunama\leigeliang\a.txt
        File f4 = new File("a.txt");
        String d = f4.getPath();
        System.out.println(d);//a.txt

        System.out.println(f3);//F:\Javayunama\leigeliang\a.txt
        System.out.println(f3.toString());//F:\Javayunama\leigeliang\a.txt
    }
    /*
       public String  getAdsolutePath（）；返回File的绝对路径名字符串
       获取的构造方法中传递的路径
       无论路径是绝对的还是相对的getAdsolutePath（）方法返回的都是绝对路径
     */
    private static void show01() {
        File f1 = new File("F:\\Javayunama\\leigeliang\\a.txt");
        String a = f1.getAbsolutePath();
        System.out.println(a);
        File f2= new File("a.txt");
        String b = f2.getAbsolutePath();
        System.out.println(b);
    }

}
