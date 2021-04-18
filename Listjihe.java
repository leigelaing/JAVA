package com.demo02;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
   Java.util.list接口  extends Collection接口、
   list接口的特点：
        1.有序的集合：存储元素与取出元素得顺序是一致的，（存入1 2 3  取出  1 2 3）
        2.有索引，包含了一些带索引的方法
        3.允许存储重复的元素。
   list接口中带索引的方法（特有）：
   public void add(int index E element); 将指定元素，添加到该集合中的指定位置上。
   public E get(int index);  返回集合中指定位置的元素
   public E remove(in index); 移除列表中指定位置的元素，返回的是被移除的元素。
   public E set(int index, E element); 用指定元素替换集合中指定位置的元素，返回的更新的元素。
   注意：
   1.操作索引注意索引越界访问异常
   IndexOutOfBoundsException（索引越界异常）
 */
public class Listjihe {
    public static void main(String[] args) {
        //创建一个list集合对象，（多态）
        List<String> l = new ArrayList<>();
        //使用add方法往集合中添加元素
        l.add("a1");
        l.add("a2");
        l.add("a3");
        l.add("a4");
        l.add("a1");
        //打印集合
        System.out.println(l);//重写了toString()方法
        //public void add(int index E element); 将指定元素，添加到该集合中的指定位置上。
        l.add(3,"操你老妈");
        System.out.println(l);
        // public E remove(in index); 移除列表中指定位置的元素，返回的是被移除的元素。
        String a = l.remove(3);//a中存放的是被移除的元素
        System.out.println(a);
        System.out.println(l);
        // public E set(int index, E element); 用指定元素替换集合中指定位置的元素，返回的更新的元素。
        String s = l.set(4,"我想操你妈");
        System.out.println(s);
        System.out.println(l);
        // public E get(int index);  返回集合中指定位置的元素
        //list集合遍历有三种方式
        //1.使用普通的for循环
        for (int i = 0; i < l.size(); i++) {
            String t = l.get(i);
            System.out.println(t);
        }
        System.out.println("=================================");
        //2.使用迭代器遍历
        Iterator<String> it = l.iterator();
        while(it.hasNext()){
            String r = it.next();
            System.out.println(r);
        }
        l.get(5);//越界
        System.out.println("==================================");
        //3.增强for循环
        for (String g : l) {
            System.out.println(g);
        }
    }
}
