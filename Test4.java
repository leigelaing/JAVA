package com.hp.demo;

import java.util.Scanner;

public class Test4 {
	 public static void main(String[] args) {
		/* 定长循环
		 * for循环
		 * 语法：
		 * for(初始值 ; 循环条件   ; 迭代语句 ){
		 * 		代码体
		 * }
		 * 迭代：重复反馈过程的活动，其目的通常是为了逼近结果或所需目标，每一次对过程的重复
		 * 		都称为一次迭代；每一次迭代的结果都会作为下一次的初始值
		 * 
		 * 首先执行表达式1，进行变量的初始化操作; 然后执行表达式2，对循环条件进行判断，结果位true，执行代码体中的代码，
		 * 循环体代码执行完成后，执行表达式3，改变变量i的值，再次执行表达式2，为真，重复执行， 为假，跳出循环
		 * 
		 * 属于先判断后执行的循环
		 */
		 
/*		 for(int i=0 ; i<100 ; i++){
			 
			 System.out.println("天王盖地虎！"+(i+1));
			 
		 }*/
		 
		 // 输出100以内的数字
/*		 for(int i=0 ; i<=100 ; i++){
			 
			 System.out.println(i);
			 
			 
		 }*/
		 
		 
		 
		 // 倒叙输出100以内的数字
		 for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
		 
		 
		 // 输入5个成绩，计算平均分
		 Scanner input = new Scanner(System.in);
		 int count = 0;
		 for (int i = 0; i <6; i++) {
			
			 System.out.println("请输入成绩");
			 int score = input.nextInt();
			 if(score<1||score>100){
				 System.out.println("哥们！你搞错了！请重新输入");
				 i--;
				 // 结束本次循环，进入下一次循环
				 continue;
				 
			 }
				 count = count+score;
			 
			
			 
			 
		}
		 System.out.println(count/5);
		 
		 
		 
		 
	}
}
