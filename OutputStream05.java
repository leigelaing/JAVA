package com.demo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
   字节输入流一次读取多个字节的方法：
     int read(byte[] b);从输入流读取一些字节数，并将它们存储到缓冲区 b 。
     使用此方法明确两件事：
    1.方法的参数byte[]的作用？
       起到缓冲作用，存储每次读取到的多个字节
       数组的长度一般定义为1024（1Kb）,或者1024的整数倍
    2.方法的返回值int是什么？
       每次读取的有效字节个数
    String类的构造方法：
    String(byte[] bytes);  把字节数组转换为字符串
    String(byte[] bytes,int offset,int length);把字节数组转换为字符串
     offset：数组的开始索引
     length：转换字节个数
  */
public class OutputStream05 {
    public static void main(String[] args) throws IOException {
       //1.创建一个FileInputStream对象
        FileInputStream fis =
                new FileInputStream
                        ("F:\\Javayunama\\leigeliang\\2021.4.24（JAVA）\\b.txt");
       /*
        //使用FileInputStream对象中的read方法读取文件
          byte[] bytes = new byte[2];
          int len = fis.read(bytes);
          System.out.println(len);
        System.out.println(Arrays.toString(bytes));
        //把字节数组转换为字符串
        System.out.println(new String(bytes));

        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));

        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));

        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));
        */
        /*
           发现以上读取时一个重复的过程，可以使用循环优化
           不知道文件中有多上字节使用while循环
           while循环结束条件，读取到-1结束。
         */
          byte[] byt = new byte[1024];//存取读取到的多个字节
          int le = 0;//记录酶促读取的有效字节个数
          while((le = fis.read(byt))!= -1){
              //因为浪费空间使用第二个构造方法
              //  String(byte[] bytes,int offset,int length);把字节数组转换为字符串
              System.out.println(new String(byt,0,le));
          }
        //释放资源
        fis.close();

        /*
          原TXT文件中存入的是：abcde
          程序运行结果：
                 2
             [97, 98]
ab
2
[99, 100]
cd
1
[101, 100]
ed
-1
[101, 100]
ed
 */
    }
}
