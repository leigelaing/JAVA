package com.demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
     字符输出流写数据的其他方法：
        void write(char[] cbuf) 写入一个字符数组
        void write(String str) 写一个字符串
        abstract void write(char[] cbuf, int off, int len) 写入字符数组的一部分，
             off（开始索引）len(写的字符个数)
        void write(String str, int off, int len)：写入字符串的某一部分，
             off（开始索引）len(写的字符个数)
 */
public class Demo04Writer {
    public static void main(String[] args) throws IOException {
    FileWriter fw =
      new FileWriter
           ("F:\\Javayunama\\leigeliang\\2021.4.24（JAVA）\\c.txt");

          //void write(char[] cbuf) 写入一个字符数组
          char[] sc = {'a','b','c','d','e'};
          fw.write(sc);
        //abstract void write(char[] cbuf, int off, int len) 写入字符数组的一部分，
        // off（开始索引）len(写的字符个数)
          fw.write(sc,1,3);
          //void write(String str) 写一个字符串
          fw.write("leigleiang");
          //void write(String str, int off, int len)：写入字符串的某一部分，
          //     off（开始索引）len(写的字符个数)
          fw.write("无怨无悔",1,3);
        fw.close();
    }
}
