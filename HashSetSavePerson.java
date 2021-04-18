package com.demo01;
import java.util.HashSet;
/*
  使用HashSet集合存储自定义元素
  set接口保证存储的元素唯一：
     存储的元素（String，Integer  Student  Person ） 必须重写HashSet方法和equals方法
     要求：
        同名 同龄的人 视为同一个人，只能存储一次。
 */
public class HashSetSavePerson {
    public static void main(String[] args) {
       //创建一个HashSet集合存储person
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("雷葛亮", 25);
        Person p2 = new Person("雷葛亮", 25);
        Person p3 = new Person("雷葛亮", 24);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
