package com.demo01;
/*
  定义子类
 */
public class Ziman extends FuHumar {
    //子类重写SayHello的方法
    @Override
    public void SayHello() {
        System.out.println("Hello ,我是门一博");
    }
    //定义一个方法参数传递Greetable接口
    public void method(Greetable g){
        g.greet();
    }
    public void show(){
        //调用method方法，方法的参数Greetable是一个函数式接口，
        // 所以可以传递Lambda表达式
        /*
        method(()->{
            //创建父类FuHumar对象
            FuHumar fu = new FuHumar();
            //调用父类的SayHello方法
            fu.SayHello();
        });
        */
        //因为有子父类关系，所以存在一个关键字super，代表父类，所以我们直接使用super
        //调用父类的成员方法。
        method(()->{
           super.SayHello();
        });
        //优化Lambda表达式
        /*
          使用super引用父类的成员方法
          super已经存在了，
          父类的成员的方法SayHello已经存在
          所以我们可以直接使用super，引用父类的成员方法
         */
        method(super::SayHello);
    }
    public static void main(String[] args) {
        //创建一个Ziman对象
         new Ziman().show();
    }
}
