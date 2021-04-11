package com.gggggg;
/*
   1.接口的默认方法，可以通过接口实现类对象，直接调用。
   2.接口的默认方法，也可以被接口实现类进行覆盖重写。
 */
public class MyInterfaceDefaultMain {
    public static void main(String[] args) {
     //创建了实现类对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        //调用抽象方法实际运行的是右侧的实现类（MyInterfaceDefaultA()）
        a.methodAbs();
        //调用默认方法，如果实现类当中没有，系统会自动向上找接口是否存在默认方法。
        a.methodAbs2();
        System.out.println("=============================");
        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        //调用抽象方法实际运行的是右侧的实现类（MyInterfaceDefaultB()）
        b.methodAbs();
        //调用默认方法，此时实现类B已经将默认方法进行了覆盖重写，这样做也可以调用的。
        b.methodAbs2();

    }
}
