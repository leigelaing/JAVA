package com.bdqn;

import java.util.Scanner;

/**
 * 输入五门课程的成绩，求平均值？
 */
public class zuoye3 {
	public  static void  main(String[]args){
		int a;
		int b;
		int c;
		int d;
		int e;
		while(true){
			Scanner  input = new Scanner(System.in);
			System.out.print("请输入:");
			 
			while(a < 0||a > 100)
			{
				a = input.nextInt();
			}
		     b = input.nextInt();
			if(b < 0||b > 100){
				continue;
			}
			 c = input.nextInt();
			if(c < 0||c > 100){
				continue;
			}
			 d = input.nextInt();
			if(d < 0||d > 100){
				continue;
			}
			 e = input.nextInt();
			if(e < 0||e > 100){
				continue;
			}
			break;
		}
		int average = (a+b+c+d+e)/5;
		System.out.print( "average= " + average);
		
	} 
}
