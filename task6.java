package com.leliang;

import java.util.Scanner;

/**
 *写一个函数，判断一个整数是否是质数 
 */
public class task6 {
	public  static  void  PrimeNum(int x){
		int i = 2;
		int a = 0;
		for(i = 2;i < x-1;i++)
		{
		    if(x%i == 0){
		         a++;	
		    }
		}	   
		if(a == 0){
			System.out.print("是");
		}
		else{
			System.out.print("不是");
		}
	}
	public  static  void  main(String[]args){
		Scanner input = new Scanner(System.in);
	    System.out.print("请输入一个整数");
	    int n = input.nextInt();
	    PrimeNum (n);
	  
	}

}
