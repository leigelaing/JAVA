package com.bdqn;


//ͨ���̳�Thread���������߳�
public class MyThread  extends  Thread
{
  private int  count = 0;
  //��дrun����
  public void run()
  {
	  while(count < 100)
	  {
		  count++;
		  System.out.println("Count��ֵ�ǣ�"+count);
	  }
  } 
}
