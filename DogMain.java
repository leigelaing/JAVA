package com.demo1;

public class DogMain {
    public static void main(String[] args) {
       // Animal an = new Animal();//错误的，Animal是抽象类
       // Dog do = new Dog();//错误的，Dog是抽象类
       DogSon son = new DogSon();
       son.eat();
       son.sleep();
        System.out.println("============================");
       DogSon2 son2 =new DogSon2();
       son2.eat();
       son2.sleep();
    }
}
