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
	
	
	
	//���󷽷�:ֻ�з���ǩ����û�з����� �ķ�����
	public  abstract void move();
	
	public   static void  info()
	{
		System.out.println("����һ������");
	}
	
	
	
	
	/*
	public static  void main(String[]args)
	{
	    System.out.println("Hello");
	}
	*/
}
