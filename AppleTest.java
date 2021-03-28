package com.legelaing;

public class AppleTest 
{
	public  static  void  main(String[]args)
	{
		//构造器只能用new调用。
		// 此时构造器正在初始化ap，因此构造器Apple构造器中this代表ap
		Apple ap = new Apple("黄色",0.34);
		System.out.print(ap.color);
		System.out.print(ap.weight);
		
	}
	

}
