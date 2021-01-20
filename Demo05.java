package com.bdqn;

import java.util.Scanner;

/**
 * Scanner类：控制台输入
 */
public class Demo05 {
	public static void main(String[] args) {
		// 固定的写法     input：名称
		// 获取键盘输入  (扫描器)
		Scanner input = new Scanner(System.in);
		// 提示文字
		System.out.println("请输入你的银行卡密码：");
		// 获取输入的信息
		int password = input.nextInt();
		// 输出获取到的信息
		System.out.println("你的密码是：" + password + "，对吗？");
		
		
		
		
		
	}

}
