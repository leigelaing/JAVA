package com.demo01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
  追加写（续写）：使用两个参数的构造方法;
     FileOutputStream(File file, boolean append)
     创建文件输出流以写入由指定的 File对象表示的文件。
     FileOutputStream(String name, boolean append)
     创建文件输出流以指定的名称写入文件。
     参数：
      String name：写入参数的目的地
      boolean append：追加写开关，
           true：创建对象不会覆盖与原文件，继续在文件末尾追加数据。
           false：创建一个新文件，覆盖原文件
      File file：
   写换行：写换行符号
    windows：\r\n
    Linux:/n
    mac:/r
 */
public class OutputStream03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =
    new FileOutputStream
            ("F:\\Javayunama\\leigeliang\\2021.4.24（JAVA）\\b.txt",true);
        for (int i = 0; i <= 10; i++) {
            fos.write("您好！".getBytes());
            fos.write("\r\n".getBytes());
        }

        fos.close();
    }
}
