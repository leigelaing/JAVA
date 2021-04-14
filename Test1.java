package com.haha;
/*
//创建多线程的第二种方法，实现Runnable接口
//java.lang.Runable
//Runable接口应该由那些打算通过某一线程执行其实例的类来实现。
//类必须定义一个称为run的无参数方法
//java.lang.Thread的构造方法
Thread（Runable  target）分配新的Thread对象。
Thread（Runable  target，String name）分配新的Thread对象。

实现步骤：
 1.创建一个Runable接口的实现类
 2.在实现类中重写Runable接口的run方法，设置线程任务
 3.创建一个Runable接口的实现类对象
 4.创建Thread类对象，构造方法中传递Runable接口的实现类对象。
 5.调用Thread类中的start方法，开启新的线程执行run方法。
*/
public class Test1 {
    public static void main(String[] args) {
       // 3.创建一个Runable接口的实现类对象
         Runable1 run1 = new Runable1();

       //4.创建Thread类对象，构造方法中传递Runable接口的实现类对象。
         Thread t = new Thread(run1); //打印线程名称

        Thread t1 = new Thread(new Runable2());//直接运行Runable中的run方法
        t.start();

         for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() +"->"+i);
        }
    }
}
