package com.demo01;
/*
  异常产生过程的解析（分析异常是怎么产生的，如何处理异常）
 */
public class Demo02Exception {
    public static void main(String[] args) {
     //创建int类型的数组并赋值
        int[] arr = {1,2,3};
        int a = getElement(arr,3);
        //ArrayIndexOutOfBoundsException: 数组越界访问异常
        System.out.println(a);
    }
    /*
    定义一个方法：获取数组指定索引处的元素
    参数：
      int[] arr
      int index
     */
    public static int getElement(int[] arr, int index) {
        int ele = arr[index];
        return ele;
    }
}
