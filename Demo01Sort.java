package com.demo02;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*
  Java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
   public static <T> void sort(list<T> list):将集合中元素按照默认规则排序
   public static <T> void sort(list<T> list,Comparator<? super T>):将集合中的元素按照指定规则
   进行排序。
  Comparator和Comparable的区别：
  Comparable：
  自己（this）和别人（参数）比较，自己需要实现Comparable接口，重写比较的规则compareTo方法。
  Comparator：相当于找个第三者当裁判，比较两个。
  Comparator的排序规则：
     o1 - o2;//升序
     o2 - o1;//降序
 */
public class Demo01Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01);
        Collections.sort(list01, new Comparator<Integer>() {
            //重写比较规则：
            @Override
            public int compare(Integer o1, Integer o2) {
                //return o1 - o2;//升序
                return o2 - o1;//降序
            }
        });
        System.out.println(list01);
        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("a",18));
        list02.add(new Student("b",20));
        list02.add(new Student("c",17));
        list02.add(new Student("c",18));
        System.out.println(list02);
        /*
        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()- o2.getAge();//升序
            }
        });
         */
        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
              //按照年龄升序：
                int result = o1.getAge()- o2.getAge();//升序
              //如果；两个人的年龄相同，再使用姓名的第一个字进行比较、
                if(result == 0){
                    result = o1.getName().charAt(0)- o2.getName().charAt(0);
                }
                return result;
            }
        });
    }
}
