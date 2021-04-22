package com.demo01;
/*
  使用实现Runalbe接口的方式实现多线程
 */
public class Demo01Runable {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        Runnable run1 = new RunnableImpl();
        //创建Thread类对象，构造方法中传递Runable接口的实现类
        Thread th = new Thread(run1);
        //调用start方法开启新线程，执行run方法
        th.start();
        //简化代码，使用匿名内部类，实现多线程程序
       Runnable r =  new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了");
            }
        };
           new  Thread(r).start();
           //继续简化代码：直接传入匿名内部类
        new  Thread( new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了");
            }
        }).start();
    }
}
