package Demo01;
import java.util.ArrayList;
import java.util.List;
/*
  使用Stream流的方式，遍历集合，对集合中的数据进行过滤
  stream流是JDK1.8之后出现
  关注的是什么，不是做什么
 */
public class Demo01Stream {
    public static void main(String[] args) {
        //创建一个list集合，存储姓名
        List<String> list = new ArrayList<>();
        list.add("张a");
        list.add("bfdf");
        list.add("张c");
        list.add("d");
        list.add("张e");
        list.add("雷葛亮");
        //对list集合中的元素进行过滤，只要以张开头，存储到新的集合中
        //对list集合中进行过滤，只要姓名长度大于3，存储到新的集合中
        //遍历listB集合
        /*
        集合中有一个Stream方法，将集合转换为Stream流，流中有过滤方法叫，filter方法。
            Stream<T> filter(Predicate<? super T> predicate);
            参数是Predicate接口，所以可以使用Lambda表达式
         */
        list.stream()
          .filter(name->name.startsWith("张"))
          .filter(name->name.length() == 3)
        .forEach(name-> System.out.println(name));


    }
}
