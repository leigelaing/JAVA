package com.hp.demo;

public class Demo4 {
	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		System.out.println(i);
		i = 11;// �Զ�����ת��   װ��
		Integer v = Integer.valueOf("123");// �ֶ�����ת��
		System.out.println(v);
		
		
		System.out.println(i);
		
		Byte b = new Byte((byte) 12);
		
		Integer i1 = new Integer("123");
		int i2 = i1.intValue(); //  �ֶ�����
		int i3 = i1; // �Զ�����
		
		System.out.println(i1);
		
		
		
		Boolean bl = new  Boolean("true");
		System.out.println(bl);
		
		
		int i4 = Integer.parseInt("123");
		
		
		
	}
}
