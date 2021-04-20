package com.demo01;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
  map集合的第一种遍历方式：通过键找值的方式
  map集合中的方法：
     Keyset方法：
     set<K> keyset();返回此映射中包含的键的set视图。
   实现步骤：
   1.使用map集合中的方法，Keyset方法，把map集合中的所有key取出来，存储到一个set集合中去。
   2.遍历set集合，获取map集合中的每个key
   3.通过map集合中的方法get（key）方法，通过key找到value；
 */
public class Demo02Keyset {
    public static void main(String[] args) {
        Map<String,Integer> map5 = new HashMap<>();
        map5.put("A",168);
        map5.put("B",165);
        map5.put("C",178);
        //1.使用map集合中的方法，Keyset方法，把map集合中的所有key取出来，存储到一个set集合中去。
       Set<String> set = map5.keySet();
       // 2.遍历set集合，获取map集合中的每个key
        System.out.println("================================");
        //使用迭代器遍历Set集合
         Iterator<String> it =  set.iterator();
         while(it.hasNext()){
             String key = it.next();
             // 3.通过map集合中的方法get（key）方法，通过key找到value；
             Integer value = map5.get(key);
             System.out.println(key +" = "+ value);
         }
        System.out.println("====================================");
        //使用增强for循环，遍历Set集合
        for(String key:set){
            // 3.通过map集合中的方法get（key）方法，通过key找到value；
            Integer value = map5.get(key);
            System.out.println(key +" = "+ value);
        }
        System.out.println("==============================");
        //使用增强for循环，遍历Set集合
        for(String key:map5.keySet()){
            // 3.通过map集合中的方法get（key）方法，通过key找到value；
            Integer value = map5.get(key);
            System.out.println(key +" = "+ value);
        }
    }
}
