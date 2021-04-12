package com.demo3;
/*
     向上转型一定是安全的，没有问题，正确的。但是也有弊端
     对象一旦向上转型，那就无法调用子类原本特有的内容。

     解决方法：
     对象的向下转型，【还原】。
     对象的向下转型，其实就是还原的动作
     格式：
     子类的名称 对象名 = [子类名称]父类对象;
     含义：将父类对象，还原成为本来的子类对象。
 */
public class CatAMain {
    public static void main(String[] args) {
       //对象的向上转型，就是 父类引用指向子类对象
        Animal animal = new Cat();//本来创建的是一只猫
        animal.eat();
        //错误写法！
        //animal.catchMouse();

        //向下转型
        Cat cat = (Cat) animal;
        cat.catchMouse();

        //错误的向下转型:原因：本来new的是一只猫，现在非要给它变为狗，不合理。
        //错误写法，编译不会报错，运行就会出现异常。
        //java.lang.ClassCastException  类转换异常。
        Dog dog = (Dog)animal;
    }
}
