package com.legelaing;

public class Dog {
	
	//没有static的成员变量，要用对象调用
	//成员变量，可以不指定初始值
	//系统会为之分配默认的初始值，初始值规则与数组完全一样。
	String  name;
	int age;
	byte huhuhu;
	public void run() 
	{
		System.out.print("使劲跑");
	}

}
