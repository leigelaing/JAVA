package com.demo01;

import java.util.ArrayList;

/*
   自动拆箱与装箱：基本数据类型和包装类之间可以自动相互转换
   JDK1.5之后才有的功能。

 */
public class zidongchaixiangyuzhuangxiang {
    public static void main(String[] args) {
         /*
           自动装箱：直接把int类型的整数赋值给包装类
          */
        Integer in = 1;//相当于： Integer in = new Integer(1);
       /*
           自动拆箱：in是包装类，无法直接参与运算，可以自动转换为基本数据类型，在进行计算
           in+2就相当于 in.intvale()+2 = 3
            in = in.intvale()+2 = 3 又相当于一个自动装箱
        */
        in = in+2;

        ArrayList<Integer> list = new ArrayList<>();
        /*
         ArrayList集合无法直接存储整数，可以存储Integer包装类。
         */
         list.add(1);//隐含自动装箱  相当于  list.add(new Integer(1));
         int a = list.get(0);//隐含自动拆箱
         list.get(0).intValue();
    }
}
