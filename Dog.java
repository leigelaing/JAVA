package com.demo3;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃屎");
    }
    public void watchHome(){
        System.out.println("狗看家");
    }
}
