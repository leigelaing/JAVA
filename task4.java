package com.leliang;

import java.util.Scanner;

/**
 * дһ������������һ����������n�����n �� Hello World
 */
public class task4 {
	public  static  void  Printf(int x){
	   int i = 0;
	   int sub = 0; 
	   for(i = 0;i <= (x-1);i++){
		System.out.println("hello  word");
		 sub++;
		}
	   System.out.print(sub);
	}
	
	public  static  void  main(String[]args){
		Scanner input = new Scanner(System.in);
	    System.out.print("������һ������");
	    int n = input.nextInt();
	    Printf(n);
	}

}
