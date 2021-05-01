package com.demo01;
/*
 定义一个创建Person001对象的函数式接口
 */
@FunctionalInterface
public interface PersonBuider {
    //定义一个方法，根据传递的姓名创建Person001对象返回
    Person001 builderperson(String name);
}
