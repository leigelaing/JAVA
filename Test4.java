package com.hp.demo;

import java.util.Scanner;

public class Test4 {
	 public static void main(String[] args) {
		/* ����ѭ��
		 * forѭ��
		 * �﷨��
		 * for(��ʼֵ ; ѭ������   ; ������� ){
		 * 		������
		 * }
		 * �������ظ��������̵Ļ����Ŀ��ͨ����Ϊ�˱ƽ����������Ŀ�꣬ÿһ�ζԹ��̵��ظ�
		 * 		����Ϊһ�ε�����ÿһ�ε����Ľ��������Ϊ��һ�εĳ�ʼֵ
		 * 
		 * ����ִ�б��ʽ1�����б����ĳ�ʼ������; Ȼ��ִ�б��ʽ2����ѭ�����������жϣ����λtrue��ִ�д������еĴ��룬
		 * ѭ�������ִ����ɺ�ִ�б��ʽ3���ı����i��ֵ���ٴ�ִ�б��ʽ2��Ϊ�棬�ظ�ִ�У� Ϊ�٣�����ѭ��
		 * 
		 * �������жϺ�ִ�е�ѭ��
		 */
		 
/*		 for(int i=0 ; i<100 ; i++){
			 
			 System.out.println("�����ǵػ���"+(i+1));
			 
		 }*/
		 
		 // ���100���ڵ�����
/*		 for(int i=0 ; i<=100 ; i++){
			 
			 System.out.println(i);
			 
			 
		 }*/
		 
		 
		 
		 // �������100���ڵ�����
		 for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
		 
		 
		 // ����5���ɼ�������ƽ����
		 Scanner input = new Scanner(System.in);
		 int count = 0;
		 for (int i = 0; i <6; i++) {
			
			 System.out.println("������ɼ�");
			 int score = input.nextInt();
			 if(score<1||score>100){
				 System.out.println("���ǣ������ˣ�����������");
				 i--;
				 // ��������ѭ����������һ��ѭ��
				 continue;
				 
			 }
				 count = count+score;
			 
			
			 
			 
		}
		 System.out.println(count/5);
		 
		 
		 
		 
	}
}
