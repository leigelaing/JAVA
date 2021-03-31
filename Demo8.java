package com.hp.demo;

import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) {
		// 获取输入对象
		Scanner input = new Scanner(System.in);
		// 给用户提示
		System.out.println("请输入成绩：");
		
		// 获取用户的输入
		int score = input.nextInt();
		// 多分支
		if(score>=90&&score<=100){
			System.out.println("出国旅游");
			
		}else if(score>=80){
			System.out.println("国内游");
		}else if(score>=70){
			System.out.println("太白山");
		}else if(score>=60){
			System.out.println("吃个饭庆祝一下");
		}else{
			System.out.println("今夜有暴风雨");
		}
		
		
		
	}
}
