package com.publid;

public class Final实例变量 {

	//final 实例变量必须显式指定初始值。而且只能在3个位置中
	final  int  age = 20;//定义的时候指定初始值
	final String s;
	final long lg;
	
	{
		//age = 24;//分散在构造器中，因为有final修饰，所以不应该被再次改变
	  s = "dajia ";
	}
   
	public Final实例变量 ()
	{
		lg = 200;
	}
	
	public Final实例变量 (String msg)
	{
		System.out.println("带String参数的构造器");
	     lg = 300;
	}
}
