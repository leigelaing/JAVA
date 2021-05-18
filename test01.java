package com.demo03;

public class test01 {
    public static void main(String[] args) {
        //person 类默认继承Object类所以可以使用hashCode()方法
        Person  per = new Person();
        int a = per.hashCode();
        System.out.println(a);
        Person  per1 = new Person();
        int a1 = per1.hashCode();
        System.out.println(a1);

        System.out.println(per);
        System.out.println(per1);
        System.out.println(per1 == per);
    }
}
