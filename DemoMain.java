package com.demo4;

public class DemoMain {
    public static void main(String[] args) {
        //创建一个笔记本
        Computer computer = new Computer();
        computer.powerOn();
        //准备一个鼠标，供USB使用
        //首先向上转型
        USB usbMouse =new Mouse();//多态
        //参数是USB类型，穿进去的就是USB鼠标
        computer.usbDevice(usbMouse);

         //准备一个键盘，供USB使用
         //首先向上转型
        USB usbKeyboard =new Keyboard();//多态
        //参数是USB类型，穿进去的就是USB键盘
        computer.usbDevice(usbKeyboard);

        //准备一个键盘，供USB使用（方案二）
        Keyboard keyboard = new Keyboard();

        //将 Keyboard类型传给USB类型竟然不报错，请注意原因
        //原因就是自动发生了向上转型，将Keyboard——>USB
        //方法参数是USB类型，传递进去的却是实现类对象。
        //以下两种写法相同(使用子类对象匿名对象也是可以的)
        computer.usbDevice(new Keyboard());
        computer.usbDevice(keyboard);
        computer.powerOff();


        //原因分析
        method(10.0);//正确  double  --> double
        method(20);//正确 int ——> double
        int a = 30;
        method(30);//正确
    }
    public static void method(double num){
        System.out.println(num);
    }
}
