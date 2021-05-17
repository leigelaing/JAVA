package com.test01;

import java.util.ArrayList;
import java.util.Random;

/*
  题目：生成6个1-33之间的随机整数，添加到集合并且，并且遍历集合
 */
public class Demo03Arraylist {
    public static void main(String[] args) {
        //1.创建一个可以存储6个数字的集合。
        ArrayList<Integer> list = new ArrayList<>();
        //2.产生随机数字
        Random b = new Random();
        //3.用循环6次，来产生6个随机数
        for (int i = 0; i < 6; i++) {
            Integer c = b.nextInt(33)+1;//变为1-33
            //4.把数字添加到list集合中去
            list.add(c);
        }
        for(int i = 0;i<list.size();i++){
            Integer integer = list.get(i);
            System.out.println(integer);
        }

    }
}
