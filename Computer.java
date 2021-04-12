package com.demo4;

public class Computer {
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }
    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }
    //使用USB的的方法，使用接口作为方法的参数
    public void usbDevice(USB usb){//先判断
        usb.open();//打开设备
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;//向下转型
            mouse.click();
        }
        else if(usb instanceof Keyboard){//先判断
            Keyboard keyboard = (Keyboard) usb;//向下转型
            keyboard.type();
        }
        usb.close();//关闭设备
    }
}
