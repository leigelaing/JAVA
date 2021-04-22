package com.demo01;
/*
  创建Runable接口的实现类，重写run方法，设置线程任务。
   重写run方法快捷键：ALT+回车
 */
public  class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"新线程创建了");
    }
}
