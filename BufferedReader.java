package com.demo01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
   java.io.BufferedReader extends Reader
    继承父类共性的成员方法：
   int read（）:  读取单个字符
   int read（char[] cbuf）: 一次读取多个字符，将字符读入数组
   void close（）：关闭该类并释放与之关联的所有资源。
   构造方法：
   BufferedReader(Reader in)
   创建使用默认大小的输入缓冲区的缓冲字符输入流。
   BufferedReader(Reader in, int sz)
   创建使用指定大小的输入缓冲区的缓冲字符输入流。
    参数：
   Reader in；字符输入流
    我们可以传递FileReader，缓冲流会给FileReader增加缓冲区，提高fileReader的读取效率。
   int sz：
  特有的成员方法：
     String readLine() 读一行文字。（读取一行数据）。
     行的终止符号：换行（'\n'）回车（'\r'）,或者回车之后直接跟着换行（'\r\n'）.
     返回值：
       包括该行内容的字符串，不包含任何终止符，如果已到流末尾，则返回null
     使用步骤（重点）：
     1.创建字符缓冲输入流对象，构造方法中传递字符输入流
     2.使用字符缓冲输入对象中的方法，read/readLine读取文本
     3.释放资源
   */
/*
public class BufferedReader {
    public static void main(String[] args) throws FileNotFoundException {
      //1.创建字符缓冲输入流对象，构造方法中传递字符输入流
      BufferedReader br = new BufferedReader
              (new FileReader("F:\\Javayunama\\leigeliang\\2021.4.25(JAVA)\\a.txt"));
      // 2.使用字符缓冲输入对象中的方法，read/readLine读取文本
      String line = br.readLine();
      System.out.println(line);
      //3.释放资源
      br.clone();
    }
}
*/