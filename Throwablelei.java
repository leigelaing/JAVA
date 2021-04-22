package com.demo01;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    Throwable类中定义了3个异常处理的方法：
        String  getMessage（）; 返回此 throwable 的简短描述
        String  toString（）;  返回此 throwable 的详细消息字符串
        void  printStackTrace(); JVM打印异常对象，默认此方法，打印细心最全面
   */
public class Throwablelei {
    public static void main(String[] args) {
        try{
            //可能产生异常的代码
            readFile("c:\\a.tx");
            //try中抛出什么异常对象，catch中就定义什么异常变量，用来接收这个异常对象。
        } catch(IOException e){
            // 异常的处理逻辑，异常对象出现之后 怎么处理异常对象
            //System.out.println("传递的文件后缀名不对");
            System.out.println(e.getMessage());//文件后缀名异常
            System.out.println(e.toString());//重写了toString方法 java.io.IOException: 文件后缀名异常
            System.out.println(e);//默认调用toString方法；

            e.printStackTrace();
            /*
            java.io.IOException: 文件后缀名异常
	        at com.demo01.Throwablelei.readFile(Throwablelei.java:35)
	        at com.demo01.Throwablelei.main(Throwablelei.java:16)
             */
        }
            System.out.println("后续代码");
    }
    /*
     如果传递的路径，不是.txt结尾
     那么我们就抛出IO异常对象，告知方法的调用者，文件的后缀名不对
    */
    public static void readFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件后缀名异常");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
