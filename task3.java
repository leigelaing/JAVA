package com.leliang;

import java.util.Scanner;

/**
 * 写一个函数，接受一个整数n，输出1+2+3+...+n 的和 
 */
public class task3 {
	
	public static void  Sum(int x){
		int i = 0;
		int sum = 0;
		for (i = 0;i <= x;i++){
		    	
			sum  = sum +i;
		}
		System.out.print("整数"+x+"的和为： "+sum);
	}
	public  static  void  main(String[]args){
	    Scanner input = new Scanner(System.in);
	    System.out.print("请输入一个整数");
	    int n = input.nextInt();
	    Sum(n);
	}
}
