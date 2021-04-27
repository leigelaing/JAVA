package com.demo01;
  /*
   日志案例
   发现以下代码存在一些性能浪费的问题
   调用 showlog方法，传递的第二个参数是一个拼接后的字符串。
   先把字符串拼接好，再调用showlog方法，
   如果showlog方法的日志等级传递的不是1级，那么就不是输出拼接后的字符串。单字符串已经拼接了，
   但是没有任何作用。存在浪费。

  */
public class Demo01Logger {
    //定义一个根据日志的级别，显示日志信息的方法
      public static void showlog(int level ,String  message){
          //对日志的等级进行判断 如果等级是1 那么输出日志信息
          if(level == 1){
              System.out.println(message);
          }
      }
      public static void main(String[] args) {
       //定义三个日志信息
          String msg1 = "hellow";
          String msg2 = "java";
          String msg3 = "World";
          //调用showlog方法
          showlog(2,msg1+msg2+msg3);
      }
}
