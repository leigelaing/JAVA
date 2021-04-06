package com.hehe;

import java.util.ArrayList;

/*
   数组的长度不可以发生改变，
   但ArrayList集合的长度是可以改变的
   对应ArrayList来说，有一个尖括号<E>代表泛型
   泛型：也就是装在集合当中的所有元素，全部都是统一的什么类型。
   注意：泛型必须是引用数据类型，不能是基本数据类型

   注意事项：
   1.对于ArrayList集合来说，直接打印的不是地址值，而是内容。
   如果内容为空，得到的是空的中括号
   2.创建的是什么类型，集合中就应该放什么类型。
 */
public class jihe {
    public static void main(String[] args) {
     //创建一个ArrayList集合，集合的名称是 list 里面装的全部是String类型的数据
     //备注：从JDK1.7开始，右侧尖括号可以不写内容，但<>本身还是要写的
     ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        System.out.println("========================");
        //向集合中添加一些数据，需要用add方法。
        list.add("张研萌");
        System.out.println(list);//[张研萌]
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        System.out.println(list);
    }
}
