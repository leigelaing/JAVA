package com.hp.demo;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		// ����֧
		int a = 10 ; 
		int b = 20;
		
		boolean result  = a<b;
		
		// ���result�����������ȷ��������������������ȷ
		// if(�������ʽ){Ҫִ�еĴ���}      �������ʽҪ��Ϊtrue
		if(result){
			System.out.println("����");
		}
		
		System.out.println("END");
		
		Scanner input = new Scanner(System.in);
		
		int score = input.nextInt();
		boolean bl = score>=60;
		if(bl){
			
			
			System.out.println("���ɼ�");
		}else{
			System.out.println("ɤ������");
		}
		
		
		
		
		System.out.println("�μӼҳ���");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
