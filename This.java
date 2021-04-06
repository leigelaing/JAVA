package com.hehe;
/*
当方法的局部变量和类的成员变量重名的时候，根据就近原则，优先使用局部变量
如果需要访问本类中的成员变量，需要使用格式：
this.成员变量名
“通过谁调用的方法，谁就是this”
 */

public class This {
    String name;//名字

    //参数中的name是对方的名字
    //成员变量中的name是自己的名字
    public  void sayHello (String name) {
        System.out.println(name + "日你妈，我是" + this.name);
        System.out.println(this);

    }
}
