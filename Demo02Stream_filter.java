package com.demo01;
import java.util.stream.Stream;
/*
   stream流中的常用方法filter用来对Stream流的数据进行过滤
   Stream<T> filter(predicate<? super T> predicate);
   filter方法的参数Predicate是一个函数式接口，所以可以传递Lambda表达式，对数据进行过滤。
   Predicate中的抽象方法：
   boolean test<T t>;
   */
public class Demo02Stream_filter {
      public static void main(String[] args) {
          //创建一个Stream流
          Stream<String> stream1 = Stream.of("张范甘", "张守打", "张电费", "发的发", "是否是");
          //对Stream流中的元素进行过滤，只要性张的
          Stream<String> Stream2 = stream1.filter((String name) -> {
              return name.startsWith("张");
          });
          //遍历Stream2流
          Stream2.forEach(name-> System.out.println(name));
           /*
              Stream流属于管道流，只能被消费（使用）一次
              第一个Stream流调用完毕方法，数据就会转到下一个Stream上。
              而这是第一个Steam流已经使用完毕，就会关闭了。
              所以第一个Stream流就不能再掉用方法了。
              IllegalStateException
            */
          //遍历stream1
          stream1.forEach(name-> System.out.println(name));
      }
}
