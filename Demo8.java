package com.hp.demo;

import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) {
		// ��ȡ�������
		Scanner input = new Scanner(System.in);
		// ���û���ʾ
		System.out.println("������ɼ���");
		
		// ��ȡ�û�������
		int score = input.nextInt();
		// ���֧
		if(score>=90&&score<=100){
			System.out.println("��������");
			
		}else if(score>=80){
			System.out.println("������");
		}else if(score>=70){
			System.out.println("̫��ɽ");
		}else if(score>=60){
			System.out.println("�Ը�����ףһ��");
		}else{
			System.out.println("��ҹ�б�����");
		}
		
		
		
	}
}
