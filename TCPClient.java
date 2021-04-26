package com.demo01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
/*
   TCP通信的客户端：向服务器发送连接请求，给服务器发送数据，读取服务器回写的数据
    表示客户端的类：
     java.net.Socket:
     该类实现客户端套接字（也称为“套接字”）。 套接字是两台机器之间通讯的端点。
     套接字：就是包含了IP地址与端口号的网络单位。
     构造方法：
     Socket(String host, int port) ：创建流套接字并将其连接到指定主机上的指定端口号。
     参数：
     String host：服务区主机的名称/服务器的IP地址
     int port：服务器的端口号
     成员方法：
     OutputStream getOutputStream() 返回此套接字的输出流。
     InputStream getInputStream()   返回此套接字的输入流。
     void close() 关闭此套接字。

     实现步骤：
     1.创建一个客户端对象Socket，构造方法绑定服务器的IP地址和端口号
     2.使用Socket对象中的方法 getOutputStream() 获取网络字节输出流 OutputStream对象
     3.使用网络字节输出流 OutputStream对象中的方法write给服务器发送数据。
     4.使用Socket对象中的方法getInputStream() 获取网络字节输入流 InputStream对象。
     5.使用网络字节输入流InputStream对象中的方法read，读取服务区回写的数据
     6.释放资源，（Socket）
     注意事项：
     1.客户端和服务器端进行交互，必须使用Socket中的提供的网络流，不能会用自己创建的流对象。
     2.当我们创建客户端对象的时候，就会去请求服务器和服务器经过3次握手建立连接通路。
        此时如果服务器没有启动，那么就会抛出服务器异常。
        此时如果服务器已经启动，那么就可以进行交互。
   */
public class TCPClient {
    public static void main(String[] args) throws IOException {
      //1.创建一个客户端对象Socket，构造方法绑定服务器的IP地址和端口号
      Socket socket = new Socket("192.168.43.139",8888);
      //2.使用Socket对象中的方法 getOutputStream() 获取网络字节输出流 OutputStream对象
      OutputStream outputStream = socket.getOutputStream();
      //3.使用网络字节输出流 OutputStream对象中的方法write给服务器发送数据。
      outputStream.write("你好！狗日的服务器尽快加".getBytes());
      //4.使用Socket对象中的方法getInputStream() 获取网络字节输入流 InputStream对象。
      //5.使用网络字节输入流InputStream对象中的方法read，读取服务区回写的数据
      //6.释放资源，（Socket）
      socket.close();
    }
}
