package com.hp.demo;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		// д���е�¼���߼�
		Scanner input = new Scanner(System.in);
		String name = "";
		int password = 0;
		
		// ������ʼ�������ڼ���
		int count = 0 ;
		do{
			if(count==3){
				System.out.println("�Բ�������3�Σ����Ѿ���������");
				break;
			}
			// ���û���ʾ
			System.out.println("�������û���:");
			// ��ȡ�û�������û���
			name = input.next();
			
			// ���û���ʾ
			System.out.println("����������:");
			// ��ȡ�û�������û���
			password = input.nextInt();
			if(password==234){
				
				continue;
			}
			
			count++;
		}while(!(name.equals("admin"))&&password!=123);
		
	}
}
