package com.demo01;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
  java.io.BufferedWriter extends Writer
  BufferedWriter:字符缓冲输出流
  继承父类共性的成员方法：
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
          BufferedWriter(Writer out)
          创建使用默认大小的输出缓冲区的缓冲字符输出流。
          BufferedWriter(Writer out, int sz)
          创建一个新的缓冲字符输出流，使用给定大小的输出缓冲区。
      参数：
       Writer out：字符输出流
          我们可以传递FileWriter，缓冲流会给FileWriter增加一个缓冲区，
          提高FileWriter写入的效率
       int sz：指定缓冲区的大小，不写默认大小
    特有的成员方法：
           void newLine() 写一行行分隔符。
           （提供此特有的成员方法：会根据不同的操作系统，获取不同的行分隔符）
         行分隔符：
           windows：\r\n
           Linux:/n
           mos :/r
         使用步骤（重点）：
         1.创建一个FileWriter对象，构造方法中绑定要输出的目的地。
         2.创建字符缓冲输出流对象，构造方法传递字符输出流。
         3.调用字符缓冲输出流中的方法write，把数据写入到内存缓冲区中
         4.调用字符缓冲输出流中的方法flush，把内存缓冲区的数据给它刷新到文件中
         5.释放资源
 */
public class BufferedWriterw {
    public static void main(String[] args) throws IOException {
        //  1.创建一个FileWriter对象， 构造方法中绑定要输出的目的地。
        FileWriter fw = new FileWriter("F:\\Javayunama\\leigeliang\\2021.4.25(JAVA)\\a.txt");
        //  2.创建字符缓冲输出流对象，构造方法传递字符输出流。
        BufferedWriter bw = new BufferedWriter(fw);
        //3.调用字符缓冲输出流中的方法write，把数据写入到内存缓冲区中
        for (int i = 0; i < 10; i++) {
            bw.write("大声道");
            bw.write("\r\n");
            //换行使用方法
            bw.newLine();
        }
        //4.调用字符缓冲输出流中的方法flush，把内存缓冲区的数据给它刷新到文件中
        bw.flush();
        // 5.释放资源
        bw.close();
    }
}
