package com.hp.demo;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("�ף���������������");
		
		int age = input.nextInt();
		/* if(�������ʽ) { �����...... }
		 * �������ʽ���Ϊtrue ִ�д����
		 * �������ʽ���Ϊfalse ��ִ�д����
		 */
		if(age<=35){
			System.out.println("�뱨��");
		}
		if(age>70){
			System.out.println("ŷ�ͣ��㻹���ٿ���һ�°ɣ�");
		}
		
		System.out.println("End!");
		
		
		
		
		
	}
}
