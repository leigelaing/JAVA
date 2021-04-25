package com.demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
     flush方法与close方法的区别：
       flush：刷新缓冲区，流对象可以继续使用。
       close：先刷新缓冲区，然后通知系统释放资源，流对象不可以被再次使用。

   */
public class Demo03FlashandClose {
       public static void main(String[] args) throws IOException {
           // 1. 创建一个FileWriter对象，构造方法中绑定写入数据的目的地
           FileWriter fw =
                   new FileWriter
                           ("F:\\Javayunama\\leigeliang\\2021.4.24（JAVA）\\e.txt");
           //2. 使用FileWriter中的方法Write，把数据写入到内存缓冲区中（字符转换为字节的过程）
           // void write(int c) 写一个字符
           fw.write(97);
           // 3. 使用FileWriter中的方法flush，把内存缓冲区中的数据，刷新到文件中
           fw.flush();
           //刷新缓冲区，流对象可以继续使用。
           fw.write(98);
           //4. 释放资源（注意：先把内存缓冲区的数据刷新的文件中，再释放资源）
           fw.close();
           //close方法之后流已经关闭了，已经从内存中消失了，流就不能在使用了
           //先刷新缓冲区，然后通知系统释放资源，流对象不可以被再次使用。
           fw.write(99);
       }
}
