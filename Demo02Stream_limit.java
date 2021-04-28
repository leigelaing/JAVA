package com.demo01;

import java.util.stream.Stream;

/*
  Stream流中的常用方法，limit：用于截取流中的元素
  limit方法可以对流进行截取，只取用前n个。方法签名：
  Stream<T> limit (long maxSize);
  参数是一个long类型，如果集合当前长度大于参数则进行截取，否则不进行操作
  limit方法是一个延迟方法，只是对流中的元素进行截取，返回是一个新的流，
  所以可以继续调用Stream流中的其他方法。
  */
public class Demo02Stream_limit {
     public static void main(String[] args) {
       //获取一个Stream流
         String[] arr = {"a","b","c","d","e"};
         Stream<String> stream = Stream.of(arr);
        //使用limit方法对Stream流中的元素进行截取，只要前3个元素。
         Stream<String> stream2 = stream.limit(3);
         //遍历stream2
         stream2.forEach((i)->{
             System.out.println(i);
         });
     }
}
