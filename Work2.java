package com.hp.homeWork;

import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] webService = {"�ٶ�","����","�Ѻ�","�Ա�",null};
		
		/*System.out.println("��������Ҫ��ӵ���վ");
		String web = input.next();
		// ���
		int index = -1;
		for (int i = 0; i < webService.length; i++) {
			if(webService[i]==null){
				webService[i]=web;
				index = i;
			}
		}
		
		if(index==-1){
			System.out.println("��ʱû�й��λ");
			
		}
		*/
		
		// ɾ��
		/*System.out.println("��������Ҫɾ������վ");
		String web = input.next();
		int index = -1;
		for (int i = 0; i < webService.length; i++) {
			if(webService[i].equals(web)){
				webService[i]=null;
				index = i;
				System.out.println("�Ѿ�ɾ��");
			}
		}
		if(index==-1){
			System.out.println("�ף�û��Ҫɾ������վ......");
		}
		*/
		
		// �޸�
		System.out.println("��������Ҫ�޸ĵ���վ");
		String web = input.next();
		int index = -1;
		for (int i = 0; i < webService.length; i++) {
			if(webService[i].equals(web)){
				webService[i]=web;
				index = i;
				System.out.println("�Ѿ��޸�");
			}
		}
		if(index==-1){
			System.out.println("�ף�û��Ҫ�޸ĵ���վ......");
		}
	}
}
