package com.jiekou;

public class JieKou2Main {
    public static void main(String[] args) {
        //接口不能直接new对象。
        //MyInterfaceAbs b = new MyInterfaceAbs();

        //创建实现类的对象进行使用
        jiekou2  a = new jiekou2();
        a.methodAbs1();
        a.methodAbs2();
        a.methodAbs3();
        a.methodAbs4();
    }
}
