package com.demo01;
/*
   JDK7的新特性：
     在try的后边可以增加一个(),在括号中可以定义流对象。
     那么这个流对象的作用域就在try中有效
     try中的代码执行完毕后，会自动把流对象释放，不用写Finally
   格式：
    try(定义流对象（可以定义多个流对象）){
       可能出现异常的代码
   }catch(异常类的变量 变量名){
       异常的处理逻辑
   }
 */

public class Demo07JDK9JDK7 {
    public static void main(String[] args) {

    }
}
