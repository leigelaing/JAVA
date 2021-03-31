package com.hp.demo;

import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args) {
		// 双分支
		/* 语法：
		 * if(条件表达式){
		 * 		代码块1.....
		 * }else{
		 * 		代码块2.....
		 * }
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score = input.nextInt();
		
		
		if(score>=60){
			
			System.out.println("放鞭炮庆祝");
		}else{
			System.out.println("面壁思过.....");
		}
		
		System.out.println("继续上学");
	
		
		// 工作日或休息日，工作日是否下雨，下雨写代码， 晴天出去跑业务，休息日如果32°以上游泳看美女，32°一下爬山
		
		
	}
}
