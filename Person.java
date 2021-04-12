package com.demo5;
/*
   对于成员变量来说，如果使用final关键字修饰，那么这个变量也照样是不可改变的
   1.由于成员变量具有默认值，所以用了final之后必须手动赋值，不会再给默认值
   2.对于final的成员变量，要么直接赋值，要么通过构造方法赋值。 //二者选其一
    注意：使用构造方法赋值，就必须保证类中所有的构造方法都必须赋值。
    3.必须保证类当中的所有重载的构造方法，都最终会对final的成员变量进行赋值。
 */
public class Person {
    //final修饰成员变量一定手动赋初始值（直接赋值）
    private final String name /*= "日你妈"*/;

    public Person() {
      name = "迪丽热巴";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    //已经被final修饰不能在给它赋值。

   // public void setName(String name) {
     //   this.name = name;
    //}
}
