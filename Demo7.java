package com.hp.demo;

import java.util.Scanner;

public class Demo7 {
	public static void main(String[] args) {
		// 获取输入对象
		Scanner input = new Scanner(System.in);
		// 给用户提示
		System.out.println("请输入日期：");
		
		// 获取用户的输入
		String weekDay = input.next();
		// 判断是否时工作日
		if(!(weekDay.equals("星期六")||weekDay.equals("星期日"))){
			// 判断是否下雨
			System.out.println("请输入天气（0【下雨】/1【晴天】）");
			// 获取用户的输入
			int weather = input.nextInt();
			if(weather==1){
				System.out.println("跑业务");
				
			}else{
				System.out.println("写代码");
				
			}
			
		}else{
			// 判断温度
			// 判断是否下雨
			System.out.println("请输入溫度（40°以内）");
			// 获取用户的输入
			int t = input.nextInt();
			if(t<32){
				System.out.println("爬山");
			}else{
				System.out.println("游泳");
			}
		}
		
		
		
	}
}
