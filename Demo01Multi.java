package com.demo6;
/*
   代码当中体现多态性，其实就是一句话父类引用指向子类对象。
   格式：
   父类名称 对象名 = new 子类名称()；
   或者
   接口名称 对象名 = new 实现类明称();
 */
public class Demo01Multi {
    public static void main(String[] args) {
        //使用多态的写法
        //左侧父类的引用指向子类的对象
       Fu a = new Zi();
        //右边news谁就调用谁
        a.method();
        //父类特有方法
        a.methodFu();
    }
}
