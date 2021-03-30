package com.publid;

class Apple
{
   private String color;
   private double  weight;
 //无参数的构造器
   public  Apple()
   {
	   
   }
   //初始化全部成员变量的构造器
   public Apple(String color, double weight)
   {
	super();
	this.color  = color;
	this.weight = weight;
   }
   //color的setter和getter方法。
   public  void  setColor(String color)
   {
	   this.color = color;
   }
   public  String  getColor()
   {
	  return this.color ;
   }
   public  void  setWEight(double weight)
   {
	   this.weight = weight;
   }
   public  double  getweight()
   {
	  return this.weight;
   }
   @Override
   public String toString()
   {
	return  "Apple [color = "+color+",  weight = "+weight
			/*列出所有的成员变量*/
			+"]";
	   
   }
   
   
   
}

public class AppleTest
{
	public static  void  main(String[]args)
	{
		Apple ap1 = new  Apple("红色",2.3);
	//	程序打印对象，或把对象自动转字符串时，实际上用的是该对象的toString（）方法的返回值。
	//以下代码完全一样
		System.out.println(ap1);
		System.out.println(ap1.toString());
	
		Apple ap2 = new  Apple("绿色",2.9);
		System.out.println(ap2);
		System.out.println(ap2.toString());
		
		
		//任何对象+"",就会变成字符串
		String str = ap2 + "";
		System.out.println(str);
	}

}
