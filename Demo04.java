package com.bdqn;

import java.util.Scanner;

/**
 * if-else if-else
 * ע�⣺else if�����ж��
 * �﷨��ʽ��
 * if(����1){
 * 		�����1;
 * }else if(����2){
 * 		�����2;
 * }else if(����3){
 * 		�����3;
 * }else{
 * 		�����;
 * }
 */
public class Demo04 {
	public static void main(String[] args) {
		/*
		 * �жϳɼ�
		 * ����ɼ����ڵ���90��С�ڵ���100�����������
		 * ����ɼ����ڵ���80��С��90�����������
		 * ����ɼ����ڵ���70��С��80�������һ��
		 * ����ɼ����ڵ���60��С��70�����������
		 * ���������
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("��������ĳɼ���");
		int score = input.nextInt();
		if(score>=90 && score<=100){
			System.out.println("����");
		}else if(score>=80){
			System.out.println("����");
		}else if(score>=70){
			System.out.println("һ��");
		}else if(score>=60){
			System.out.println("����");
		}else{
			System.out.println("��");
		}
	}
}
