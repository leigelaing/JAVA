package com.demo01;

import java.util.stream.Stream;

/*
    Stream流中的常用方法concat，用于把流组合到一起
    如果有两个流。希望合并为一个流，那么可以使用Stream接口中的静态方法concat
    static <T Stream<T> concat(Stream<? extends T> a,Stream <T extends T> b )
   */
public class Demo02Stream_concat {
      public static void main(String[] args) {
       //创建一个Stream1流
          Stream<String> stream1 = Stream.of("股份", "地方", "水电费", "二人份", "委托人", "听歌");
       //创建一个Stream2流
          String[] arr = {"发放", "范文芳", "微服务", "为", "法尔我"};
          Stream<String> stream2 = Stream.of(arr);
       //把以上两个流组合为一个流
          Stream<String> concat = Stream.concat(stream1, stream2);
      //遍历concat流
        concat.forEach((i)->{
            System.out.println(i);
        });
      }
}
