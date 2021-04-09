package com.bdqn;

import java.util.Arrays;

//面向过程：当需要实现一个功能的时候，每一个具体步骤都要亲历亲为，详细处理每一个细节
//面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具备该功能的人，来帮我做
//
//
public class Test3 {





    /*
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //要求打印格式为[1,2,3,4,5]
        //使用面向过程
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }

        }
            //面向对象
            //找到JDK提供的Arrays类
            //其中有一个toString方法，直接完成想要的结果
            System.out.println(Arrays.toString(arr));


    }

*/



}

    /*
    //一个方法可以有0,1多个参数，但是只能有0,1个返回值，不能有多个返回值。
    //如果希望一个方法中产生多个返回值，怎么办？
    //任何数据类型都能作为方法的参数类型，或者返回值类型
    //数组作为方法的参数，传递进去的其实是数组的地址值。
    //数组作为方法的返回值，返回的其实是数组的地址值。

    public static void main(String[] args) {
      //数组定义的精简写法


       int[] result = calculate(10,20,30);
        System.out.println("总和"+result[0]);
        System.out.println("平均数"+result[1]);

        System.out.println("main方法中接受到的数组返回值是：");
        System.out.println(result);
    }
    public static int[] calculate(int a,int b,int c){
        int sum = a + b + c;//总和
        int avg = sum / 3;//平均数
        //两个结果都希望进行返回
       //第一种
        int[] arr = new int[2];
        arr[0] = sum;
        arr[1] = avg;
        //第二种
        int[] arr1 ={sum,avg};
        System.out.println("calculate内部数组是");
        System.out.println(arr);
        return arr;

    }
}
*/