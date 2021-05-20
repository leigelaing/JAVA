package Demo01;

import java.util.function.Supplier;

/*
  求数组的最大最大值
  使用Supplier接口作为参数的类型，通过Lambda表达式求出int数组的最大值。
 */
public class Demo01Supplier {
    //定义一个方法，用于获取数组中元素的最大值，方法的参数传递Supplier接口，泛型使用Interge
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }
    public static void main(String[] args) {
     //定义一个int类型的数组
     int[] arr = {100,52,51,63,56};
     //调用getMax方法，方法的参数Supplier<Integer>接口，可以传递Lambda表达式
        int maxx = getMax(()->{
            //获取数组的最大值并返回
            //定义一个变量，把数组中的第一个元素赋值给变量，记录数组中元素的最大值。
            int max = arr[0];
            for(int i : arr){
                //如果i大于Max替换Max
                if(i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println("最大值"+maxx);
    }
}
