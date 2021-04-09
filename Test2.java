package com.bdqn;

import java.util.StringTokenizer;

public class Test2 {
     //数组可以作为方法的参数。
    //当调用方法的时候，向方法的小括号进行传参，传递进去的其实是数组的地址值
     public static void main(String[] args) {
         int[] arr = {1,2,3,4,5};
         System.out.println(arr);//地址值
         printArr(arr);
     }
     public static  void printArr(int[] arr){
         for (int i = 0; i < arr.length; i++) {
             System.out.println(arr[i]);
         }
     }










    /*
    //数组元素的反转：将数组中的元素倒叙过来
    //不能使用新数组
    //数组元素的反转其实就是对称元素交换。

    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,6};
      for(int min = 0,max = arr.length-1;min < max;min++,max--){
          int temp = arr[min];
          arr[min] = arr[max];
          arr[max] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t"+arr[i]);
        }

    }

*/



    /*
    //求出数组中的最大值
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,10,4,5};
        int max  = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
     */








    /*

    //遍历数组：说的就是对数组当中的每个元素进行逐一，挨个处理，默认的处理方式就是打印输出

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //原始的方式输出
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //for 循环输出
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
*/





    /*
    //如何获取数组长度,格式:
    //数组名称.length
    //这将会得到一个int数字，代表数组长度。

    //数组一旦创建，程序运行期间，长度不可以改变
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 ={1,2,3,4};
        int[] arr3 = new int[]{1,2,3,4};

        int a = arr1.length;
        System.out.println("数组长度" + a);

        int[] arr5 = new int[3];
        System.out.println(arr5.length);  //3
        arr5 = new int[5];
        System.out.println(arr5.length);   //5

    }
*/



    /*
    //所有的引用数据类型，都可以赋值为一个NULL值，但是代表其中什么都没有。
    //数组必须进行new初始化才能使用其中的元素,
    //如果只是赋值一个null，没有进行new创建，会发生空指针异常
    //原因：忘了new
    //解决：补上new
    //空指针异常
    public static void main(String[] args) {
        int[] arr = null;
       // arr = new int[3];
        System.out.println(arr[0]);
    }

*/




    /*
    //数组下标从零开始，长度 - 1结束
    //如果访问数组元素的时候，索引编号并不存在，那么将会发生数组索引越界异常。
    //ArrayIndexOutOfBoundsException: 3
    //原因：索引编号写错了
    //解决：修改为存在的正确编号。
    public static void main(String[] args) {
        //数组索引越界异常
        int[] arr = {1,2,3};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //数组下标越界
        System.out.println(arr[3]);
    }

*/


    /*
    public static void main(String[] args) {
        int[] arr6 = {1, 2, 3};
        System.out.println(arr6);
    }

/*



        //数组动态初始化创建
        int[] arr ;
        arr= new int[5];
        double[] arr1 = new double[5];
        String[] arr3 = new String[5];
        //静态初始化
        int[] arr4 ;
        arr4= new int[]{5,15,25,45};
        String arr5 = new String[]{"Hellow","World"};

    }

*/



    /*
    public static void main(String[] args) {
        System.out.println(same(5,4));
    }
    public static  boolean  same(int a,int b){
        return (a == b);
    }
    public static  boolean  same(short a,short b){
        return (a == b);
    }public static  boolean  same(byte a,byte b){
        return (a == b);
    }public static  boolean  same(long a,long b) {
        return (a == b);
    }

     */
}
