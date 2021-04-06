package com.hehe;
/*
一个标准类通常要拥有四个组成部分：
   1.所有成员变量都是用private关键字修饰
   2.为每个成员变量编写一对getter/setter方法
   3.编写一个无参的构造方法
   4.编写一个全参的构造方法
 */
public class Student {
    private String name;//姓名
    private int age;//年龄

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
