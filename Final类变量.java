package com.publid;

public class Final����� 
{
	
	//����ʱָ����ʼֵ
	final static int tNum = 20;
	
	//���ʼ����
	final static String st;
      
	final static long lg;
	static
      {
    	  st = "fkjava";
      }
      {
    	  //ʵ����ʼ������Է���final�������������ָ����ʼֵ
    	  System.out.println(st);
      }
      public static void   test()
      {
    	//  lg = 30;//finalʵ������������static������ָ����ʼֵ
    	 System.out.println(st); 
    	 
      }
}
