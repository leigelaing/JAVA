package com.publid;

public class Singleton {
  
	private static  Singleton  s;
	//����������
	private Singleton()
   {
   }
	
	//��¶һ��static ���������ڴ���ʵ��
	public  static Singleton instance()
	{
		if(s == null)//δ����ʵ��
		{
			s = new Singleton();
		}
		return s; // �Ѿ��������ؼ���
	}
}
