package com.work;

import java.util.Scanner;

public class compare {
	//����5���䣬������ֵ����Сֵ
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int max = 0;
		int min = 0 ;
		for(int i=1;i<=5;i++){
			System.out.println("�������"+i+"�����֣�");
			int a = input.nextInt();
			
			if(a>max){
				max = a;
			}
			if(a<min){
				min = a;
			}
		}
		System.out.println("���ֵΪ��"+max);
		System.out.println("��СֵΪ��"+min);
		
	}

}