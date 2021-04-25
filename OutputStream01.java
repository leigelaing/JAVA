package com.demo01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
  写入数据的原理：（内存——> 硬盘）
          Java程序——>JVM（虚拟机）——>OS (操作系统)——>OS调用写入数据的方法——>把数据写入到文件中
          字节输出流的使用步骤（重点）：
          1.创建FileOutputStream对象，构造方法中传递写入数据的目的地
          2.调用FileOutputStream对象的方法write，把数据写入到文件中
          3.释放资源（流使用会占用一定的资源，使用完毕后要把内存清空，提高内存的效率）
     */
public class OutputStream01 {
    public static void main(String[] args) throws IOException {
        // 1.创建FileOutputStream对象，构造方法中传递写入数据的目的地
        FileOutputStream fos = new FileOutputStream("F:\\Javayunama\\leigeliang\\2021.4.23（JAVA）\\a.txt");
        // 2.调用FileOutputStream对象的方法write，把数据写入到文件中
        fos.write(97);
        //3.释放资源（流使用会占用一定的资源，使用完毕后要把内存清空，提高内存的效率）
        //使用close方法：
        fos.close();
    }
}
