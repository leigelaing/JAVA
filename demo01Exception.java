package com.demo01;

import java.util.List;

public class demo01Exception {
    public static void main(String[] args) {
        /*
           多个异常使用捕获又该如何处理：
           1.多异常分被处理。
           2.多个异常一次捕获，多次处理。
           3.多个异常一次捕获，一次处理。
         */
          //1.多异常分被处理。
          try{
              int[] arr = {1,2,3};
              System.out.println(arr[3]);
          }catch(ArrayIndexOutOfBoundsException e){
              System.out.println(e);
          }
        try{
           // List<Integer> list = List.of(1, 2, 3);of方法 在JDK9以后才有的
            //  System.out.println(list.get(3));
        }catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        /*
        //2.多个异常一次捕获，多次处理。
          就是一个try多个catch
            注意事项：
              1.catch里面定义的异常变量，如果有子父类关系，那么子类的异常变量必须写在上面，否则报错
                将代码catch调个会报错。
        */
         try{
             int[] arr = {1,2,3};
             System.out.println(arr[3]);
             // List<Integer> list = List.of(1, 2, 3);of方法 在JDK9以后才有的
             //  System.out.println(list.get(3));
         }catch(ArrayIndexOutOfBoundsException e){
             System.out.println(e);
         }catch(IndexOutOfBoundsException e){
             System.out.println(e);
         }
         /*
         //3.多个异常一次捕获，一次处理。
          注意：如果多个异常有子父类关系，直接使用子类即可，父类多态原理能做到一次处理
               也可以直接写成catch(Exception e){
                  System.out.println(e);
                   }  全部都能处理；
        */
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
            // List<Integer> list = List.of(1, 2, 3);of方法 在JDK9以后才有的
            //  System.out.println(list.get(3));
        }catch(Exception e){
            System.out.println(e);
        }
        //运行时异常被抛出可以不处理，即不捕获也不声明抛出
        //默认给虚拟机处理，终止程序，什么时候不抛出运行异常，再来继续执行程序。
        int[] arr = {1,2,3};
        System.out.println(arr[3]);
        // List<Integer> list = List.of(1, 2, 3);of方法 在JDK9以后才有的
        //  System.out.println(list.get(3));
        System.out.println("后续代码可以执行");
    }
}
