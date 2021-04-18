package com.demo01;
import java.util.HashSet;
/*
   Set 集合不允许存储重复的元素
 */
public class HashSetsaveString {
    public static void main(String[] args) {
       //创建一个HashSet集合对象
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("种地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);
    }
}
