package com.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
   Java.util.Iterator接口：迭代器（对集合进行遍历）
   有两个常用的方法：
     boolean hasNext() 如果任有元素可以迭代，则返回 true。
     判断集合中还有没有下一个元素，有就返回 true 没有就返回 false
     E next()  返回迭代的下一个元素。
       取出集合中的下一个元素。
    Iterator迭代器是一个接口，我们无法直接使用，需要使用Iterator接口的实现类对象，获取实现类的方法比较特殊
    Collection接口中有一个方法叫iterator(),这个方法返回的就是迭代器的实现类对象，
    Iterator<E> iterator()，返回在此，Collection的元素上进行迭代的迭代器。

    迭代器的使用步骤：
    1.使用集合中的方法iterator(),获取迭代器的实现类对象，使用Iterator接口接收（多态）
    2.使用Iterator接口中的方法，hasNext()判断还有没有下一个元素。
    3.使用Iterator接口中的方法next取出集合中的下一个元素。
 */
public class IteratorMain {
    public static void main(String[] args) {
        //创建一个集合（多态）
        Collection <String> coll = new ArrayList<>();
        //往集合中添加元素
        coll.add("我爱你1");
        coll.add("我爱你2");
        coll.add("我爱你3");
        coll.add("我爱你4");
        coll.add("我爱你5");
        coll.add("我爱你6");
        coll.add("我爱你7");
        coll.add("我爱你8");
        System.out.println(coll);
     /*
        1.使用集合中的方法iterator(),获取迭代器的实现类对象，使用Iterator接口接收（多态）
        注意：
           Iterator<E>接口也是有泛型的，迭代器的泛型跟着集合走。集合是什么泛型，迭代器就是什么泛型。
    */
        //多态   接口              实现类对象
        Iterator<String> it =  coll.iterator();
        /*
        2.使用Iterator接口中的方法，hasNext()判断还有没有下一个元素。
         */

        //boolean b = it.hasNext();
        //System.out.println(b);
        /*
          3.使用Iterator接口中的方法next取出集合中的下一个元素。
         */
        /*
          每次只能获取一个，需要多次重复，
          发现使用迭代器取出集合中元素的代码，是一个重复的过程。所以使用循环优化
           不知道接种有多少元素，使用while循环
           循环结束的条件，hasNext()方法，返回false
         */
         //String str = it.next();
        //System.out.println(str);
        //优化迭代器(while循环)
        while(it.hasNext()){
            String st = it.next();
            System.out.println(st);
        }

    }
}
