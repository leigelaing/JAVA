package com.bdqn;
  class A
{
    public final void  info()
    {
    	System.out.print("info����");
    }
    public final void  info(String s)
    {
    	System.out.print("info��������");
    }
} 
public class Final����   extends A 
{
	   //�����final�����಻����д������
		@Override
		 public void  info()
	    {
	    	System.out.print("������дinfo����");
	    }
		public void  test()
		{
			info();
		}
}

