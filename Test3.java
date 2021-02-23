package com.hp.demo;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入是否高中毕业(0是~1否)");
		
		int result = input.nextInt();
		
		if(result==0){
			
			
			System.out.println("上大学");
		}else if(result==1){
			System.out.println("继续上学");
		}else{
			System.out.println("去工作");
			
		}
		
		
		// 根据输入的成绩判断要走的路
		// 工作日工作，休息日娱乐
		
		
		
	}
}
