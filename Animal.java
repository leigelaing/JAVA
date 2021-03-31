package com.bdqn;

public abstract  class Animal
{
	
	private  int age;
	public Animal()
	{
	}
	public Animal(int age)
	{
		this.age =age; 
	}
	
	
	
	//抽象方法:只有方法签名，没有方法体 的方法。
	public  abstract void move();
	
	public   static void  info()
	{
		System.out.println("我是一个动物");
	}
	
	
	
	
	/*
	public static  void main(String[]args)
	{
	    System.out.println("Hello");
	}
	*/
}
