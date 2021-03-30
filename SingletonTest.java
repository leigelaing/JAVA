package com.publid;

public class SingletonTest {
	public  static  void  main()
	{
		//构造器已经被隐藏，不能使用new来创建对象
		//Singleton s1 = new Singleton();
		
		//只能通过类方法创建实例
		Singleton s1 = Singleton.instance();
		Singleton s2 = Singleton.instance();
	    System.out.println(s1 == s2);
	}

}
