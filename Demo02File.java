package com.demo01;

import java.io.File;
/*
   File类判断功能的方法：
    public  boolean exists(); 次File表示的文件或者目录是否实际存在
    public  boolean isDirectory(); 此File表示的是否为目录
    public  boolean isFile();  此File表示的是否为文件。
 */
public class Demo02File {
    public static void main(String[] args) {
        show01();
        show02();
    }
     /*
       public  boolean exists(); 次File表示的文件或者目录是否实际存在
       用于判断构造方法中的路径是否为真的（绝对路径与相对路径都行）
       存在：true；
       不存在：false
     */
    private static void show01() {
        File f1 = new File("F:\\临时学习\\xuexi.jpg");
        boolean a = f1.exists();
        System.out.println(a);
        File f2 = new File("F:\\临时\\xuexi.jpg");
        boolean b = f2.exists();
        System.out.println(b);
        File f3 = new File("xuexi.jpg");
        boolean c = f3.exists();
        System.out.println(c);
    }
     /*
       public  boolean isDirectory(); 此File表示的是否为目录
          用于判断构造方法中给定的路径是否是文件夹结尾
          是：true
          不是：false
       public  boolean isFile();  此File表示的是否为文件。
         用于判断构造方法中给定的路径是否是文件结尾
           是：true
          不是：false
          注意：
          1.电脑的硬盘中只有文件或者文件夹因此两个方法是互斥的
          2.这两个方法使用前提，路径必须是存在的，否则都返回  false
      */
    private static void show02() {
        File f1 = new File("F:\\临时学习");
        boolean a = f1.isDirectory();
        System.out.println(a);
        File f2 = new File("F:\\临时学习\\xuexi.jpg");
        boolean b = f2.isFile();
        System.out.println(b);
    }
}
