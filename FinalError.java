package com.bdqn;

 class Foo
 {
	 //private 方法已经被隐藏到该类内部，不可能被重写
	 //private 修饰的方法在同一个类中才能被访问到，本子类无法访问该方法
	 //final放在这个位置没有任何意义，
	 private final void test()
	 {
		 System.out.print("test方法");
	 }
 }

public class FinalError   extends   Foo
{
	
	public void test()
	{
		System.out.print("重写test方法");
	}

}
