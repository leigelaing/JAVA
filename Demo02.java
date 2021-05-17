package com.test01;

import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        System.out.println("========================");
        //向集合中添加一些数据，需要用add方法。
        list.add("张研萌");
        System.out.println(list);//[张研萌]
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        System.out.println(list);
    }
}
