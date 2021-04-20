package com.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
       map集合遍历的第二种方法：
       使用Entry对象遍历。
       map集合中的方法：
       Set<Map.Entry <K,V>>entrySet();返回此映射中包含的映射关系的Set视图。
       实现步骤：
       1.使用Map集合中的方法，entrySet（），把Map集合中多个Entry对象取出来，存储到一个Set集合中，
       2.遍历Set集合，获取每一个Entry对象。
       3.使用Entry对象中的方法，getKey（）和getValue（）获取键与值。
   */
public class Entryjianzhidui {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",168);
        map.put("B",165);
        map.put("C",178);
        // 1.使用Map集合中的方法，entrySet（），把Map集合中多个Entry对象取出来，存储到一个Set集合中，
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        // 2.遍历Set集合，获取每一个Entry对象。
        //使用迭代器遍历set集合
        Iterator<Map.Entry<String,Integer>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> enter = it.next();
            //3.使用Entry对象中的方法，getKey（）和getValue（）获取键与值
            String key = enter.getKey();
            Integer value = enter.getValue();
            System.out.println(key+"="+value);
        }
           System.out.println("===============================");
            for(Map.Entry<String,Integer> enter1: set) {
                //3.使用Entry对象中的方法，getKey（）和getValue（）获取键与值
                String key1 = enter1.getKey();
                Integer value1 = enter1.getValue();
                System.out.println(key1 + "=" + value1);
            }
    }
}
