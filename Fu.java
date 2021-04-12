package com.demo5;
/*
当final关键字修饰一个方法，这个方法就是最终方法。也就是不能被覆盖重写。
格式：
  修饰符 final 返回值类型 方法名称(参数列表){
     //方法体
  }
  注意事项：
  对于类与方法来说，abstract与final关键字不能同时使用，因为矛盾。
  abstract关键字用来定义抽象类，抽象类的所有方法都是要被子类重写的，而final关键字修饰的类与方法
  是不能被重写覆盖的，这样就导致相互矛盾
 */
/*
public abstract class Fu {
    public final void method(){
        System.out.println("父类方法的执行");
    }
    //abstract 方法一定要被覆盖重写
    //final  方法不能被覆盖重写
    //矛盾
    public abstract final void methodA();
}
*/