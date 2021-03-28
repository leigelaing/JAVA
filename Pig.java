package com.legelaing;

public class Pig {
	String color;
	double weight;
	public void move()
	{
		System.out.println("猪跑得快");
	}
  public void test()
  {
	  System.out.println("测试方法");
	 
	  //没有static修饰，用对象调用，      this.move();
	  //Pig p = new Pig();
	  //主调（主语调用者）
      //p.move();
      
      //谁在调用test方法，this就是代表谁
      this.move();
      System.out.println(this.color);
  
  }
}
