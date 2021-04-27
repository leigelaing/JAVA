package com.demo01;
/*
@Override 注解：
检测方法是否为一个重写的方法：
是：编译成功
否：编译失败
/*
函数式接口的使用，一般 可以作为方法的参数和返回值类型
 */

public class myMain  {
  //定义一个方法，参数使用函数式接口，textMyjiekou
    public static void show(textMyjiekou  jiekou){
        jiekou.method();
    }
    public static void main(String[] args) {
     //方法参数是接口，那我我们可以传接口的实现类对象
     //调用show方法，方法的参数是一个接口，所以我们传递接口的实现类对象。
     show(new shixianlei());
     //调用show方法，方法的参数是一个接口，所以我们可以传递接口的匿名内部类
     show(new textMyjiekou() {
         @Override
         public void method() {
             System.out.println("使用匿名内部类重写接口中的抽象方法。");
         }
     });
     //调用show方法，方法的参数是一个函数式接口，所以我们可以，传递Lambda表达式
        show(()->{
            System.out.println("使用lambda表达式，重写接口中的抽象方法");
        });
        //简化Lambda表达式：
        show(()->
            System.out.println("使用lambda表达式，重写接口中的抽象方法")
        );
    }
}
