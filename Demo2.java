package com.hp.demo;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		String[] webs = {"����","�Ѻ�","����",null};
		// ��ȡ����ĳ���
		System.out.println(webs.length);
		Scanner input = new Scanner(System.in);
		
		
		/*// ���
		System.out.println("�ף���������Ҫ��ӵ���վ");
		// ��ȡ�û�������
		String addWeb = input.next();
		boolean flag = false;
		for (int i = 0; i <webs.length; i++) {
			
			// �ж������д���null��λ�ã�������Ӳ���
			if(webs[i]==null){
				webs[i] = addWeb;
				System.out.println("��ϲX�ܣ�������죡");
				flag=true;
				break;
			}
			
		}
		
		if(flag==true){
			System.out.println("û��λ���ˣ��������쵼�ɣ���");
		}*/

		
		// ɾ��
		System.out.println("�ף���������Ҫ���˵���վ");
		// ��ȡ�û�Ҫȡ����������վ
		String delWeb = input.next();
		// �����������ڼ�¼�ҵ������ݵ��±꣬���ڽ��и���һ���Ĳ���
		int index = -1;
		for (int i = 0; i < webs.length; i++) {
			// �ж��Ƿ����Ҫɾ������վ
			if(webs[i].equals(delWeb)){
				// �ҵ�Ҫɾ������վ����ɾ��
				webs[i]=null;
				// ��¼��ɾ�������ݵ��±꣨λ�ã�
				index=i;
				break;
			}
			
			
		}
		
		if(index!=-1){
			System.out.println("ɾ���ɹ���");
			
		}else{
			System.out.println("������˼�����Ǵ��˰ɣ�����");
			
			
		}
		
		
		
		
		
		
		
		
	}
}
