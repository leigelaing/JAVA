package com.kkkkkkk;
/*
   //错误写法！
        //注意事项：不能通过接口实现类的对象。来调用接口当中的静态方法。
       // impl.methodStatic();

       //正确用法：通过接口名称直接调用其中的静态方法。
        //格式：
        // 接口名称.静态方法名称(参数);
 */
public class Demo03Interface {
    public static void main(String[] args) {
        //创建了实现类对象
        InterfaceStaticImpl impl = new InterfaceStaticImpl();

       //通果接口名称直接调用静态方法。
        MyInterfaceStatic.methodStatic();
    }
}