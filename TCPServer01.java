package com.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
   创建BS版本的TCP服务器

  */
public class TCPServer01 {
      public static void main(String[] args) throws IOException {
          //1.创建一个服务器ServerSocket，和系统要指定的端口号
          ServerSocket ser  = new ServerSocket(8920);
          //2.使用accept方法获取请求的客户端对象（浏览器请求的）
          Socket socket = ser.accept();
          //3.使用socket对象的方法，getInputStream，获取到网络字节输入流InputStream对象
          InputStream inps = socket.getInputStream();
          //4.使用网络字节输入流InputStream对象中的方法read()读取客户端的请求信息
          byte[] bytes = new byte[1024];
          int len = 0;
          while((len = inps.read(bytes)) != -1){
              System.out.println(new String(bytes,0,len));
          }
      }
}
