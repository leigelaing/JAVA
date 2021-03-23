package com.leigeliang;

import java.util.Random;

public class test1 {

	/*
	public static   void  main(String[]arge)
	{
		//a和97都是int型 因此97+1是int类型，类型不兼容。
		int a = 1;
		byte sum = 97 + a;
		System.out.print(sum);
	//1和97都是int型，在编译的时候已经替换为98.98位于byte范围之间。
	//因此98可以当做byte类型处理。
		byte sum1 = 97 + 1;
		System.out.print(sum);
		
		
		//面试题
		//err 
		//原因：1为int型，a+1是表达式，表达式的类型是int型。
		byte a = 2;
		a = a + 1;
		System.out.print(a);
		
		//强制转换溢出
		//a是int型，b只能装byte，类型不兼容报错
		int a = 340;
		byte b = (byte)a;
		//溢出规则：用该数—目标类型的大小*n //byte的目标类型大小为256
		//保证减出来的差位于取值范围内
		System.out.print(b);
		
	
		int a = 200;
		byte d = (byte)c;
		//溢出规则：用该数—目标类型的大小*n
		System.out.print(d);
		
	}

}
*/
 class  随机验证码
    {
	   public  void  main(String[]args)
	   {
		   //原理
		   //将数字转换为字符
		   int d = 100;
		   char c = (char)d;
		   System.out.print(c);
		   for(int i = 0;i < 6;i++)
		   {
			   //假如要生成随机的小写字符：97-97+25
		      //创建对象
			   Random rnd = new Random();
		       int g = rnd.nextInt(26) + 97;
		       char h = (char)g;
		       System.out.print(h);
		   }
		   
	   }
    	
    }
}


