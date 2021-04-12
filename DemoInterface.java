package com.demo2;

import java.util.ArrayList;
import java.util.List;
/*
   java.util.list正是ArrayList所实现的接口

 */
public class DemoInterface {
    public static void main(String[] args) {
       //多态：左父（接口名称）右子（实现类名称）
        List<String> list = new ArrayList<>();
         List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
    public static List<String> addNames(List<String> list){
        list.add("迪丽热巴");
        list.add("雷葛亮");
        list.add("娃哈哈");
        return list;
    }
}
