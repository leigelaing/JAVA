package com.demo01;
  /*
  例如：java.lang.Runable接口就是一个函数式接口
  假设有一个startThread方法，使用该接口作为参数，那么就可以使用lambda进行传参。
  这种情况其实和Thread类的构造方法参数为Runable没有本质区别。
  */
public class Demo01Runable {
    //定义一个方法startThread，方法的参数使用函数式接口Runable
      public static void startThread(Runnable run ){
          //开启多线程
          new Thread(run).start();
      }

      public static void main(String[] args) {
          //调用startThread方法，方法的参数是一个接口，那我们可以传递这个接口的匿名内部类。
          startThread(new Runnable() {
              @Override
              public void run() {
                  System.out.println(Thread.currentThread().getName()+"——>"+"线程启动了！");
              }
          });
          //调用startThread方法，方法的参数是一个函数式接口，所以可以传递Lambda表达式
          startThread(()->{
              System.out.println(Thread.currentThread().getName()+"——>"+"线程启动了！");
          });
          //优化Lambda表达式
          startThread(()->
              System.out.println(Thread.currentThread().getName()+"——>"+"线程启动了！")
          );
      }
}
