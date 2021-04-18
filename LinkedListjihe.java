package com.demo02;


import java.util.LinkedList;

import static com.demo01.FanXing.show02;

/*
java.util.linkedList集合，implements List接口
linkedList集合的特点：
   1.底层是一个链表结构，查询慢，增删快
   2.里面包含了大量操作首尾元素的方法
   注意：使用inkedList集合特有的方法，不能使用多态
  linkedList集合常用方法：
    public void addFirst(E e) ：在该列表开头插入指定的元素。
    public void addLast(E e) :将指定的元素追加到此列表的末尾。
    public E getFirst() :返回此列表中的第一个元素。
    public E getLast() :返回此列表中的最后一个元素。
    public E removeFirst() :从此列表中删除并返回第一个元素。
    public E removeLast() :从此列表中删除并返回最后一个元素。
    public void push(E e) :将元素推送到由此列表表示的堆栈上。
    public boolean isEmpty():如果列表不包含元素，返回true。
    public E pop();从此列表所表示的堆栈弹出一个元素。（相当于removeFirst() ）
 */
public class LinkedListjihe {
    public static void main(String[] args) {
       show01();
       show();
    }
    /*
     public void addFirst(E e) ：在该列表开头插入指定的元素。
     public void addLast(E e) :将指定的元素追加到此列表的末尾。
     public void push(E e) :将元素推送到由此列表表示的堆栈上。
    */
    private static void show01() {
     //创建linkedList集合对象。
        LinkedList<String> lin = new LinkedList<>();
        //使用add方法添加元素
        lin.add("a");
        lin.add("b");
        lin.add("c");
        lin.add("d");
        lin.add("e");
        System.out.println(lin);//[a,b,c,d,e]
        //public void addFirst(E e) ：在该列表开头插入指定的元素。
        lin.addFirst("二锅头");
        System.out.println(lin);
        //public void push(E e) :将元素推送到由此列表表示的堆栈上。
        lin.push("雷葛亮");
        System.out.println(lin);
        //public void addLast(E e) :将指定的元素追加到此列表的末尾  等效于add方法
        lin.addLast("集合");
        System.out.println(lin);
    }
    /*
   public E getFirst() :返回此列表中的第一个元素。
   public E getLast() :返回此列表中的最后一个元素。
    */
    private static void show() {
        //创建linkedList集合对象。
        LinkedList<String> link = new LinkedList<>();
        //使用add方法添加元素
        link.add("a1");
        link.add("b2");
        link.add("c3");
        link.add("d4");
        link.add("e5");
        System.out.println(link);
        // public E getFirst() :返回此列表中的第一个元素。
        if(!link.isEmpty()){
            String a = link.getFirst();
            System.out.println(a);
            //public E getLast() :返回此列表中的最后一个元素。
            String b = link.getLast();
            System.out.println(b);
            //public E removeFirst() :从此列表中删除并返回第一个元素。
            String c = link.removeFirst();
            System.out.println(c);
            //public E removeLast() :从此列表中删除并返回最后一个元素。
            String d = link.removeLast();
            System.out.println(d);
        }

        // public boolean isEmpty():如果列表不包含元素，返回true。
        link.clear();//清除集合元素
        boolean e = link.isEmpty();
        System.out.println(e);
    }
}
