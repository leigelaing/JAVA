package com.hp.demo;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		// ��ȡ�������
		Scanner input = new Scanner(System.in);
		// ���û���ʾ
		System.out.println("������ɼ���");

		// ��ȡ�û�������
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
		
		// 1. ����4λ��Ա���ţ����������λ��ֵ��ӵĺ�
		// 2. ������������ڼ�����������ʳ��
		// 3. �������ѽ���Ա����, ���ջ�Ա�ȼ����д����շ�
		
		

	}
}
