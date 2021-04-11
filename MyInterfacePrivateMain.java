package com.kkkkkkk;

public class MyInterfacePrivateMain implements MyInterfacePrivate {
    public void methodAnother(){
        //直接访问到了接口中的默认方法，这是不对的，因为 methodCommon()方法是接口中
        //为了简化methodDefault1()和methodDefault2()方法中的公共代码的问题，不能被实现类访问
        //将methodCommon()方法变为private私有形式，实现类就无法访问到了
        //methodCommon();
    }
}
