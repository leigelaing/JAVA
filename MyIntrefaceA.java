package com.demo5;

public interface MyIntrefaceA {

    public abstract void medthodA();

    public abstract void methodCommon();

    public default void methodfault(){
        System.out.println("AAA");
    }
}
