package com.haha;


    //1.创建一个Runable接口的实现类
    public class Runable2 implements  Runnable {
        // 2.在实现类中重写Runable接口的run方法，设置线程任务
        public void run(){
            for (int i = 0; i < 20; i++) {
                System.out.println("张研萌");
            }
        }


    }

