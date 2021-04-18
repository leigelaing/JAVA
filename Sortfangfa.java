package com.demo01;
import java.util.ArrayList;
import java.util.Collections;
/*
    import java.util.Collections集合工具类,用来对集合进行操作，部分方法如下：
    public static <T> void sort (list<T> list);将集合中的元素按照默认规则排序。
    注意：sort方法使用前提，
    被排序的集合里面存储的元素，必须实现Comparable接口，重写接口中的方法，compareTo方法定义排序的规则
    Comparable接口  中 compareTo方法排序规则：
    自己（this）-参数:升序
    参数-自己（this）：降序
 */
public class Sortfangfa {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01);
       // public static <T> void sort (list<T> list);将集合中的元素按照默认规则排序。
       //只能传list集合，不能传Set集合。
        Collections.sort(list01);//默认排序为升序（从小到大）
        System.out.println(list01);
        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("c");
        list02.add("b");
        System.out.println(list02);
        Collections.sort(list02);//默认排序为升序（从小到大）
        System.out.println(list02);
        ArrayList<Person1> list03 = new ArrayList<>();
        list03.add(new Person1("雷葛亮",18));
        list03.add(new Person1("雷葛静",14));
        list03.add(new Person1("雷葛华",17));
        System.out.println(list03);
        Collections.sort(list03);
        System.out.println(list03);
    }
}
