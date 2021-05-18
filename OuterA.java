package com.demo01;

public class OuterA {
    public void method(){
        //局部内部类
        class Inner{
            int num = 10;
            public void method(){
                System.out.println(num);
            }
        }
        Inner inner  = new Inner();
        inner.method();
    }
}
