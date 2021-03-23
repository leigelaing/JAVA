package com.leigeliang;
/*
public class test2 
{
	public static   void  main(String[]arge)
	{
		float d = 2.3f;
		d++;
		System.out.println(d);
		char c = 'B';
		c--;
		System.out.println(c);
		
		int x = 30;
		int y = 18;
		       //30 - 17  + 17  / 2 +  32 - 31
		int z = x++ - --y + y++ / 2 + ++x - --x;
		System.out.println(x);//31
		System.out.println(y);//18
		System.out.println(z);//22	
	}
}
*/
public	class test2   //
	{
	//MathTest(学习)
		public static void  main(String[]args)
		{
			//计算乘方
			//3的8次方
			//返回值为浮点数
			System.out.println(Math.pow(3, 8)); 
		//	System.out.print(Math.power(3, 8)); //完整的写法但是报错
			//计算开方
			//25开方   
			//返回值为浮点数
			System.out.println(Math.sqrt(25));
			//四舍五入取整
			System.out.println(Math.round(4.5));
		    //向上取整
			System.out.println(Math.ceil(4.7));
			//向下取整
			System.out.println(Math.floor(4.7));
		double d = 3.5;
		int i = (int)(Math.round(d) - Math.floor(d) / 2
				+ Math.sin(1.75));
		    System.out.println(i);
		
		}
	}

