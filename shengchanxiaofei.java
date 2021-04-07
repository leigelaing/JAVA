package com.wanshang;
/*
  等待唤醒案例：线程之间通信
  创建一个顾客线程（消费者）：告知老板要的包子数量与种类，
  调用wait（）方法，放弃CPU执行，进入到WAITNG状态（无线等待）

  创建一个老板线程（生产者）：花5秒做包子，做好包子之后，调用notify方法，唤醒顾客吃包子

  注意：
  1.顾客和老板线程必须使用同步代码块包裹起来，保证等待与唤醒只能有一个在进行运行
  2.同步使用的锁必须保证唯一
  3.只有锁对象才能调用wait和motify方法

  Object类中的方法
  void wait()
  在其他线程调用此对象的notify方法或notifyAll()方法前，导致当前线程等待。
  void notify()
  唤醒在此对象监视器上等待的单线程
  会继续执行wait()方法之后的代码
 */

public class shengchanxiaofei {
    public static void main(String[] args) {
        //创建锁对象保证唯一
        Object obj = new Object();
        //创建一个顾客线程（消费者）
        new Thread(){
            @Override
            public void run() {
                //一直等着买包子
                while(true){
                    //保证等待和唤醒的线程只能有一个执行，需使用同步技术
                    synchronized (obj){
                        System.out.println("告知老板包子种类与数量");
                        //调用wait()方法，释放cpu的执行，进入到WAITNG状态（无线等待）
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子已经做好，叫雷金航那吃货赶紧吃");
                        System.out.println("===========================================");
                    }
                }
            }
        }.start();
        //创建一个老板线程（生产者）
        new Thread(){
            @Override
            public void run() {
                //一直不停的做包子
                while(true){
                    //花五秒做包子，意味着睡5秒就是5000毫秒
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //保证等待和唤醒的线程只能有一个执行，需使用同步技术
                    synchronized (obj){
                        System.out.println("5秒完成，唤醒顾客吃包子");
                        // 做好包子之后，调用notify方法，唤醒顾客吃包子
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
