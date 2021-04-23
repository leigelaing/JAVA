package com.demo02;
/*
  java.io.OutputStream:字节输出流
   此抽象类是表示输出字节流的所有类的超类
   定义了一些子类共性的方法：
     public void  close():关闭此输出流并释放与此流相关的任何系统资源
     public void  flush():刷新此输出流并强制任何缓冲的输出字节被写出。
     public void  write(byte[] b);:将b.length字节从指定的字节数组写入此输出流。
     public void  write(byte[] b,int off,int len):从指定的字节数组写入len字节，从偏移量off
     开始输出到此输出流。
     public abstract void write(int b):将指定的字节输出流。

     java.io.FileOutputStream extends  OutputStream
     FileOutputStream:文件字节输出流
     作用：把内存中的数据写入到硬盘的文件中。

     构造方法：
       FileOutputStream(String name)创建一个向具有指定名称的文件中写入数据的输出文件流。
       FileOutputStream(File file)创建一个向指定File对象表示的文件中写入数据的文件输出流。
       参数：写入数据的目的
       String name；目的地是一个文件的路径
       File file ；目的地是一个文件
       构造方法的作用：
          1.创建一个FileOutputStream对象
          2.会根据构造方法中传递的文件/文件路径，创建一个空的文件
          3.会把FileOutputStream对象指向创建好的对象。

 */
public class OutputStream01 {

}
