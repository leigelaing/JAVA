package com.legelaing;

public class Item
{
	public  void info()
	{
		System.out.println("����һ����Ʒ��");
	}

	public  void test()
	{
		//�����������static�ķ��������this��ΪĬ�ϵĵ�����
		this.info();//�ȼ���info������
		//�������д�����ȫһ��
		//����ͬһ���static������Ĭ���������Ϊ������
		System.out.println(add(22,44));
		System.out.println(Item.add(22,44));
	}
	//��static������
	public static int  add(int a,int b)
	{
		return a+b;
		
	}
}
