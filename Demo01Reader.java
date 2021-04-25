package com.demo01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
  java.io.reader:字符输入流的，是字符输入流最顶层的父类，定义了一些共性的成员方法，是一个抽象类
  共性的成员方法：
   int read（）:  读取单个字符
   int read（char[] cbuf）: 一次读取多个字符，将字符读入数组
   void close（）：关闭该类并释放与之关联的所有资源。
   java.io.FileReader extends InputStreamREader extends Render
   FileReader:文件字符输入流
   作用：把文件中的数据以字符的方式读取到内存中。

   构造方法：
     FileReader(String fileName)：
     FileReader(File file)：
     参数：读取文件的数据源
     String fileName ：文件的路径
     File file ： 一个文件
    作用：
      1.创建一个FileReader对象。
      2.会把FileReader对象指向要读取的文件。

      字符输入流的使用步骤：
      1.创建一个FileReader对象，构造方法中绑定要读取的数据原。
      2.使用Filereader对象中的read方法，读取文件
      3.释放资源

 */
public class Demo01Reader {
    public static void main(String[] args) throws IOException {
        //1.创建一个FileReader对象，构造方法中绑定要读取的数据原。
        FileReader fr =
                new FileReader
                ("F:\\Javayunama\\leigeliang\\2021.4.24（JAVA）\\c.txt");
        // 2.使用Filereader对象中的read方法，读取文件
        //   int read（）:  读取单个字符
        /*
        int len = 0;
        while((len = fr.read()) != -1){
            System.out.print((char)len);
        }
        */
        // int read（char[] cbuf）: 一次读取多个字符，将字符读入数组
        char[] cs = new char[1024];//存取读取到的多个字符
        int len = 0;//记录的是每次读取的有效字符的个数
        while((len = fr.read(cs)) != -1){
            /*
              String类的构造方法：
                String(char[] value);把字符数组转换为字符串
                String (char[] value,int offset,int count);
                把字符数组的一部分转换为字符串。
                offset：数组的开始索引
                count：转换个数
             */
            System.out.println(new String(cs,0,len));
        }
        //3.释放资源
        fr.close();
    }
}
