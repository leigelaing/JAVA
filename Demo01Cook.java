package com.demo01;
/*
   需求：
     给定一个厨子Cook接口，内含唯一的抽象方法，makeFood，且无参数，无返回值
     使用Lambda的标准格式，调用invokeCood方法，打印输出“吃屎了”字样。
 */
public class Demo01Cook {
    public static void main(String[] args) {
        //调用invokeCood方法参数是Cook接口，传递Cook接口的匿名内部类对象。
        invokeCood(new Cook() {
            @Override
            public void makeCood() {
                System.out.println("吃饭了");
            }
        });
        //使用Lambda表达式转换为简单匿名内部类的书写
        invokeCood(()->{
                System.out.println("吃饭了");
        });
    }
    //定义一个方法参数传入Cook接口，方法内部调用Cook接口中的方法叫makeCood
    public static void invokeCood(Cook coo){
        coo.makeCood();
    }
}
