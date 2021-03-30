package com.publid;

public class Singleton {
  
	private static  Singleton  s;
	//构造器隐藏
	private Singleton()
   {
   }
	
	//暴露一个static 方法，用于创建实例
	public  static Singleton instance()
	{
		if(s == null)//未创建实例
		{
			s = new Singleton();
		}
		return s; // 已经创建返回即可
	}
}
