package com.hp.demo;

import java.util.Arrays;

public class StringDemo {
	public static void main(String[] args) {
		String str = "�Ұ���һ����";
		
		/*boolean b = str.contains("a");
		System.out.println(b);
		int indexOf = str.indexOf("��");
		System.out.println(indexOf);
		
		byte[] be = str.getBytes();
		System.out.println(Arrays.toString(be));*/
		System.out.println(str.isEmpty());
		String replace = str.replace("һ", "ʮ");
		System.out.println(replace);
		
		
		String str2 = "��ʨ/����/����/�ɽ�";
		String[] split = str2.split("/");
		System.out.println(Arrays.toString(split));
		
		String str3 = "aa.jpg";
/*		int index = str3.indexOf(".");
		String s = str3.substring(index, str3.length());
		System.out.println(s);*/
		System.out.println(str3.startsWith("aa"));
		System.out.println(str3.endsWith(".jpg"));
		
		
	}
}
