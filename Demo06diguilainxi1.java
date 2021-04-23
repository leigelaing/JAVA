package com.demo01;
/*
  递归练习：
    使用递归计算1——n之间的和
 */
public class Demo06diguilainxi1 {
    public static void main(String[] args) {
        int s = sum(100);
        System.out.println(s);
    }
   /*
       定义一个方法：使用递归计算1——n之间的和
       n + （n-1）......
     已知：
       最大值：n
       最小值：1
       使用递归明确两个问题
       1.递归的结束条件
       2.递归的目的：获取下一个被加的数字
   */
    public  static int sum(int n) {
        // 1.递归的结束条件
        if(n == 1){
            return 1;
        }
        // 2.递归的目的：获取下一个被加的数字
        return n + sum(n-1);
    }
}
