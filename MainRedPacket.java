package com.test03;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager man = new Manager("群主",100);
        Member one =new Member("aaa",0);
        Member tow =new Member("bbb",0);
        Member three =new Member("ccc",0);
        man.show();
        one.show();
        tow.show();
        three.show();
        System.out.println("========================");
        //群主发20  一共3个
        ArrayList<Integer> redlist = man.send(20,3);
       //3个人收红包
        one.receive(redlist);
        tow.receive(redlist);
        three.receive(redlist);
        man.show();
        one.show();
        tow.show();
        three.show();
    }
}
