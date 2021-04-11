package com.demo3;

public interface MyInterface {
    public default void method(){
        System.out.println("接口当中的默认方法");
    }
}
