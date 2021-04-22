package com.demo01;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
     Java.lang.Throwable类是java语言中所有错误或者异常的超类。
     Exception：编译期异常，进行编译（写代码）java程序出现的问题。
             RuntimeException： 运行期异常，java在运行过程中出现的异常。
             异常就相当于程序的小毛病，把异常处理掉，程序可以继续执行。
     Error：错误
        错误就相当于程序得了一个无法治愈的毛病，必须修改源代码，程序才能继续执行。
   */
public class Demo01Exception {
      public static void main(String[] args)/* throws ParseException*/ {
          //Exception：编译期异常，进行编译（写代码）java程序出现的问题。
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//用来格式化日期
            Date date = null;//把字符串格式的日期，解析为Date格式的日期。
            try {
                  date = sdf.parse("1990-09-09");
            } catch (ParseException e) {
                  e.printStackTrace();
            }
            System.out.println(date);
            //RuntimeException： 运行期异常，java在运行过程中出现的异常。
            int[] array = {1,2,3};
            System.out.println(array[0]);
            try{
                  //可能会出现异常的代码
                  System.out.println(array[3]);
            }catch(Exception e){
                  System.out.println(e);
            }
            /*
               Error 错误
               OutOfMemoryError:Java heap space ：  内存溢出的错误，
               创建的数组过大，超出JVM分配的内存
             */
            int [] arr = new int[1024];
            //必须修改源代码，让创建的数组小一点
            System.out.println("后续代码");
      }
}
