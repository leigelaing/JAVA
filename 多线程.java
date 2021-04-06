package com.hehe;
/*
 主线程：执行主方法（main）的线程
 单线程程序：java程序中只有一个线程
 执行从main方法开始，从上到下依次执行

 */
public class 多线程 {
    private String name;
    public void run(){
        //循环20次
        for (int i = 0; i <= 20; i++) {
            System.out.println(name+"->"+i);
        }
    }

    public String getName() {

        return name;
    }

    public 多线程() {
    }

    public 多线程(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
