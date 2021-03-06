package com.leliang;

import java.util.Scanner;

/**
 *写一个函数，接受三个整数a, b, c，计算ax2+bx+c=0 的根
 *在计算时应当判断 a c b 4 2  是否大于0。 
 */
public class task8 {
	public  static  void  quadraticFunction(int a,int b,int c){
		if(b*b-4*a*c < 0){
			 System.out.println("无解");
		}
		else if(b*b-4*a*c == 0){
			double x = 0;
			x = (-b )/(2*a);
			System.out.println(x);
		}
		else if(b*b-4*a*c > 0){
			double x1 = 0;
			double x2 = 0;
			x1 = (-b - (Math.sqrt(b*b-4*a*c)))/(2*a);
			x2 = (-b + (Math.sqrt(b*b-4*a*c)))/(2*a);
			System.out.println(x1);
			System.out.println(x2);
		}
	}
	public  static  void  main(String[]args){
		Scanner input = new Scanner(System.in);
	    System.out.println("请输入三个整数");
	    int a = input.nextInt();
	    int b = input.nextInt();
	    int c = input.nextInt();
	    //函数实现   
	    quadraticFunction(a,b,c);
	}
}
