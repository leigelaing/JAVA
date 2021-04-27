package com.demo01;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
/*
  文件上传案例服务器端：读取客户端上传的文件，保存到服务器的硬盘上，给客户端回写上传成功。
  明确：
    数据源：客户端上传的文件
    目的地：服务器的硬盘：
  实现步骤：
  1.创建一个服务器ServerSocket对象，和系统要指定的端口号。
  2.使用ServerSocket对象的方法accept，获取到请求的客户端对象。
  3.使用Socker中的getInputStream方法，获取网络字节输入流InputStream对象。
  4.判断F:\\fuwuqi文件夹是否存在，不存在则创建一个。
  5.创建一个本地的字节输出流FileOutputStream对象，构造方法中绑定要输出的目的地。
  6.使用网络字节输入流InputStream对象的方法read，读取客户端上传的文件。
  7.使用本地字节输出流FileOutputStream对象中的方法Write，把读取到的文件保存在服务器的硬盘上。
  8.使用Socker中的getOutputStream方法，获取网络字节输出流OutputStream对象。
  9.使用网络字节输出流OutputStream对象中的方法write，给客户端会写“胡传你妈的憋”；
  10.释放资源（FileOutputStream，Socker，ServerSocket）
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1.创建一个服务器ServerSocket对象，和系统要指定的端口号。
        ServerSocket sersoc = new ServerSocket(9123);
        // 2.使用ServerSocket对象的方法accept，获取到请求的客户端对象。
          Socket soc = sersoc.accept();
        // 3.使用Socker中的getInputStream方法，获取网络字节输入流InputStream对象。
        InputStream ips = soc.getInputStream();
        // 4.判断F:\\fuwuqi文件夹是否存在，不存在则创建一个。
         File file = new File("F:\\临时学习\\fuwuqi");
        if(!file.exists()){
            file.mkdir();
        }
       // 5.创建一个本地的字节输出流FileOutputStream对象，构造方法中绑定要输出的目的地。
        FileOutputStream fos = new FileOutputStream(file+"\\a.jpg");
       //6.使用网络字节输入流InputStream对象的方法read，读取客户端上传的文件。
        int len = 0;
        byte[] bytes = new byte[1024];
      while((len = ips.read(bytes)) != -1){
          //7.使用本地字节输出流FileOutputStream对象中的方法Write，把读取到的文件保存在服务器的硬盘上。
          fos.write(bytes,0,len);
      }
       // 8.使用Socker中的getOutputStream方法，获取网络字节输出流OutputStream对象。
       // 9.使用网络字节输出流OutputStream对象中的方法write，给客户端会写“胡传你妈的憋”；
        OutputStream os = soc.getOutputStream();
        os.write("胡传你妈的憋".getBytes());
       //10.释放资源（FileOutputStream，Socker，ServerSocket）
        fos.close();
        soc.close();
        sersoc.close();
    }
}
