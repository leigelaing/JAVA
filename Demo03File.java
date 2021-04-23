package com.demo01;

import java.io.File;
import java.io.IOException;

/*
  File类创建删除功能的方法:
     public boolean  createNewFile();当且仅当具有该名称的文件尚不粗存在时，创建一个空文件
     public boolean  delete(); 删除由此File表示的文件或目录
     public boolean  mkdir();  创建由此文件File表示的目录
     public boolean  mkdirs(); 创建由此File表示的目录，包括任何必需但不存在的父目录。

 */
public class Demo03File {
    public static void main(String[] args) throws IOException {
        show01();
        show02();
        show03();
    }
    /*
     public boolean  createNewFile();当且仅当具有该名称的文件尚不粗存在时，创建一个空文件
       创建文件的路径和名称在构造方法中给出（就是构造方法的参数）
       返回值：boolean类型
         true：文件不存在，创建文件 返回 true
         false：文件存在，不创建文件 返回 false
       注意事项：
         1.此方法只能创建文件，不能创建文件夹
         2.创建文件的路径必须存在，否则抛出异常（抛出的是IO异常）
         public boolean createNewFile() throws IOException
         createNewFile()声明抛出了IO异常，我们调用这个方法，必须处理和这个异常
         要么Throws要么try—catch
      */
    private static void show01() throws IOException {
       File f1 = new File("F:\\临时学习\\a.txt");
       boolean a = f1.createNewFile();
        System.out.println(a);
        /*
        File f2 = new File("临时学习\\a1.txt");
        boolean b = f2.createNewFile();
        System.out.println(b);
         */
    }

    /*
      public boolean  mkdir();  :创建单级空文件夹
      public boolean  mkdirs(); 既可以创建单级文件夹，也可以创建多级空文件夹
      创建文件的路径和名称在构造方法中给出（就是构造方法的参数）
       返回值：boolean类型
         true：文件夹不存在，创建文件夹 返回 true
         false：文件夹存在，不创建文件夹 或者 构造方法中给出的路径不存在 返回 false
      注意事项：
      1.此两个方法只能创建文件夹不能创建文件
     */
    private static void show02() {
        File f1 = new File("F:\\临时学习\\操你妈");
        boolean a = f1.mkdir();
        System.out.println(a);
        /*
        File f2 = new File("临时学习\\操你妈的板板");
        boolean b = f2.mkdir();
        System.out.println(b);
       */
        File f3 = new File("F:\\临时学习\\操你妈妈aa\\操你爸\\操你儿子");
        boolean c = f3.mkdirs();
        System.out.println(c);
    }
        /*
          public boolean  delete(); 删除由此File表示的文件或目录
          此方法，可以删除构造方法路径中给出的文件或者文件夹
          返回值：boolean类型
          true：删除成功 返回 true
          false：文件夹中有内容，不会删除返回 false  或者构造方法中路径不存在 返回false
          注意事项：
          1.delete方法是直接在硬盘中删除文件/文件夹，不走回收站，删除要谨慎
        */
        private static void show03() {
            File f1 = new File("F:\\临时学习\\操你妈");
            /*
            File f2 = new File("F:\\临时学习\\操你妈妈aa");
            */
            File f3 = new File("F:\\临时学习\\a.txt");

            boolean a = f1.delete();
            /*
            boolean b = f2.delete();
            */
            boolean c = f3.delete();

            System.out.println(a);
            /*
            System.out.println(b);
            */
            System.out.println(c);

    }
}
