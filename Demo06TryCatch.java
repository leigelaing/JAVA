package com.demo01;

import java.io.FileWriter;
import java.io.IOException;

/*
   在JDK1.7之前可以使用try—catch—finally 处理流中的异常，
   格式：
   try{
       可能出现异常的代码
   }catch(异常类的变量 变量名){
       异常的处理逻辑
   }finally{
       一定会执行的代码
       资源释放
   }
 */
public class Demo06TryCatch {
    public static void main(String[] args) {
       //提高变量fw的作用域，让finally可以使用
        //局部变量，在定义的时候可以没有值，但在使用的时候必须有值
        //fw =new FileWriter("F:\\Javayunama\\leigeliang\\2021.4.24（JAVA）\\e.txt",true);
        //上面一行代码执行失败，fw没有值，close会报错，解决办法：初始值赋值为null
        FileWriter fw = null;
        try{
            //  可能出现异常的代码
           fw =
                    new FileWriter
                            ("F:\\Javayunama\\leigeliang\\2021.4.24（JAVA）\\e.txt",true);
            for (int i = 0; i < 10; i++) {
                fw.write("张研萌" + i);
                //换行
                fw.write("\r\n");
            }

        }catch(IOException e){
            //异常的处理逻辑
            System.out.println(e);
        }finally{
            //一定会执行的代码
            //创建对象失败了，fw的默认值就是null，null是不能调用方法的，会抛出空指针异常，需要增加一个判断，不是null 在释放资源
           if(fw == null){
               try {
                   //fw.close方法声明抛出了IOException异常对象，所以我们就在处理这个异常对象，要么throws要么try—catch
                   fw.close();
               } catch (IOException e) {
                   e.printStackTrace();
                 }
              }
           }
    }
}
