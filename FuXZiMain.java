package com.sadff;
/*
   在父类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种规则：
   1.直接 通过子类对象访问成员变量。
     等号左边是谁，就优先用谁，没有向上继续找。
   2.间接 通过成员方法访问成员变量。
     该方法属于谁，就优先用谁，没有就向上找。
 */
public class FuXZiMain {
    public static void main(String[] args) {
        Fu fu = new Fu();//创建父类对象
        System.out.println(fu.numFu); //10  //只能使用父类的东西，没有任何子类的内容
        //创建子类对象
        Zi zi = new Zi();
        System.out.println(zi.numFu);//10
        System.out.println(zi.numzi);//20
        System.out.println("=========================");
        //访问了重名的成员变量
        //等号左边是谁，就优先用谁。
        System.out.println(zi.num);//优先子类：200
        //System.out.println(zi.abc);//子类父类中都没有对应的成员变量时就直接报错
        System.out.println("===============================");
        //这个方法是子类的所以优先用子类的，如果没有在向上找。
        zi.methodZi();//200
        //这个方法是在父类当中定义的，
        zi.methodFu();//100

    }
}
