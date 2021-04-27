package com.demo01;

import java.io.*;
import java.net.Socket;

/*
    文件上传案例的客户端，读取本地文件，上传到服务器，读取服务器回写的数据
    明确：
      数据源：F:\Javayunama\leigeliang\2021.4.26(JAVA)\\a.jpg
      目的地：服务器
     实现步骤：
     1.创建一个本地字节输入流，FileInputStream对象，构造方法中绑定需要读取的数据源。
     2.创建一个客户端Socket对象，构造方法中绑定服务器的IP地址与端口号
     3.使用Socker中的getOutputStream方法，获取网络字节输出流OutputStream对象。
     4.使用本地字节输入流FileInputStream对象的方法read，读取本地文件。
     5.使用网络字节输出流OutputStream对象中的方法Writer，把读取到的文件上传服务器上。
     6.使用Socker中的getInputStream方法，获取网络字节输入流InputStream对象。
     7.使用网络字节输入流InputStream对象的方法，读取服务器回写的数据。
     8.释放资源（FileInputStream，Socker）
   */
public class TCPClient {
    public static void main(String[] args) throws IOException {
      //  1.创建一个本地字节输入流，FileInputStream对象，构造方法中绑定需要读取的数据源。
      FileInputStream fis = new FileInputStream("F:\\Javayunama\\leigeliang\\2021.4.26(JAVA)\\\\a.jpg");
       // 2.创建一个客户端Socket对象，构造方法中绑定服务器的IP地址与端口号
      Socket soc = new Socket("192.168.1.98",9123);
      //3.使用Socker中的getOutputStream方法，获取网络字节输出流OutputStream对象。
      OutputStream ops = soc.getOutputStream();
      // 4.使用本地字节输入流FileInputStream对象的方法read，读取本地文件。
      int len = 0;
      byte[] bytes = new byte[1024];
      while((len =fis.read(bytes)) != -1){
        // 5.使用网络字节输出流OutputStream对象中的方法Writer，把读取到的文件上传服务器上。
        ops.write(bytes,0,len);
      }
      /*
        为了解决read方法的死循环问题，
        解决方法：
        上传完文件，给服务器写一个结束标记。
        使用Socket类中的void shutdownOutput() 禁用此套接字的输出流。
        对于TCP套接字，任何先前写入的数据将被发送，随后是TCP的正常连接终止序列。
         如果在套接字上调用shutdownOutput（）之后写入套接字输出流，则流将抛出IOException。
       */
       soc.shutdownInput();
      //6.使用Socker中的getInputStream方法，获取网络字节输入流InputStream对象。
      InputStream ips = soc.getInputStream();
      //7.使用网络字节输入流InputStream对象的方法，读取服务器回写的数据。
      while((len =ips.read(bytes) )!= -1){
        System.out.println(new String (bytes,0,len));
      }
      // 8.释放资源（FileInputStream，Socker）
      fis.close();
      soc.close();
    }
}
