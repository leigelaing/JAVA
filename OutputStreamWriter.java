package com.demo01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
      java.io.OutputStreamWriter extends Writer
      OutputStreamWriter:是字符流通向字节流的桥梁，
      可使用指定的Charset将要流入的字符编码为字节（编码：把能看懂的的变为不能看懂的）

      继承自父类的共性方法：
       void write(int c) 写一个字符
        void write(char[] cbuf) 写入一个字符数组
        abstract void write(char[] cbuf, int off, int len) 写入字符数组的一部分，
             off（开始索引）len(写的字符个数)
        void write(String str) 写一个字符串
        void write(String str, int off, int len)：写入字符串的某一部分，
             off（开始索引）len(写的字符个数)
        void flush() 刷新流。
        void close() 关闭流，先刷新。
        构造方法：
        OutputStreamWriter(OutputStream out)
        创建一个使用默认字符编码的OutputStreamWriter。
        OutputStreamWriter(OutputStream out, String charsetName)
        创建一个使用命名字符集的OutputStreamWriter。
     参数：
        OutputStream out：字节输出流，可以用来写转换之后的字节到文件中
        String charsetName：指定的编码表名称，不区分大小写，可以是UTF-8/GBK...
        不指定默认使用UTF-8。
        使用步骤：
        1.创建OutputStream对象，构造方法中传递字节输出流和指定的编码表名称
        2.使用OutputStreamWriter对象中的方法Write，把字符转换为字节存储到缓冲区（编码）
        3.使用OutputSreamWriter对象，中的方法flush，把内存中缓冲区的字节刷新到文件中，
        （使用字节流写字节的过程）
        4.资源释放
          */
/*
public class OutputStreamWriter {
        public static void main(String[] args) throws IOException {
            WriteUTF_8();
        }
     /*
      使用转换流OutputStreamWriter 写UTF_8格式的文件。

      */
       // private static void WriteUTF_8() throws IOException {
         // 1.创建OutputStream对象，构造方法中传递字节输出流和指定的编码表名称
          //  OutputStreamWriter osu =
          //          new OutputStreamWriter
                 //           (new FileOutputStream("F:\\Javayunama\\leigeliang\\2021.4.25(javaA)\\UTF-8"),"UTF-8")
        //2.使用OutputStream对象中的方法Write，把字符转换为字节存储到缓冲区（编码）

      //  }
    //}
