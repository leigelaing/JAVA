package com.hp.demo;

public class Demo5 {
	public static void main(String[] args) {
		// 字符串和常见类型的转换
		String str = "23";
		int a = Integer.parseInt(str);
		
		str = ""+a;
		System.out.println(str);
		
		String str2 = String.valueOf(11);
		
		System.out.println(str2);
		
		String str1 = "我";
		String str3 = "是";
		String str4 = "卧龙岗";
		String str5 = "上";
		String str6 = "闲散的人";
		str1 = str1+str3+str4+str5+str6;
		System.out.println(str1);
		
		
		StringBuffer buffer = new StringBuffer("我");
		buffer.append("是");
		buffer.append("卧龙岗");
		buffer.append("上");
		buffer.append("闲散的人");
		char c = buffer.charAt(0);
		System.out.println(c);
		String sb = buffer.toString();
		System.out.println(sb);
		
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("a");
		
		
		
		
		
		
		
	}
}
