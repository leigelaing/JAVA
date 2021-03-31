package com.hp.demo;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		// 单分支
		int a = 10 ; 
		int b = 20;
		
		boolean result  = a<b;
		
		// 如果result成立，输出正确，如果不成立，输出不正确
		// if(条件表达式){要执行的代码}      条件表达式要求为true
		if(result){
			System.out.println("成立");
		}
		
		System.out.println("END");
		
		Scanner input = new Scanner(System.in);
		
		int score = input.nextInt();
		boolean bl = score>=60;
		if(bl){
			
			
			System.out.println("看成绩");
		}else{
			System.out.println("嗓子哑了");
		}
		
		
		
		
		System.out.println("参加家长会");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
