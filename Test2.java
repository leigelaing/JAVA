package com.hp.demo;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		// 写银行登录的逻辑
		Scanner input = new Scanner(System.in);
		String name = "";
		int password = 0;
		
		// 创建初始变量用于计数
		int count = 0 ;
		do{
			if(count==3){
				System.out.println("对不起！输入3次，您已经被锁卡！");
				break;
			}
			// 给用户提示
			System.out.println("请输入用户名:");
			// 获取用户输入的用户名
			name = input.next();
			
			// 给用户提示
			System.out.println("请输入密码:");
			// 获取用户输入的用户名
			password = input.nextInt();
			if(password==234){
				
				continue;
			}
			
			count++;
		}while(!(name.equals("admin"))&&password!=123);
		
	}
}
