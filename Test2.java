package com.hp.demo;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("亲！请输入您的年龄");

		int age = input.nextInt();
		
		if(age<=35){
			
			System.out.println("请报名......");
		
		}else{
			System.out.println("请回家哦!!!!");
			
		}
		

	}
}
