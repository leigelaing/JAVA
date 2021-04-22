package com.Demo02;

import java.io.File;

/*
  java.io.File类
  作用：文件和目录路径名的抽象表示形式。
  java把电脑中的文件与文件夹（目录）封装为一个File类，
  我们可以使用File类对文文件，文件夹进行操作。
  我们可以使用file类的方法：
   1.创建一个文件/文件夹
   2.删除一个文件/文件夹
   3.获取文件/文件夹
   4.判断文件/文件夹是否存在。
   5.对文件/文件夹进行遍历。
   6.获取文件的大小
  File类与系统无关的类，任何的操作系统都可以使用类中的方法。
  重点记住三个单词：
    File：文件
    directory：文件夹（目录）
    path：路径
 */
public class demo01File {

   public static void main(String[] args) {
     /*
   File类的静态成员变量
static String pathSeparator ：与系统相关的路径分隔符字符，为方便起见，表示为字符串。
static char pathSeparatorChar ：与系统相关的路径分隔符。
static String separator ：与系统相关的默认名称 - 分隔符字符，以方便的方式表示为字符串。
static char separatorChar ：与系统相关的默认名称分隔符。

     操作路径：不能写死了：
      C:\develop\a\a.txt   windows
      C:/develop/a/a.txt   linux
      系统不一样，格式不一样，因此使用通用写法：
       C:"+File.separator+"develop"+File.separator+"a"+File.separator+"a.txt
   */
       String pathsep = File.pathSeparator;
       //路径分隔符：就是一个“;”,windows:分号  linux：冒号
       System.out.println(pathsep);
       String pathsep1 = File.separator;
       //文件名称分隔符：就是一个“\”；windows:\  linux：/
       System.out.println(pathsep1);

   }
}
