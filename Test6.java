package com.bdqn;


public class Test6 {
    public static void main(String[] args) {
        Person per = new Person();
        per.show();

        per.name = "王八蛋";
        //per.age = 20;//age被private修饰无法直接访问
        per.setAge(40);
        per.show();
    }

}
