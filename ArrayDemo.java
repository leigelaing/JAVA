package com.hp.demo;

public class ArrayDemo {
	public static void main(String[] args) {
		/* �����Ƕ�һ����ͬ�����ݵĹ������е�ÿһ�����ݳ�Ϊһ������Ԫ��
		 * �﷨��
		 * ���������
		 * ��������[]  ��������
		 * 
		 * ���鴴��
		 * ������ = new ��������[���鳤��];
		 * 
		 * 
		 */
		// ��������
		String[]  names;
		// ����Ĵ���
		names = new String[4];
		
		// ������������
		int[] ages = new int[5]; 
		
		
		// ����ķ���
		// ��ֵ
		names[0] = "����";
		names[1] = "����";
		names[2] = "����";
		
		// ��ȡ�����е�����
		String name = names[0];
		System.out.println(name);
		System.out.println(names[1]);
		System.out.println(names[3]);
		
		
		// ������޸�
		names[0]="�Ѿ�";
		System.out.println(names[0]);
		
		
		// ����Ԫ�ص�ɾ��
		names[0]=null;
		System.out.println(names[0]);
		
		
		
		
		
		
		
		
		
	}
}
