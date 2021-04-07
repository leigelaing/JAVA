package com.haha;
/*
    实现Runable接口创建多线程的好处：
    1.避免了单继承的局限性
     一个类只能继承一个类，类继承了Thread就不能继承其他类
     实现了Runable接口，还可以继承其他的类，实现其他的接口。
    2.增强了程序的扩展性，降低了程序的耦合性
       实现Runable接口的方式，把设置线程任务和开启线程进行了分离
       实现类中我们重写了Ruenable方法，用来设置线程任务
       创建Thread类对象，调用Start方法：用来开启新的线程。

 */



//1.创建一个Runable接口的实现类
public class Runable1 implements  Runnable {
   // 2.在实现类中重写Runable接口的run方法，设置线程任务
     public void run(){
         for (int i = 0; i < 20; i++) {
             System.out.println(Thread.currentThread().getName() +"->"+i);
         }
     }


}