package com.haha;
/*
    匿名类实现线程的创建

     匿名：就是没有名字
     内部类：写在其他类内部的类
     匿名内部类的作用：简化代码
     把子类继承父类，重写父类的方法，创建子类对象合在在一步完成。
     匿名内部类的最终产物：子类/实现类对象，而这个类没有名字。
    格式：
    new 父类/接口(){
      重写父类/接口中的方法
    }
 */

public class Test2 {
    public static void main(String[] args) {
        //以前
        //线程的父类Thread
        //new MyThread().Start();

        //匿名内部类创建线程
        new Thread() {
            //重写run方法设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"->"+"大哥");
                }

            }
        }.start();

       //以前
       //线程的接口Runable
       //Runable ru = new Runable1();     多态
       //现在
        Runnable t = new Runnable(){
           //重写run方法设置线程任务

           @Override
           public void run() {
               for (int i = 0; i < 10; i++) {
                   System.out.println(Thread.currentThread().getName()+"->"+"小弟");
               }
           }
       };
       new Thread(t).start();

       //简化接口的方式创建对象

        new Thread(new Runnable(){
            //重写run方法设置线程任务

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"->"+"雷公");
                }
            }
        }).start();
    }
}
