package com.demo02;

import java.util.HashMap;
import java.util.Hashtable;

/*
  java.util.Hashtable<k,V>集合  implements Map<K,V>接口
  Hashtable ：底层也是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢。
  HashMap ：底层也是一个哈希表，是一个线程不安全的集合，是多线程集合，速度快。
  HashMap集合（之前学习的集合）可以存储null值，null键
  Hashtable集合，不能存储null，null键
  Hashtable和Vector集合一样，在JDK1.2版本之后被更加先进的集合（HashMap，ArrayList）取代了
  Hashtable的子类Properties依旧活跃在历史舞台。
  Properties集合是一个唯一和IO流相结合的集合。
 */
public class Demo02Hashtable {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);//{null=null, b=null}
        Hashtable<String, String> mapt = new Hashtable<>();
        mapt.put(null,"a");//error
        mapt.put("b",null);//error
        mapt.put(null,null);//error
        System.out.println(mapt);
    }
}
