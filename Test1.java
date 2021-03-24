package com.hp.demo;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("亲！请输入您的年龄");
		
		int age = input.nextInt();
		/* if(条件表达式) { 代码块...... }
		 * 条件表达式结果为true 执行代码块
		 * 条件表达式结果为false 不执行代码块
		 */
		if(age<=35){
			System.out.println("请报名");
		}
		if(age>70){
			System.out.println("欧巴！你还是再考虑一下吧！");
		}
		
		System.out.println("End!");
		
		
		
		
		
	}
}
