package com.leliang;

import java.util.Scanner;

/**
 * дһ������������һ������n�����1+2+3+...+n �ĺ� 
 */
public class task3 {
	
	public static void  Sum(int x){
		int i = 0;
		int sum = 0;
		for (i = 0;i <= x;i++){
		    	
			sum  = sum +i;
		}
		System.out.print("����"+x+"�ĺ�Ϊ�� "+sum);
	}
	public  static  void  main(String[]args){
	    Scanner input = new Scanner(System.in);
	    System.out.print("������һ������");
	    int n = input.nextInt();
	    Sum(n);
	}
}
