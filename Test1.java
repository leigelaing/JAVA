package com.hp.demo;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		/* 循环 ： 重复的执行一段逻辑
		 * while循环     不定长循环       先判断后执行
		 * 语法:
		 * while(条件表达式){
		 * 			重复执行的代码
		 * }
		 */
		Scanner input = new Scanner(System.in);
		int i = 101;
		while(i<=100){
			
			System.out.println("天王盖地虎");
			i= input.nextInt();
		}
		
		
		/* do-while循环  不定长循环    先执行后判断
		 * 语法:
		 * do{
		 * 			重复执行的代码
		 * }while(条件表达式)；
		 */
		String name = null; 
		do{
			System.out.println("天王盖地虎");
			name = input.next();
			
		}while(name.equals("西安"));
			
		// 写银行登录的逻辑
		
	}
}
