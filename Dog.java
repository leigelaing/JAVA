package com.demo1;
//子类也是一个抽象类
public abstract class Dog extends Animal{
    @Override
    public  void eat(){
        System.out.println("狗吃屎");
    }
    //public abstract void sleep();
}
