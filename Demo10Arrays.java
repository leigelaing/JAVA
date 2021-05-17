package com.test01;

import java.util.Arrays;
import java.util.Scanner;

/*
题目：请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒叙打印


 */
public class Demo10Arrays {
    public static void main(String[] args) {
       String str = "adsfgfdgvtfvrtfgvrtgfb75";
       //Arrays类中sort方法
        //先将str(字符串)变为数组，使用String类中的toCharArray（）方法；
        char[] chars = str.toCharArray();
        Arrays.sort(chars);//对数组进行升序
        //需要遍历
        //cahrs.forr  (倒叙的快捷键)
        for (int i = chars.length-1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
