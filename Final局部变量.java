package com.publid;

public class Final局部变量 {
	public static  void main(String[]args)
	{
	   final int  age;
	   age = 3;
	   System.out.println(age);
		//age = 20;//没有final，这行代码是正确的，有final这行代码是错误的
	}

}
