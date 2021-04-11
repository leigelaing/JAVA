package com.gggggg;
/*
  从Java8开始，接口里允许定义默认方法。
  格式：
  public default  返回值类型  方法名称(参数列表){
          //方法体
  }
  备注：接口当中的默认方法，可以解决接口升级的问题。
  (接口升级实际就是在原有接口新加了抽象方法，但是实现类必须将所有抽象方法全部覆盖重写，
  所以出现了默认方法来解决那个新加的抽象方法的问题)
 */
public interface MyInterfaceDefault {
    //抽象方法
    public abstract  void methodAbs();
    //新添加了一个抽象方法
     //原实现类没有覆盖重写这个方法，在报错！
   // public abstract  void methodAbs2();

   //新添加了一个抽象方法，变为默认方法，就不会报错了
    public default void methodAbs2(){
        System.out.println("这是新添加的默认方法");
    }

}
