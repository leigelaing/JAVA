package com.demo01;
/*
 类的构造器（构造方法）引用，
 */
public class Demo02 {
    //定义一个方法，参数传递姓名和PersonBuider接口，方法中通过姓名创建Person001对象
    public static  void printName(String name,PersonBuider p){
        Person001 person = p.builderperson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        //调用printName方法，方法的参数PersonBuider接口是一个函数式接口，
        // 可以传递Lambda表达式
        printName("门儿子",(String name )->{
           return new Person001(name);
        });
        /*
        使用方法引用优化Lambda表达式
        构造方法new Preson001(String name)已知
        创建对象new已知
        就可以使用person001引用new创建对象
         */
        //使用Person001类的带参构造方法，通过传递的姓名创建对象。
        printName("古力娜扎",Person001::new);
    }
}
