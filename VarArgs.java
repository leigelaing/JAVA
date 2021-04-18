package com.demo01;
/*
  可变参数：是JDK1.5之后出现的新特性，
  使用前提：
  当方法的数据类型已经确定，但是参数的个数不确定，就可以使用可变参数。
  使用格式：定义方法时使用:
  修饰符  返回值类型 方法名(数据类型... 变量名){}
  可变参数的原理：
  可变参数的原理，数据底层就是一个数组，根据传递的参数个数不同，会创建不同长度的数组，来存储这些参数，
  传递的参数个数，可以0个参数（不传递）1个 2个  多个
  可变参数使用注意事项：
      1.一个方法的参数列表，只能有一个可变参数
      2.如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
   可变参数的特殊写法（终极写法）：可以接收任意类型的数据
     public static void  method(Object...obj){}
 */
public class VarArgs {
    public static void main(String[] args) {
        System.out.println(add(3,4));
        int a = add1(1,2,3);
        System.out.println(a);
    }
    //public static void method(int...arr,string... b){//
    //}   报错
    //可变参数必须写在参数列表的末尾
    public static int add(int a,int b,int...arr){
        return a+b;
    }
    //定义一个方法；计算两个int类型整数的和
   public static int add(int a,int b){
        return a+b;
   }
   //定义一个可变参数方法；计算多个int类型整数的和
    public static int add1(int...arr){
        System.out.println(arr);//[I@1b6d3586 底层是一个数组
        System.out.println(arr.length);//0
        //定义一个初始化的变量
        int sum = 0;
       /*
       for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
        */
        for(int a:arr){
           sum += a;
        }
        //求和结果返回
        return sum;
    }
}
