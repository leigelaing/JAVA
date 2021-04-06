package com.hehe;

public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void showName(){
        System.out.println("我的叫"+name);
    }


}
