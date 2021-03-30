package com.publid;

public class Final宏变量
{
	public static  void main(String[]args)
	{
	//有final修饰，指定了初始值，且初始值在编译时即可确定。
    final int MAX1 = 100;
	System.out.print(MAX1);
	
	
	 int MAX2 = 100;
	System.out.print(MAX2);
	  
	//以上代码运行解果一样，但有final时，不涉及声明变量，不涉及变量的存储  不涉及到变量的取值，所以运行快
	
	}
}
