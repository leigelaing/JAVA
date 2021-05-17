package com.test01;

import java.util.Arrays;

/*计算扎在
题目：-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
分析：
  1.使用for循环
  2.起点位置为-10.8应该转换为-10，有两种办法：
     2.1：可以使用Math.ceil 方法，向上（向正方向）取整。
     2.2：强转成为int，自动舍弃所有小数位。
  3.每一个数字都是整数，所有进步表达式应该为num++，这样每次都加1
  4.如何拿到绝对值：Math.abs方法。
  5.一但发现数字，让计数器进行++统计。
 */
public class Demo11MathPractise {
    public static void main(String[] args) {
        int count = 0;
       double min = -10.8;
       double max = 5.9;
       //这样计算就是区间内所有整数拿到了
       for(int i = (int)min;i<max;i++){
           int abs = Math.abs(i);
           if(abs > 6 || abs<2.1){
               System.out.println(i);
              count++;
           }
       }
        System.out.println("数量为："+count);
    }
}
