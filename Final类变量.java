package com.publid;

public class Final类变量 
{
	
	//定义时指定初始值
	final static int tNum = 20;
	
	//类初始化块
	final static String st;
      
	final static long lg;
	static
      {
    	  st = "fkjava";
      }
      {
    	  //实例初始化块可以访问final类变量，但不能指定初始值
    	  System.out.println(st);
      }
      public static void   test()
      {
    	//  lg = 30;//final实例变量不能在static方法中指定初始值
    	 System.out.println(st); 
    	 
      }
}
