package com.hehe;

/*获取线程的名称：
   1.使用Thread类中的方法getName()
       String getName() 返回线程的名称
   2.可以先获取到当前正在执行的线程，使用线程中的方法getName()获取线程名称。
      static Thread.curentThread()  返回对当前正在执行的线程对象的引用
 */


public class My1Thread  extends Thread {
    @Override
    public void run(){
        //获取线程名称
        String name = getName();
        System.out.println(name);


        for (int i = 0; i < 100; i++) {
            System.out.println("runrun"+i);
        }
    }
}
