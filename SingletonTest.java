package com.publid;

public class SingletonTest {
	public  static  void  main()
	{
		//�������Ѿ������أ�����ʹ��new����������
		//Singleton s1 = new Singleton();
		
		//ֻ��ͨ���෽������ʵ��
		Singleton s1 = Singleton.instance();
		Singleton s2 = Singleton.instance();
	    System.out.println(s1 == s2);
	}

}
