package com.hp.demo;

import java.util.Scanner;

public class Demo10 {
	public static void main(String[] args) {
		// ����һ�����֣��ж��Ƿ�������
		Scanner input = new Scanner(System.in);
		System.out.println("����������");
		
		int num = input.nextInt();
	
		// ��Ŀ�����
		//boolean bl = num%2==0?true:false;
		//String str = num%2==0?"��ż��":"������";
		System.out.println(num%2==0?"��ż��":"������");
		
		
		
	}
}
