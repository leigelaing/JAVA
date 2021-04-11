package com.demo5;

public interface MyIntrefaceB {

    public abstract void medthodB();

    public abstract void methodCommon();

    public default void methodfault(){
        System.out.println("BBB");
    }
}
