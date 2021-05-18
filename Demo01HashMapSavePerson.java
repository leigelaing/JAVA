package com.demo02;

import com.demo01.Person;
import jdk.nashorn.internal.ir.CallNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
   HashMap存储自定义类型的键值
   Map集合保证Key是唯一的
   作为Key的元素，必须重写HashMap方法和equals方法，保证Key唯一。

 */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
     show01();
     show02();
    }
    /*
       HashMap存储的自定义类型的键值
       key：Person类型
           必须重写HashCode方法和equals方法，才能保证key唯一
      value：String 类型
          可以重复
     */
    private static void show02() {
        //创建HashMap集合
        HashMap<Person, String> map = new HashMap<>();
        //往集合中添加元素
        map.put(new Person("a",18),"A");
        map.put(new Person("b",18),"B");
        map.put(new Person("c",30),"C");
        map.put(new Person("a",18),"D");
        //使用entrySet和增强for遍历Map集合。
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for(Map.Entry<Person, String> entry:set){
            Person person = entry.getKey();
            String value = entry.getValue();
            System.out.println(person+"----->"+value);
        }
    }

    /*
       HashMap存储的自定义类型的键值
       key：String 类型
           String类已经重写HashCode方法和equals方法，可以保证key唯一
      value：Person类型
      value可以重复，（同名，同年龄的人视为同一个人）
     */
    private static void show01() {
       //创建HashMap集合
        HashMap<String, Person> map = new HashMap<>();
       //往集合中添加元素
        map.put("A",new Person("a",18));
        map.put("B",new Person("b",19));
        map.put("C",new Person("c",20));
        map.put("A",new Person("d",18));
      //遍历Map集合
        Set<String> set = map.keySet();
      for(String key:set){
          Person value = map.get(key);
          System.out.println(key+"---->"+value);
      }
    }
}
