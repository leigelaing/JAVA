package Demo02;

import java.io.*;

/*
  java.io.OutputStreamWriter  extends Writer
  OutputStreamWriter:是字符流通向字节流的桥梁：可使用指定的Charset，将要写入流中的字符编码
  称字节。（编码：能看懂的变为看不懂的）
  继承自父类的共性成员方法：
    void write(int c) 写一个字符
        void write(char[] cbuf) 写入一个字符数组
        void write(String str) 写一个字符串
        abstract void write(char[] cbuf, int off, int len) 写入字符数组的一部分，
         off（开始索引）len(写的字符个数)
        void write(String str, int off, int len)：写入字符串的某一部分，
        off（开始索引）len(写的字符个数)
        void flush() 刷新流。
        abstract void close() 关闭流，先刷新。
     构造方法：
      1.OutputStreamWriter(OutputStream out)
        创建一个使用默认字符编码的OutputStreamWriter。
      2.OutputStreamWriter(OutputStream out, String charsetName)
        创建一个使用命名字符集的OutputStreamWriter。
   参数：
      OutputStream out：字节输出流，可以用来写转换之后的字节到文件中
      String charsetName：指定编码表名称，不区分大小写，可以是：GBK，Utf-8，.....
      注意：不指定默认为：UTF-8
      使用步骤：
      1.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称。
      2.使用OutputStreamWriter对象中的Write，把字符转换为字节存储缓冲区中（编码）
      3.使用OutputStreamWriter对象中的flush，把内存缓冲区中的字节刷新到文件中。
      4.释放资源。
 */
public class Demo01OutPutStreamWriter {
    public static void main(String[] args) throws IOException {
        writerUTF_8();
    }
   /*
    使用转换流OutputStreamWriter写UTF-8 文件
   */
    private static void writerUTF_8() throws IOException {
    //1.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表名称。
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Demo02\\2021.5.18"),"UTF-8");
     //2.使用OutputStreamWriter对象中的Write，把字符转换为字节存储缓冲区中（编码）
        osw.write("雷葛亮");
     //3.使用OutputStreamWriter对象中的flush，把内存缓冲区中的字节刷新到文件中。
        osw.flush();
     //4.释放资源。
        osw.close();
    }
}
