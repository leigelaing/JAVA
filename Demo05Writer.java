package com.demo01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
  字符串的续写与换行：
   续写（追加写）：使用两个参数的构造方法：
   FileWriter(String fileName, boolean append)
   构造一个FileWriter对象，给出一个带有布尔值的文件名，表示是否附加写入的数据。
   FileWriter(File file, boolean append)
   给一个File对象构造一个FileWriter对象。
   参数：
     String fileName：写入数据的mudid
     File file：一个文件
     boolean append：续写开关，
         true：不会创建新的文件覆盖源文件，可以续写。
         false：会创建新的文件，覆盖源文件。
    换行：使用换行符号
       windows：\r\n
       Linux：/n
       mac:/r
 */
public class Demo05Writer {
    public static void main(String[] args) throws IOException {
        //续写
        FileWriter fw =
          new FileWriter
           ("F:\\Javayunama\\leigeliang\\2021.4.24（JAVA）\\e.txt",true);
        for (int i = 0; i < 10; i++) {
            fw.write("张研萌" + i);
            //换行
            fw.write("\r\n");
        }
        fw.close();
    }
}
