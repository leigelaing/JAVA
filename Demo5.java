package com.hp.demo;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		// 获取键盘输入对象
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入字符串");
		// 获取字符串的输入
		String name = input.next();
		System.out.println(name);
		System.out.println("请输入年龄");
		// 获取整数的int的输入
		int age = input.nextInt();
		System.out.println(age);
		
		if(name.equals("金莲")){
			System.out.println("快进来！！！");
			
		}
		
		
		System.out.println("来根烟");
		
		
		
	}
}
