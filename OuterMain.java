package com.demo6;

public class OuterMain {
    public static void main(String[] args) {
        //创建内部类的对象
        //外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
        Outer.Inner inner = new Outer().new Inner();
        inner.methodInner();
    }
}
