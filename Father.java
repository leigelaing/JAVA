package oop;

import demo1.Son;

public class Father {
	
	static{
		System.out.print("父类静态代码块");
	}
	{
		System.out.print("父类构造代码块");
	}
	public Father(){
		System.out.print("父类构造方法");
	}
	
	
	
	
	
	
	
	/*
	String name;
	//方法
	protected void walk(){   //
		System.out.print("爸爸去公园");
	}
	public  static  void  main(String[]args){
		Father f = new Father();
	    f.walk();
	    Son s = new Son();
	    s.walk();
	}
	*/
}
