package com.leliang;
/**
 * 1. 写一个函数add，接受两个整数作为参数，返回这两个整数的和。 
 */
import java.util.Scanner;

public class task1 {
	public static int Add(int x,int y){
		int z = 0;
		z = x + y;
		return z;
		
	}

	public  static  void  main(String[]args)
	{
		Scanner input  = new Scanner(System.in);
		System.out.println("请输入两个数,中间空格隔开！");
		System.out.println("第一个数");
 		int a = input.nextInt();
 		System.out.println("第二个数");
 		int b = input.nextInt();
		int sum = Add(a,b);
		System.out.print("sum = "+ sum);
		
	}

}