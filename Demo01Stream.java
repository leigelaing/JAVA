package com.demo01;

import java.util.*;
import java.util.stream.Stream;

/*
  java.util.stream.Stream<T>是java 8新加入的最常用的流接口。（这并不是一个函数式接口）
  获取一个流非常简单，有以下几种获取方式:
    （1）所有的Collection集合都可以通过Stream默认方法获取流（单列集合直转换 ）
      default Stream<E> stream();
    （2）Stream接口的静态方法of可以获取数组对应的流。
    static <T> Stream<T> of(T... values)
    参数是一个可变参数，那么就可以传递一个数组
 */
public class Demo01Stream {
    public static void main(String[] args) {
        //集合转换为Stream流,
        //list 集合转换
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();
       //Set集合转换
        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();
        //Map集合转换（间接转换）
        Map<String,String> map = new HashMap<>();
        //获取键 Map集合中的方法KeySet方法 (获取键：将键存储到Set集合中)
        Set<String> keyset = map.keySet();
        Stream<String> stream3 = keyset.stream();
        //获取值 存储到一个Collection集合中去：
        Collection<String> valuse = map.values();
        Stream<String> stream4 = valuse.stream();
        //获取健值对（键与值的映射关系 entrySet）
        Set<Map.Entry<String,String>> entries = map.entrySet();
        Stream<Map.Entry<String,String>> stream5 = entries.stream();


        //把数组转换为Stream流
        Stream<Integer> Stream6 = Stream.of(1, 2, 3, 4, 5);
        //可变参数可以传递数组
        Integer[] arr = {1,2,3,4,5};
        Stream<Integer>  Stream7 = Stream.of(arr);
        //其他类型的数组
        String[] arr1 = {"a","b","c","d"};
        Stream<String> Stream8 = Stream.of(arr1);
    }
}
