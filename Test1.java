package com.hp.demo;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		/* ѭ�� �� �ظ���ִ��һ���߼�
		 * whileѭ��     ������ѭ��       ���жϺ�ִ��
		 * �﷨:
		 * while(�������ʽ){
		 * 			�ظ�ִ�еĴ���
		 * }
		 */
		Scanner input = new Scanner(System.in);
		int i = 101;
		while(i<=100){
			
			System.out.println("�����ǵػ�");
			i= input.nextInt();
		}
		
		
		/* do-whileѭ��  ������ѭ��    ��ִ�к��ж�
		 * �﷨:
		 * do{
		 * 			�ظ�ִ�еĴ���
		 * }while(�������ʽ)��
		 */
		String name = null; 
		do{
			System.out.println("�����ǵػ�");
			name = input.next();
			
		}while(name.equals("����"));
			
		// д���е�¼���߼�
		
	}
}
