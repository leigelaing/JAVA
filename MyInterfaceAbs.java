package com.jiekou;
/*
   在任何版本的java中，接口都能定义抽象方法；
   public abstract 返回值类型 方法名称(参数列表);

   注意事项：
   1.接口当中的抽象方法：修饰符必须是两个固定的关键字：public abstract（不写也默认是）
   2.这两个关键字修饰符，可以选择性的省略。（今天新学，不推荐省略）
   3.方法的三要素可以随意定义（方法名称 返回值类型 参数列表）
 */
public interface MyInterfaceAbs {
   //以下四种抽象方法都对
    //这是一个抽象方法
    public abstract void methodAbs1();
    //这也是抽象方法
     abstract void methodAbs2();
   //这也是抽象方法
   public  void methodAbs3();
    //这也是抽象方法
    void methodAbs4();
}
