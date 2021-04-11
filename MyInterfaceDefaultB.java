package com.gggggg;

public  class MyInterfaceDefaultB implements MyInterfaceDefault{

    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法BBB");
    }
    public  void methodAbs2(){
        System.out.println("实现类B覆盖重写了接口的默认方法！");
    }

}
