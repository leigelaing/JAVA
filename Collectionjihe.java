package com.demo01;
import java.util.ArrayList;
import java.util.Collections;
/*
    java.utils.Collections是集合工具类，用来对集合进行操作，部分方法如下：
    public static <T> boolean addall(Collection<T> c,T...elements);往集合中添加元素
    public static void shuffle(list<?> list);打乱集合的顺序，
 */
public class Collectionjihe {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        /*
        //往集合中添加多个元素，
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        */
        //public static <T> boolean addall(Collection<T> c,T...elements);往集合中添加元素
        //一次在集合中存放多个元素
        Collections.addAll(list,"a","b","c", "d","e","f");
        System.out.println(list);
        // public static void shuffle(list<?> list);打乱集合的顺序，
        //打乱集合中元素的顺序
        Collections.shuffle(list);
        System.out.println(list);
    }
}
