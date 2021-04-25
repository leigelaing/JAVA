package com.demo01;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
  java.io.InputStream 字节输入流
  此抽象类是表示字节输入流的所有类的超类
  定义了所有子类共性的方法：
   int read();从输入流读取数据的下一个字节。
   int read(byte[] b);从输入流读取一些字节数，并将它们存储到缓冲区 b 。
   void close() ;关闭此输入流并释放与流相关联的任何系统资源。
   InputStream类子类：
  java.io.FileInputStream extends InputStream
  FileInputStream文件字节输入流
  作用：
    把硬盘文件中的数据，读取到内存中使用。

    构造方法：
    FileInputStream(String name)
    通过打开与实际文件的连接来创建一个 FileInputStream ，该文件由文件系统中的路径名 name命名。
    FileInputStream(File file)
    通过打开与实际文件的连接创建一个 FileInputStream ，该文件由文件系统中的 File对象 file命名。
    参数：读取文件的数据源
     String name：文件的路径
      File file：文件
     构造方法的作用
      1.会创建一个FileInputStream对象。
      2.会把FileInputStream对象指定构造方法中要读取的文件。

   读取数据的原理（硬盘——>内存）
     java程序——> JVM ——> OS ——> OS读取数据的方法 ——> 读取文件
     字节输入流的使用步骤：
     1.创建一个FileInputStream对象，构造方法中绑定要读取的数据源
     2.使用FileInputStream对象，中的方法read，读取文件
     3.释放资源

  */
public class OutputStream04 {
      public static void main(String[] args) throws IOException {
         //1.创建一个FileInputStream对象，构造方法中绑定要读取的数据源
          //F:\Javayunama\leigeliang\2021.4.24（JAVA）\\b.txt
          FileInputStream fis =
                  new FileInputStream
                          ("F:\\Javayunama\\leigeliang\\2021.4.24（JAVA）\\\\b.txt");
        //2.使用FileInputStream对象，中的方法read，读取文件
         //int read() 读取文件中的一个字节并返回，读取到文件的末尾返回-1
         /*
          int len = fis.read();
          System.out.println(len);
           len = fis.read();
          System.out.println(len);
           len = fis.read();
          System.out.println(len);
           len = fis.read();
          System.out.println(len);
            */
          /*
           发现以上代码读取文件是一个重复的过程，所以可以使用循环优化
           不知道文件的需要循环多少次，所以使用while循环
           while循环的结束的条件是，读取到-1停止。

           (len1 = fis.read()) != -1；表达式有三层含义
             1.fis.read(),读取一个字节
             2.len1 = fis.read();把读取到的变量赋值len1
             3.(len1 = fis.read()) != -1：判断变量len1是否等于-1
           */
          int len1 = 0;
          while((len1 = fis.read()) != -1){
              System.out.println((char)len1);
          }
          //3.释放资源
          fis.close();
      }
}
