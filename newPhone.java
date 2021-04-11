package com.sadff;
//定义新手机，老手机作为父类
public class newPhone extends Phone{
    @Override
    public void show() {
        //把父类的show方法拿过来重复利用，自己再添加更多内容。
        super.show();
        System.out.println("显示头像");
        System.out.println("显示姓名");
    }
}
