package com.bdqn;

public class Test1 {
	public  static  void  main(String[]args)
	{
		//接口访问类变量
		System.out.print(Ebtable.MAX_PRESER);
	    //接口调用类方法
		Ebtable.test5();
		
		//接口不能创建对象
		Ebtable  e1 = new  Ebtable();
	}
	
	
	
	
	
	/*
	{
		MyThread mt = new MyThread();//实例化线程对象
		mt.start();//启动线程
	}
*/
}
