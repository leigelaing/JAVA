package com.gaga;

/*
    模拟买票案例
    创建三个线程，同时开启，对共享的票进行出售
 */
public class Testpiao {
    public static void main(String[] args) {
        //创建一个Runnable接口实现类对象
        //注意只创建一个接口实现类才能保证三个线程访问一个实现类
        Runnablepiao ru1 = new Runnablepiao();

        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象。
        Thread th0 = new Thread(ru1);
        Thread th1 = new Thread(ru1);
        Thread th2 = new Thread(ru1);
        //调用Thread类中的start方法，开启线程
        th0.start();
        th1.start();
        th2.start();
    }
}
