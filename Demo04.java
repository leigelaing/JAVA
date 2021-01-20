package com.bdqn;

import java.util.Scanner;

/**
 * if-else if-else
 * 注意：else if可以有多个
 * 语法格式：
 * if(条件1){
 * 		代码块1;
 * }else if(条件2){
 * 		代码块2;
 * }else if(条件3){
 * 		代码块3;
 * }else{
 * 		代码块;
 * }
 */
public class Demo04 {
	public static void main(String[] args) {
		/*
		 * 判断成绩
		 * 如果成绩大于等于90，小于等于100，则输出优秀
		 * 如果成绩大于等于80，小于90，则输出良好
		 * 如果成绩大于等于70，小于80，则输出一般
		 * 如果成绩大于等于60，小于70，则输出及格
		 * 否则，输出差
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你的成绩：");
		int score = input.nextInt();
		if(score>=90 && score<=100){
			System.out.println("优秀");
		}else if(score>=80){
			System.out.println("良好");
		}else if(score>=70){
			System.out.println("一般");
		}else if(score>=60){
			System.out.println("及格");
		}else{
			System.out.println("差");
		}
	}
}
