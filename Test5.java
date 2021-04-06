package com.hehe;

import java.util.Random;
import java.util.Scanner;
//Random类用来生成随机数，使用起来就是三个步骤：
//1.导包
// import java.util.Random;
//2.创建
//Random r = new Random();  小括号留空即可
//3.使用
//获取随机数的int数字，（范围是int所有范围，有正负两种）；int num = r.nextInt();
//获取随机数的int数字，(参数代表了范围，左闭右开区间)，：int num = r.nextInt(3);
//实际上代表的含义是：[0,3) 也就是0-2


public class Test5 {
    //猜字游戏
    public static void main(String[] args) {
    Random  ra = new Random();
    int a = ra.nextInt(100)+1;//生成1-100之间的数字
    Scanner sa = new Scanner(System.in);
    while(true){
        System.out.println("请输入数字");
        int b = sa.nextInt();
        if (a > b) {
            System.out.println("小了");
        } else if (a < b) {
            System.out.println("大了");
        } else {
            System.out.println("正确");
            break;    //如果猜中，不再重复
        }
    }
 }
}




    /*
    //Random练习一 生成1-n之间的随机数
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            //本来范围为[0,n),整体加1之后变为[1,n+1),也就是[1,n]
            int num = r.nextInt(n);//生成数字为1-n
            System.out.println(num);
        }
    }
}
*/


    /*
   // Random生成指定范围的随机数
   public static void main(String[] args) {
       Random r = new Random();
       for (int i = 0; i < 10; i++) {
           int num = r.nextInt(10);//生成数字为0-9
           System.out.println(num);
       }
   }

}
*/







    /*
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();
        System.out.println("随机数是：" + num);
    }
}
*/