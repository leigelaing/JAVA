package com.demo01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/*
   如果一个方法的返回值类型是一个函数式接口，那么就直接返回Lambda表达式。
   当需要通过一个方法获取一个java.util.Comparator接口类型的对象作为排序器时，
   就可以调该方法获取。
 */
public class Demo02Comparator {
    //定义一个方法，方法的返回值类型使用函数式接口Comparator
    public static Comparator<String> getComparator(){
        //方法的返回值类型是一个接口，那么我们可以返回这个接口的匿名内部类
        /*
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //降序排序
                return o2.length()-o1.length();
            }
        };
        */

        /*
        //（优化）方法的返回值是一个函数式接口，所以我们可以返回一个叫Lambda表达式
        return(String o1, String o2)->{
            //降序排序
            return o2.length()-o1.length();
        };
        */
        //优化Lambda表达式
        return( o1,  o2)->
            //降序排序
            o2.length()-o1.length()
        ;
    }

    public static void main(String[] args) {
        //创建一个字符串数组
        String[] array = {"aaa","bb","cccccccc","ddddddddddd"};
        //输出排序前的数组
        System.out.println(Arrays.toString(array));
        //调用Arrays中的sort方法，对字符串数组进行排序。
        Arrays.sort(array,getComparator());
        //输出排序后的数组
        System.out.println(Arrays.toString(array));
    }
}