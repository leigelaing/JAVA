package com.legelaing;

public class test2 {
	//
     public void  test (int a,String...names )  //形参个数可变的方法
     //String...  names 等价于  String[]  names
     {
    	 System.out.println("a参数为 "+ a);
    	 System.out.println("names数组长度为：  "+ names.length);
    	 for(int i = 0;i < names.length;i++)
    	 {
    		 System.out.print(names[i]);
    	 }
     }
	
	public static  void  main(String...args)
	//main方法的第二种写法：
	//public static  void  main(String... args)
	{
		test2 va = new test2();
		va.test(34, "fkit","java",".org");
		//用数组静态创建一个数组传参
		va.test(-2, new String[]{"王八蛋","傻逼","狗日的"});
	}

}
