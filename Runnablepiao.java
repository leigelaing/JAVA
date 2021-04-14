package com.wanshang;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
实现买票案例

   解决线程安全问题的第三种方案：使用Lock锁
   包路径：java.util.concurrent.locks.lock接口
   lock实现提供了比使用synchronize方法和语句可获得的更广泛的锁定操作
   lock接口中的方法：
     void lock();
     获取锁
     void unlock();
     java.util.concurrent.locks.Reentrantlock  implements lock接口

     释放锁
     使用步骤：
     1.在成员位置创建一个Reentrantlock对象
     2.在可能出现安全问题的代码前调用lock接口中的lock方法  获取锁
     3.在可能出现安全问题的代码后调用lock接口中的unlock方法  释放锁




 */
public class Runnablepiao implements Runnable{
    //定义一个多个线程共享的票源
    private int tic = 100;

   // 1.在成员位置创建一个Reentrantlock对象
    Lock l = new ReentrantLock();


    @Override
    public void run() {
        while(true){

            //调用lock方法 获取锁
            l.lock();

            //先判断票是否有剩余
            if(tic > 0){
                try {
                    //提高安全问题出现的概率，让程序睡眠一下
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //票有剩余tic--
                System.out.println(Thread.currentThread().getName()+"正在卖第"+tic+"票");
                tic--;
            }
            //调用unlock方法 释放锁
            l.unlock();
        }

    }
}
