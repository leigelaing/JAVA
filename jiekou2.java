package com.jiekou;
/*
   接口的使用步骤：
   1.接口不能直接使用，必须有一个“实现类”来“实现”该接口。
   格式：
   public class 实现类名称 implements 接口名称{
        //
   }
   2.接口的实现类必须覆盖重写（实现）接口的所有的抽象方法。
    覆盖重写（实现）：去掉abstract关键字，加上方法体大括号。
   3.创建实现类的对象，进行使用。
  注意事项：
  1.如果实现类并没有覆盖重写所有的抽象类方法，那么这个实现类必须是抽象类。
  2.
 */
public class jiekou2 implements MyInterfaceAbs{
    @Override
    public void methodAbs1() {
        System.out.println("第一个方法");
    }
    @Override
    public void methodAbs2() {
        System.out.println("第二个方法");
    }
    @Override
    public void methodAbs3() {
        System.out.println("第三个方法");
    }
    @Override
    public void methodAbs4() {
        System.out.println("第四个方法");
    }
}
