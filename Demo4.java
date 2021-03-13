package com.hp.demo;

public class Demo4 {
	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		System.out.println(i);
		i = 11;// 自动类型转换   装箱
		Integer v = Integer.valueOf("123");// 手动方法转换
		System.out.println(v);
		
		
		System.out.println(i);
		
		Byte b = new Byte((byte) 12);
		
		Integer i1 = new Integer("123");
		int i2 = i1.intValue(); //  手动拆箱
		int i3 = i1; // 自动拆箱
		
		System.out.println(i1);
		
		
		
		Boolean bl = new  Boolean("true");
		System.out.println(bl);
		
		
		int i4 = Integer.parseInt("123");
		
		
		
	}
}
