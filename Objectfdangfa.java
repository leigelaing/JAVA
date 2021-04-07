package com.wanshang;

/*
    进入到TimeWaiting（计时状态）有两种方式
    1.使用sleep()方法，在毫秒结束之后，线程睡醒进入，Runnable/Blocked状态
    2.使用wait(long m)方法，wait方法如果在毫秒值结束之后，还没有等到notify唤醒，线程自动进入Runnable/Blocked状态
 */
public class Objectfdangfa {
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
                        System.out.println("雷金航1 告知老板包子种类与数量");
                        //调用wait()方法，释放cpu的执行，进入到WAITNG状态（无线等待）
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子已经做好，叫雷金航1 那吃货赶紧吃");
                        System.out.println("===========================================");
                    }
                }
            }
        }.start();
        //创建一个顾客线程（消费者）
        new Thread(){
            @Override
            public void run() {
                //一直等着买包子
                while(true){
                    //保证等待和唤醒的线程只能有一个执行，需使用同步技术
                    synchronized (obj){
                        System.out.println("雷金航2 告知老板包子种类与数量");
                        //调用wait()方法，释放cpu的执行，进入到WAITNG状态（无线等待）
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子已经做好，叫雷金航2 那吃货赶紧吃");
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
                        //obj.notify();//如果有多个线程等待 随机唤醒一个
                       obj.notifyAll();//唤醒所有等待的线程
                    }
                }
            }
        }.start();
    }
}
