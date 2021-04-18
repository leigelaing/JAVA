package com.demo01;
/*
测试含有泛型的方法
 */
public class GenericMethodMain {
    public static void main(String[] args) {
        //创建一个GenericMethod对象，
        GenericMethod ge = new GenericMethod();
    /*
      调用泛型的方法，Method
     */
        ge.method01(15);
        ge.method01("abc");
        ge.method01(5.55);
        ge.method01(true);
        //
        //静态方法不建议创建对象使用
        //静态方法，通过类名.方法名   直接使用
        ge.method02(55);
        GenericMethod.method02("abc");
    }
}
