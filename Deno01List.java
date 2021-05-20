package Demo01;
import java.util.ArrayList;
import java.util.List;
/*
使用传统方式，遍历集合，堆积中的数据进行过滤。
 */
public class Deno01List {
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
        List<String> listA = new ArrayList<>();
        for(String s:list){
            if(s.startsWith("张")){
                listA.add(s);
            }
        }
        //对list集合中进行过滤，只要姓名长度大于3，存储到新的集合中
        List<String> listB = new ArrayList<>();
        for(String s:list){
            if(s.length() == 3){
                listB.add(s);
            }
        }
        //遍历listB集合
        for(String a:listB){
            System.out.println(a);
        }
    }
}
