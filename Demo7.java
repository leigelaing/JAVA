package com.hp.demo;

import java.util.Scanner;

public class Demo7 {
	public static void main(String[] args) {
		// ��ȡ�������
		Scanner input = new Scanner(System.in);
		// ���û���ʾ
		System.out.println("���������ڣ�");
		
		// ��ȡ�û�������
		String weekDay = input.next();
		// �ж��Ƿ�ʱ������
		if(!(weekDay.equals("������")||weekDay.equals("������"))){
			// �ж��Ƿ�����
			System.out.println("������������0�����꡿/1�����졿��");
			// ��ȡ�û�������
			int weather = input.nextInt();
			if(weather==1){
				System.out.println("��ҵ��");
				
			}else{
				System.out.println("д����");
				
			}
			
		}else{
			// �ж��¶�
			// �ж��Ƿ�����
			System.out.println("������ضȣ�40�����ڣ�");
			// ��ȡ�û�������
			int t = input.nextInt();
			if(t<32){
				System.out.println("��ɽ");
			}else{
				System.out.println("��Ӿ");
			}
		}
		
		
		
	}
}
