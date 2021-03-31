package com.hp.demo;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		// 获取输入对象
		Scanner input = new Scanner(System.in);
		// 给用户提示
		System.out.println("请输入成绩：");

		// 获取用户的输入
		int score = input.nextInt();

		switch (score) {
			case 90:
					System.out.println("A");
				break;
			
			case 80:
					System.out.println("B");
				break;
			case 70:
					System.out.println("C");	
				break;
			case 60:
					System.out.println("D");
				break;
	
			default:
					System.out.println("E");
				
				break;
		}
		
		// 1. 输入4位会员卡号，计算各个数位的值相加的和
		// 2. 输入今天是星期几，输入今天的食谱
		// 3. 输入消费金额，会员卡号, 按照会员等级进行打折收费
		
		

	}
}
