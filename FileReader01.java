package com.demo01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
  /*

     FileReader可以读取默认编码格式（UTF-8）的文件
     FileReader读取系统默认编码（中文GBK），就会产生乱码问题

   */
public class FileReader01 {
      public static void main(String[] args) throws IOException {
          FileReader fr = new FileReader("F:\\Javayunama\\leigeliang\\2021.4.25(JAVA)\\b.txt");
          int len = 0;
          while((len = fr.read()) != -1){
              System.out.println((char)len);
          }
          fr.close();
      }
}
