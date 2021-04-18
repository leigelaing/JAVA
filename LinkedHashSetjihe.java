package com.demo01;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
  java.util.LinkedHashSet集合  extends HashSet集合
  LinkedHashSet集合的特点：
     底层是一个哈希表（数组+链表/红黑树）+链表：多了一条链表（记录元素的存储顺序），保证元素有序
 */
public class LinkedHashSetjihe {
    public static void main(String[] args) {
        //无序的，不允许重复的集合
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("Itcast");
        System.out.println(set);
        //有序的，不允许重复的集合
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("www");
        set1.add("abc");
        set1.add("abc");
        set1.add("Itcast");
        System.out.println(set1);
    }
}
