package com.demo01;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
  throws 关键处理异常的缺点：一旦throws异常出现，那么异常后面的代码将不会执行。
    try...catch：异常处理的第二种方式：自己处理异常
     格式：
      try{
        可能产生异常的代码
      }catch（定义一个异常变量，用来接收try中抛出的异常对象）{
          异常的处理逻辑，异常对象出现之后 怎么处理异常对象
          一般在工作中，会把异常的信息记录到一个日志中。
      }
      ...
      catch（异常类名 变量名）{
      }
    注意事项：
     1.try中可能会抛出多个异常对象，那么就可以使用多个catch来处理，这些异常对象。
     2.如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完毕catch中的处理逻辑，继续
     执行try...catch之后的代码。
       如果try中没有产生异常，那么就不会执行catch中的异常处理逻辑，执行完try中的代码后，继续
     执行try...catch之后的代码。
 */
public class Demo06TryCatch {
    public static void main(String[] args) {
        try{
            //可能产生异常的代码
            readFile("d:\\a.tt");
            //try中抛出什么异常对象，catch中就定义什么异常变量，用来接收这个异常对象。
        } catch(IOException e){
           // 异常的处理逻辑，异常对象出现之后 怎么处理异常对象
            System.out.println("传递的文件后缀名不对");
        }
        System.out.println("后续代码");
    }
    /*
     如果传递的路径，不是.txt结尾
     那么我们就抛出IO异常对象，告知方法的调用者，文件的后缀名不对
    */
    public static void readFile(String fileName) throws IOException {
        if (!fileName.equals("c:\\a.txt")) {
            throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");
        }

        if (!fileName.equals(".txt")) {
            throw new IOException("文件后缀名异常");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
