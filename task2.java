package com.leliang;

import java.util.Scanner;

//2. 写一个函数，接受一个整数，输出这个整数的所有因子。
public class task2 {
	public  static void  divisor (int x){
		int i = 1;
		int y = 0;
		System.out.print("整数"+ x +"的因子：");
		for(i = 1;i <= x;i++){
			if(x%i == 0){
				System.out.print(i+" ");
			}
		}
	}
	public  static  void  main(String[]args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
	    divisor(a);
	}

}
