package com.demo01;
/*
   练习—使用递归计算阶乘
 */
public class Demo07diguilainxi2 {
    public static void main(String[] args) {
         int a = show01(5);
        System.out.println(a);
    }

    public static int  show01(int n) {
      if(n == 1){
          return 1;
      }
      return n*show01(n-1);
    }
}
