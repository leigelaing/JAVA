package com.demo01;
  /*
    如果finally有return语句，永远返回finally中的结果，避免异常情况。
   */
public class demo02Exception {
      public static void main(String[] args) {
          int a = getA();
          System.out.println(a);
      }
    //定义一个方法，返回变量a的值。
      public static int getA(){
          int a = 10;
          try{
             return a;
          }catch(Exception e){
              System.out.println(e);
          }finally {
            //一定执行的代码
              a = 100;
              return a;
          }
      }
}
