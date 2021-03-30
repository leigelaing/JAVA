package com.publid;

public class 面试题1 {
	
	
	
	
	
	
	
	
	
	/*
	//非静态的内部类，被静态的初始化块调用
	class A
	{
	}
	static {
		A a = new A();
	}
	*/
	
	
	
	
	
	
	/*
	//非静态的方法被静态的初始化块调用，出现错误
	public  void   info()
	{
		System.out.print("info方法");
	} 
	static {
		info();
	}
	*/
	
	
	
	
	
	
	/*
	//非静态被静态成员访问
	int age;
	//静态初始化块
	static
	{
		age = 20;
	}
	*/
	
	
	
	
	
	
	/*
	class A
	{
		
	}
	static A a = new A(); //A 为静态成员，a 为非静态成员
	
	
	*/
	
	
	
	/*
	//非静态test()方法，被静态成员变量使用     错误 
	public  int  test()
	{
		return 30;
	}
	static int age = test();
	
	*/
	
	
	
	
	/*
	//非静态成员变量被静态成员变量使用了
	int b = 20;
	static  int age = b;
	*/
	
	
	
	
	
	
	/*
	 * 非静态内部类不能被静态调用
	class A
	{
		
	}
	public static  void  main(String[]args)
	{
	//静态方法中，使用了非静态内部类
		A a = new A();
	}	
	*/
	
	
	
	
	
	/*
	//非静态的方法被静态方法调用了，这种是错的
	public  void  info()
	{
		System.out.printin("info 方法");
	}
	public static  void  main(String[]args)
	{
		info();
	}	
	*/
	
	
	
	
	
	/*
	int age = 20;//非Static成员，不能被static成员调用。
	
	public static  void  main(String[]args)
	{
		System.out.printin(age);
	}	
*/
} 
