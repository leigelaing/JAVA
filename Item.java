package com.legelaing;

public class Item
{
	public  void info()
	{
		System.out.println("这是一个商品！");
	}

	public  void test()
	{
		//如果方法是无static的方法，添加this作为默认的调用者
		this.info();//等价于info（）；
		//下面两行代码完全一样
		//调用同一类的static方法，默认添加类作为调用者
		System.out.println(add(22,44));
		System.out.println(Item.add(22,44));
	}
	//有static方法，
	public static int  add(int a,int b)
	{
		return a+b;
		
	}
}
