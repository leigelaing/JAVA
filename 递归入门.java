package com.legelaing;
//假如我们有：
//f（1） = 2；
//f（2） = 5；
//f（n） = f（n+2）- 2*f（n+1）； 计算f（10）是多少？
// 令N = n+2
//f(N-2) = f(N)- 2*f(N-1)
//替换：f(N)= 2*f(N-1)+f(N-2)
public class 递归入门 
 {
	 public static int f(int n)
	 {
		 if(n == 1)
		 {
			 return 2;
		 }
		 else if(n == 2)
		 {
			 return 5;
		 }
		 else 
		 {
			 //递归
			// return f(n + 2) - 2 * f( n + 1);
		     return 2*f(n-1)+f(n-2)
		 }
	 }
	 
	 
	 public static void main(String[]args)
	 {
		 System.out.print(f(10));
	 }
 }














/*
public class 递归入门 {
	public  int i = 0;
	public void test()
	{
		i++;
		System.out.print("test方法");
		if(i<10)
		{
			test();
		}
	}
public static void main(String[]args)
{
     递归入门  dg = new  递归入门();
     dg.test();
}
	
	
	
}
*/