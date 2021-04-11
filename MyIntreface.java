package com.demo5;
/*
   这个子接口中有几个方法？  4个  分别是：
   methodA  来源于接口A
   methodB  来源于接口B
   methodCommon  同时来源于接口A 和 B
   method 来源于我自己
 */
public interface MyIntreface extends MyIntrefaceA,MyIntrefaceB {

     public abstract void method();

    @Override
    public default void methodfault() {

    }
}
