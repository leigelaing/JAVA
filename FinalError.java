package com.bdqn;

 class Foo
 {
	 //private �����Ѿ������ص������ڲ��������ܱ���д
	 //private ���εķ�����ͬһ�����в��ܱ����ʵ����������޷����ʸ÷���
	 //final�������λ��û���κ����壬
	 private final void test()
	 {
		 System.out.print("test����");
	 }
 }

public class FinalError   extends   Foo
{
	
	public void test()
	{
		System.out.print("��дtest����");
	}

}
