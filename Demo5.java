package com.hp.demo;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		// ��ȡ�����������
		Scanner input = new Scanner(System.in);
		
		System.out.println("�������ַ���");
		// ��ȡ�ַ���������
		String name = input.next();
		System.out.println(name);
		System.out.println("����������");
		// ��ȡ������int������
		int age = input.nextInt();
		System.out.println(age);
		
		if(name.equals("����")){
			System.out.println("�����������");
			
		}
		
		
		System.out.println("������");
		
		
		
	}
}
