package com.demo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    使用字节流读取中文文件
     1和中文：
          GBK：一个中文占据两个字节
        UTF_8： 一个中文占据三个字节
 */
public class OutputStream06 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =
                new FileInputStream
                ("F:\\Javayunama\\leigeliang\\2021.4.24（JAVA）\\c.txt");
        int len = 0;
        while((len = fis.read()) != -1){
            System.out.println(len);
        }
        fis.close();
    }
}
