package com.bdqn;
  class A
{
    public final void  info()
    {
    	System.out.print("info方法");
    }
    public final void  info(String s)
    {
    	System.out.print("info方法重载");
    }
} 
public class Final方法   extends A 
{
	   //父类加final后子类不能重写方法了
		@Override
		 public void  info()
	    {
	    	System.out.print("子类重写info方法");
	    }
		public void  test()
		{
			info();
		}
}

