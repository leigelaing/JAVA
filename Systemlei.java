package com.demo01;

import java.util.Arrays;

/*
   java.lang.System类中提供了大量的静态方法，可以获取，与系统相关的信息或者系统操作，在System类的
   API文档中，常用的方法有：
   public static  long currentTimeMillis();   ：返回以毫秒为单位的当前时间
   public static native void arraycopy(Object src,  int  srcPos,
      Object dest, int destPos,int length);  ： 将数组中指定的数据拷贝到另一个数组中
 */
public class Systemlei {
    public static void main(String[] args) {
     demo01();
     demo02();

    }
   /*
   public static native void arraycopy(Object src,  int  srcPos,
      Object dest, int destPos,int length);  ： 将数组中指定的数据拷贝到另一个数组中
      参数的意义：
        src - 源数组。
     srcPos - 源数组中的起始位置。（起始位置）
       dest - 目标数组。
    destPos - 目的地数据中的起始位置。
     length - 要复制的数组元素的数量。
    */
    //src数组元素[1,2,3,4,5]    dest数组元素[6,7,8,9,10]
    //拷贝完成结果：src数组元素[1,2,3,4,5]    dest数组元素[1,2,3,9,10]
    private static void demo02() {
        //定义源数组
        int[] src = {1,2,3,4,5};
        //定义目标数组
        int[] dest = {6,7,8,9,10};
        //输出前
        System.out.println("复制前"+ Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后"+Arrays.toString(dest));

    }

    /*
     public static  long currentTimeMillis();   ：返回以毫秒为单位的当前时间
     作用：用来测试程序的效率
     */
    //验证for循环打印9999所需要的时间(毫秒值统计)
    private static void demo01() {
         //程序执行前获取一次毫秒值；
        long start = System.currentTimeMillis();
        //执行一个for循环

        for (int i = 0; i <= 9999; i++) {
            System.out.println(i);
        }
        //程序执行完成获取一次毫秒值；
        long end = System.currentTimeMillis();
        System.out.println("所需毫秒值为:"+(end - start));
    }
}
