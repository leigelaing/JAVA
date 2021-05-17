package com.test01;
import java.util.ArrayList;
import java.util.Random;

/*
  题目:用一个大集合，存入20个随机数，然后筛选其中的偶数元素，放到小集合中去。
  要求：使用自定义的方法来实现筛选。
 */
public class Demo06ArrayReturn {
    public static void main(String[] args) {
     ArrayList<Integer> list1 =new ArrayList<>();
        Random a = new Random();
        for (int i = 0; i < 20; i++) {
            int b = a.nextInt(100)+1;
            list1.add(b);
        }
        ArrayList<Integer> list3 = shaixuan(list1);
        //遍历
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }
    }
    public static ArrayList<Integer> shaixuan(ArrayList<Integer> a) {
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            int in = a.get(i);
            if (in % 2 == 0) {
                list2.add(in);
            }
        }
        return list2;
     }
    }

