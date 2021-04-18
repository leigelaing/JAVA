package com.demo01;

import java.util.ArrayList;
import java.util.Collection;

/*
   java.util.Collection接口
   所有单列集合的最顶层的接口，里面定义了所有单列集合共性的方法。
   任意的单列集合都可以使用Collection接口中的方法。
   共性的方法：
   public  boolean add(E e):把给定元素添加到当前集合中去
   public  void clear();清空集合中的所有元素
   public  boolean remove(E e):把给定的对象在当前集合中删除
   public  boolean contains(E e):判断当前集合中是否包含给定的对象
   public  boolean isEmpty():判断当前集合是否为空
   public  int size():返回集合中元素的个数
   public  Object[] toArray():把集合中的元素，存储到数组中。
 */
public class CollectionMain {
    public static void main(String[] args) {
        //创建集合对象（使用多态）
        Collection<String>  coll = new ArrayList<>();
        System.out.println(coll);//重写了toString方法
        /*
        public  boolean add(E e):把给定元素添加到当前集合中去
          返回值为boolean值，一般都返回true因此可以不用接受
         */
        boolean bl = coll.add("雷葛亮1");
        System.out.println("bl "+bl);
        System.out.println("coll"+coll);
        coll.add("雷葛亮2");
        coll.add("雷葛亮3");
        coll.add("雷葛亮4");
        coll.add("雷葛亮5");
        coll.add("雷葛亮6");
        coll.add("雷葛亮7");
        System.out.println(coll);
        /*
         public  boolean remove(E e):把给定的对象在当前集合中删除
         返回值是一个boolean值，集合中存在元素，删除元素返回true，集合中不存在元素，
         删除失败，返回false。
         */
        //删除一个存在的
        boolean bool = coll.remove("雷葛亮2");//直接书写删除元素
        System.out.println(bool);
        System.out.println(coll);
        //删除不存在的
        boolean bool1 = coll.remove("雷葛亮8");//直接书写删除元素
        System.out.println(bool1);
      /*
       public  boolean contains(E e):判断当前集合中是否包含给定的对象
       包含返回true 不包含返回false
       */
        boolean lean = coll.contains("雷葛亮4");
        System.out.println(lean);
        /*
         public  boolean isEmpty():判断当前集合是否为空
         返回值为boolean   集合为空 返回true  集合不为空返回 false
         */
        boolean b1 = coll.isEmpty();
        System.out.println(b1);
        /*
          public  int size():返回集合中元素的个数
         */
        int a = coll.size();
        System.out.println(a);
        /*
         public  Object[] toArray():把集合中的元素，存储到数组中。
          因为集合中存储的类型不唯一，定义数组只能使用的类型为Object类型，Object类型可以存放各种数据类型

         */
        Object[] arr = coll.toArray();
        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
        }
        /*
           public  void clear();清空集合中的所有元素
           但是不删除集合，仅仅是将集合中的元素清除，集合还在
         */
        coll.clear();
        System.out.println(coll);
    }
}
