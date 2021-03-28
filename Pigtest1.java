package com.legelaing;

public class Pigtest1 {
	public static  void  main(String[]args)
	{
		//
		Pig p1 = new Pig();
		p1.color = "黄色";
		p1.test();
	//p1调用test方法，因此test方法中this就代表p1
	    
		Pig p2 = new Pig();
		//p2调用test方法，因此test方法中this就代表p2
		p2.color = "黑色";
		p2.test();
	}
}
