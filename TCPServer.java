package com.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/*
    TCP通信的服务器端，接收服务器端的客户请求，读取客户端的发送的数据，给客户端回写数据。
    表示服务器的类：
    java.net.SreverSocket:这个类实现了服务器套接字。
    构造方法：
    ServerSocket(int port);创建绑定到指定端口的服务器套接字。
    服务器端必须明确一件事情：必须的知道是哪个客户端请求的服务器
    所以可以使用accept方法获取到请求的客户端对象Socket
    成员方法：
    Socket accept() 侦听要连接到此套接字并接受它。
    服务器的实现步骤：
    1.创建服务器SreverSocket对象和系统指定的端口号
    2.使用ServerSocket对象中的方法，accept，获取到请求的客户端对象Socket
    3.使用Socket对象中的方法getInputStream() 获取网络字节输入流 InputStream对象。
    4.使用网络字节输入流InputStream对象中的方法read，读取服务区回写的数据
    5.使用Socket对象中的方法 getOutputStream() 获取网络字节输出流 OutputStream对象
    6.使用网络字节输出流 OutputStream对象中的方法write，给客户端会写数据
    7.释放资源（Socket， ServerSocket）
   */
public class TCPServer {
      public static void main(String[] args) throws IOException {
          // 1.创建服务器SreverSocket对象和系统指定的端口号
          ServerSocket serverSocket = new ServerSocket(8888);
         //  2.使用ServerSocket对象中的方法，accept，获取到请求的客户端对象Socket
          Socket socket = serverSocket.accept();
         // 3.使用Socket对象中的方法getInputStream() 获取网络字节输入流 InputStream对象。
          InputStream is = socket.getInputStream();
         // 4.使用网络字节输入流InputStream对象中的方法read，读取服务区回写的数据
         byte[] bytes = new byte[1024];
         int len = is.read(bytes);
          System.out.println(new String(bytes,0,len));
         // 5.使用Socket对象中的方法 getOutputStream() 获取网络字节输出流 OutputStream对象
          OutputStream os = socket.getOutputStream();
        // 6.使用网络字节输出流 OutputStream对象中的方法write，给客户端会写数据
          os.write("老子听到了".getBytes());
          // 7.释放资源（Socket， ServerSocket）
          socket.close();
          serverSocket.close();
      }
}
