package com.hp.demo;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		do {
			System.out.println("请输入用户名:");
			 name = input.next();
			
		} while (!(name.equals("admin")));
		
		
		
		
	}
}
