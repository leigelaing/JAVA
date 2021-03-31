package com.bdqn;


//通过继承Thread类来创建线程
public class MyThread  extends  Thread
{
  private int  count = 0;
  //重写run方法
  public void run()
  {
	  while(count < 100)
	  {
		  count++;
		  System.out.println("Count的值是："+count);
	  }
  } 
}
