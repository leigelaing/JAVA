package com.demo01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
     （1）此两个方法一次写入多个字节
     public void  write(byte[] b);:将b.length字节从指定的字节数组写入此输出流。
     public void  write(byte[] b,int off,int len):从指定的字节数组写入len字节，从偏移量off
     开始输出到此输出流。
     （2）此方法一次写入一个字节
     public abstract void write(int b):将指定的字节输出流。
 */
public class OutputStream02 {
    public static void main(String[] args) throws IOException {
       //创建FileOutPutStream对象，构造方法中要绑定写入数据的目的地
        //F:\Javayunama\leigeliang\2021.4.24（JAVA）\b.txt
        FileOutputStream fos =
     new FileOutputStream(new File("2021.4.24（JAVA）\\b.txt"));
       //调用FileOutputStream对象中的write方法，将数据写入到文件中
       //面试题：在文件中显示100，写几个字节,答案：写三个字节，分贝别是ASCII表对应的1  0   0
        fos.write(49);
        fos.write(48);
        fos.write(48);
        //释放资源
        fos.close();
        /*
         public void  write(byte[] b);:将b.length字节从指定的字节数组写入此输出流。
           一次写多个字节
           如果写入的第一个字节是一个正数（0-127），那么显示的时候会查询对应的ASCII表
           如果写的第一个字节是负数，那第一个字节会和第二个字节，两个字节组成一个中文显示，查询系统默认码表（GBK）
         */
        FileOutputStream fos1 =
                new FileOutputStream(new File("2021.4.24（JAVA）\\c.txt"));
        //创建数组
        byte[] btes = {65,66,67,68};
        //写入数据
        fos1.write(btes);
        //释放资源
        fos1.close();
          /*
         public void  write(byte[] b,int off,int len):从指定的字节数组写入len字节，从偏移量off
         把字节数组的一部分写入文件中
          int off：数组的开始索引
          int len：写几个字节
         */
        FileOutputStream fos2 =
                new FileOutputStream(new File("2021.4.24（JAVA）\\d.txt"));
        //创建数组
        byte[] btes1 = {65,66,67,68};
        //写入数据
        fos2.write(btes,1,2);
        //释放资源
        fos2.close();
          /*
            写入字符的方法，可以使用String类中的方法把字符串，转换为字节数组。
             byte[] getBytes();把字符串转换为字节数组。
          */
        byte[] byte2 = "雷葛亮".getBytes();
        System.out.println(Arrays.toString(byte2));

    }
}
