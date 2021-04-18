package com.demo02;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
  java.util.Set接口 extends Collection接口
  Set接口的特点：
  1.不允许存储重复的数据
  2.没有索引，没有带索引的方法，也不能使用for循环遍历
  java.util.HashSet集合 implements Set接口
  HashSet集合的特点：
   1.不允许存储重复的数据
   2.没有索引，没有带索引的方法，也不能使用for循环遍历
   3.是一个无序的集合，存储元素与取出元素可能顺序不一致
   4.底层是一个哈希表结构（查询的速度非常的快）
 */
public class HashSetjihe {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //使用add添加元素
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(4);
        //使用迭代器遍历
        Iterator<Integer> a = set.iterator();
        while(a.hasNext()){
         Integer in = a.next();
            System.out.println(in);
        //增强for循环
            for(Integer a1:set){
                System.out.println(a1);
            }
        }
    }
}
