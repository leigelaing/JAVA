package com.hehe;
import java.util.Scanner;
import java.util.SortedMap;
//匿名对象作为参数和返回值
public class Test4 {
    public static void main(String[] args) {
        //普通使用方法
        Scanner  sc = new Scanner(System.in);
        int num = sc.nextInt();

        //匿名对象的方式
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("输入的数字为"+num1);

        //使用一般写入传入参数
        Scanner sc1 = new Scanner(System.in);
        methodparam(sc1);

        //使用匿名对象进行传参
        methodparam(new Scanner(System.in));

        Scanner cv = method();
        int num5 = cv.nextByte();
        System.out.println("输入的是"+num5);
    }
    public  static void methodparam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是"+num);
    }
    public static Scanner method(){
        return new Scanner(System.in);
    }
}
