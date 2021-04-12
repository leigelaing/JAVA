package com.demo3;
/*
  如何才能知道一个父类引用对象，本来是什么子类？
  格式：
  对象 instanceof 类型
  这将得到一个boolean类型值的结果，也就是判断前面的对象能不能当做后面的实例。
 */
public class Demo02Instanceof {
    public static void main(String[] args) {
        //本来是一只猫
        Animal animal = new Cat();
        animal.eat();

        //向上转型后对象就不能访问子类内容了
        //向下转型解决问题此问题
        //判断一下父类引用animal本来是不是Dog
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHome();
        }
        //判断一下父类引用animal本来是不是Cat
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }

        giveMePet(new Dog());
    }
    public static void giveMePet(Animal animal){
        //判断一下父类引用animal本来是不是Dog
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHome();
        }
        //判断一下父类引用animal本来是不是Cat
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }
    }
}
