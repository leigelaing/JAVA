package com.hehe;
/*
sleep()方法
    public static void sleep(long millis)
    使当前正在执行的线程以指定的毫秒暂停，（暂停执行）
    毫秒结束之后暂停执行
 */

public class Test6 {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
           //使用Thread类的sleep方法让程序睡眠1秒
            try {
                Thread.sleep(1000);//1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}



    /*
    public static void main(String[] args) {
        多线程 p1 = new 多线程("小强");
        p1.run();
        System.out.println(0/0);//数学异常，后面代码不会执行
        多线程 p2 = new 多线程("小明");
         p2.run();
    }
}
*/