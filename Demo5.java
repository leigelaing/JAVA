package com.hp.demo;

public class Demo5 {
	public static void main(String[] args) {
		// �ַ����ͳ������͵�ת��
		String str = "23";
		int a = Integer.parseInt(str);
		
		str = ""+a;
		System.out.println(str);
		
		String str2 = String.valueOf(11);
		
		System.out.println(str2);
		
		String str1 = "��";
		String str3 = "��";
		String str4 = "������";
		String str5 = "��";
		String str6 = "��ɢ����";
		str1 = str1+str3+str4+str5+str6;
		System.out.println(str1);
		
		
		StringBuffer buffer = new StringBuffer("��");
		buffer.append("��");
		buffer.append("������");
		buffer.append("��");
		buffer.append("��ɢ����");
		char c = buffer.charAt(0);
		System.out.println(c);
		String sb = buffer.toString();
		System.out.println(sb);
		
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("a");
		
		
		
		
		
		
		
	}
}
