package com.demo01;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
  java.util.Collections集合工具类,用来对集合进行操作，部分方法如下：
  public static <T> void sort(list<T> list,Comparator<? super T>) ;
  将集合中的元素按照指定规则排序，
  Comparator和Comparable的区别：
  Comparable：自己（this）和 别人（参数）比较，自己需要实现Comparable接口，重写比较规则，
  compareTo方法；
  Comparator接口，找一个第三方的裁判比较两个。

  Comparator接口的排序规则：
   o1-o2; 升序
   o2-o1; 降序
 */
public class SortMain {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01);

        Collections.sort(list01, new Comparator<Integer>() {
            //重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
                //return o1 - o2;//升序排序
                return o2 - o1;//降序排序
            }
        });
        System.out.println(list01);

        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("abc",12));
        list02.add(new Student("abd",15));
        list02.add(new Student("hgf",20));
        Collections.sort(list02, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
             //按照年龄升序排序
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(list02);
    }
}
