package com.demo01;
import java.util.HashMap;
import java.util.Map;
/*
    java.util.Map<k,V>集合。
    Map集合的特点：
    1.Map集合是一个双列集合，一个元素包含两个值（一个key 一个value）
    2.Map集合中的元素，key与value数据类型，可以相同，也可以不同。
    3.Map集合中的元素，Key是不允许重复的， value是允许重复的
    4.Map集合中的元素，key与value是一一对应的。

    java.util.HashMap<k,V>集合 implements Map<K,V>接口。
    HashMap集合的特点：
      1.HashMap集合底层是哈希表，查询的速度特别快
          JDK1.8之前，哈希表（数组+单项列表）
          JDK1.8之后，哈希表（数组+单项列表/红黑树）（链表的长度超过8，变为红黑树，提高查询效果。）
      2.HashMap集合是一个无序的集合，存储元素和取出元素的顺序有可能不一致。
    java.util.LinkedHashMap<k,V>集合 extends HashMap<K,V>集合
      LinkedHashMap<k,V>集合的特点：
      1.LinkedHashMap<k,V>集合的底层是哈希表+链表：有序（保证迭代的顺序）
      2.LinkedHashMap<k,V>集合是一个有序的集合，存储元素和取出元素的顺序是一致的。
   */
public class Mapjihe {
       public static void main(String[] args) {
          show01();
          show02();
          show03();
          show04();
       }
     /*
        boolean containskey(Object key)判断集合中是否包含指定的键。
        返回值：
         包含：true
         不包含：false
     */
    private static void show04() {
            //创建map集合对象，使用多态
            Map<String,Integer> map5 = new HashMap<>();
            map5.put("A",168);
            map5.put("B",165);
            map5.put("C",178);
           boolean a = map5.containsKey("B");
           System.out.println(a);
           boolean b = map5.containsKey("c");
           System.out.println(b);
    }
    /*
      public V get (Object key);根据指定的键，在map集合中获取对应的值。
      返回值：
         K存在，返回对应的value值
         K不存在，返回null值
    */
    private static void show03() {
     Map<String,Integer> map2 = new HashMap<>();
        map2.put("A",168);
        map2.put("B",165);
        map2.put("C",178);
       Integer V4 = map2.get("B");
        System.out.println("V4"+V4);
        Integer V5 = map2.get("c");
        System.out.println("V4"+V5);
    }
    /*
     public V remove(Object key);把指定的键，所对应的键值对元素，在map集合中删除，返回被删除元素的值(V)。
         返回值：V
         key存在，V返回被删除的值
         Key不存在，V返回null
    */
    private static void show02() {
          //创建map集合对象，使用多态
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("A",168);
        map1.put("B",165);
        map1.put("C",178);
        System.out.println(map1);
        //使用 public V remove(Object key);方法删除元素
        Integer V2 = map1.remove("B");
        System.out.println(V2);
        System.out.println(map1);
        //使用remove删除一个不存在的元素，返回值为：null
       Integer V3 = map1.remove("D");//自动拆箱可以使用int接收，但会报NullPointerException（空指针异常）使用Integer
        System.out.println(V3);
        System.out.println(map1);
       }
         /*
       public V put (K Key,V value);把指定的键与指定的值添加到map集合中去。
      返回值：V
            存储键值对的时候，Key不重复，返回值V是null
            存储键值对的时候，Key重复,会使用新的value 替换map中重复的value，返回被替换的value值；
         */
       private static void show01() {
           //创建map集合对象，使用多态
           Map<String,String> map = new HashMap<>();
           String V1 =  map.put("李晨","方冰冰1");
           System.out.println("V1"+V1);//V1 = null
           String V2 =  map.put("李晨","方冰冰2");
           System.out.println("V2"+V2);//V2 = 方冰冰1
           System.out.println(map);//{李晨=方冰冰2}
           map.put("a","A");
           map.put("b","B");
           map.put("c","C");
           map.put("d","D");
           System.out.println(map);
         }
   }
