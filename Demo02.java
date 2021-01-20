package com.bdqn;
/**
 * 流程控制语句：
 * 1.选择语句
 * if
 * if-else
 * if-else if-else(else if可以有多个)
 * switch-case
 * 
 * 2.循环
 * while
 * do-while
 * for循环
 * 
 * 1)if
 * 语法格式：
 * if(表达式){
 * 		代码块;
 * }
 * 表达式的结果是boolean值
 */
public class Demo02 {
	public static void main(String[] args) {
		/*
		 * 判断学生的成绩是否大于60，如果大于60分，
		 * 则奖励一个美女
		 * */
		
		// 1.定义一个变量：保存学生的成绩
		int score = 59;
		// 2.判断成绩是否大于60，如果大于60分(满足条件)
		if(score>60){
			System.out.println("奖励一个美女");
			// 3.否则，今夜有暴风雨
		}else{
			System.out.println("今夜有暴风雨");
		}
	}

}
