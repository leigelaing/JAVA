package com.demo5;
/*
  当final关键字修饰一个类的时候
  格式：
  public final class 类名称{
    //………………
  }
  含义：就是当前这个类不能有子类。就是【太监类】，但是一定有父类
   注意：子类才能进行方法重写（@Override）
    1.一个类如果是final的，那么其中所有的成员方法都无法进行覆盖重写（因为不能被子类继承）

 */
public final class MyClass/* extends Object*/ {
    public void method(){
        System.out.println("方法执行！");
    }


}
