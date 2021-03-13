package com.hp.demo;

import java.util.Arrays;

public class StringDemo {
	public static void main(String[] args) {
		String str = "我爱从一而终";
		
		/*boolean b = str.contains("a");
		System.out.println(b);
		int indexOf = str.indexOf("爱");
		System.out.println(indexOf);
		
		byte[] be = str.getBytes();
		System.out.println(Arrays.toString(be));*/
		System.out.println(str.isEmpty());
		String replace = str.replace("一", "十");
		System.out.println(replace);
		
		
		String str2 = "松狮/李逵/金莲/松江";
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
