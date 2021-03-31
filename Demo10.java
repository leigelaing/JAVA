package com.hp.demo;

import java.util.Scanner;

public class Demo10 {
	public static void main(String[] args) {
		// 输入一个数字，判断是否是奇数
		Scanner input = new Scanner(System.in);
		System.out.println("请输入数字");
		
		int num = input.nextInt();
	
		// 三目运算符
		//boolean bl = num%2==0?true:false;
		//String str = num%2==0?"是偶数":"是奇数";
		System.out.println(num%2==0?"是偶数":"是奇数");
		
		
		
	}
}
