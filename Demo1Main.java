package com.demo1;
/*
   如果接口的实现类，（或者是父类的子类），只需要使用唯一的一次，
   那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】
   匿名内部类的定义
   格式：
   接口名称 对象名  = new 接口名称(){

     //覆盖重写接口中的所有抽象方法

   };

   对匿名内部类进行格式解析：
   new 接口名称(){
     .............
   };
   1.new 代表创建对象的动作
   2.接口名称就是匿名内部类需要实现那个接口。
   3.{.....}这才是匿名内部类的内容

   使用匿名内部类的注意事项：
   1.匿名内部类，在创建对象的时候，只能使用唯一的一次（不能创建两个对象）。
   如果希望多次创建对象，而且类的内容一样的话，那么就必须使用单独定义的实现类了。
   2.匿名对象，在【调用方法】的时候，只能调用唯一的一次。
   如果希望同一个对象，调用多次方法，那么必须给对象起一个名字。
   3.匿名内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】。
   强调：匿名内部类与匿名对象不是一回事。
 */
public class Demo1Main {
    public static void main(String[] args) {
        //使用实现类调用方法
        MyInterfaceimpl myInterfaceimpl = new MyInterfaceimpl();
        myInterfaceimpl.method1();
       //使用多态调用方法
        MyInterface myInterface = new MyInterfaceimpl();
        myInterface.method1();

        //使用匿名内部类：
        //为什么叫匿名内部类，请与局部内部类做对比
        //使用匿名内部类，但不是匿名对象，对象名称就叫myInterface1A
        MyInterface myInterface1A = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法！111");
            }
            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法！222");
            }
        };
        myInterface1A.method1();
        myInterface1A.method2();
        System.out.println("========================");
        //匿名内部类，在创建对象的时候，只能使用唯一的一,以下代码错误！
        //MyInterface myInterface1C = new MyInterface();

        //使用匿名内部类，而且省略了对象名称，也是匿名对象。
       new MyInterface() {
            @Override
            public void method1() {
                System.out.println("二号匿名内部类实现了方法！333");
            }
            @Override
            public void method2() {
                System.out.println("二号匿名内部类实现了方法！444");
            }
        }.method1();
        //因为匿名对象无法调用第二次方法，只能再创建一个匿名内部类的匿名对象。
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("二号匿名内部类实现了方法！555");
            }
            @Override
            public void method2() {
                System.out.println("二号匿名内部类实现了方法！666");
            }
        }.method2();
    }
}
