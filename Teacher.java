package com.leigeliang;

public class Teacher {
	
	public  static  void main(String[]args){
		double d1 = 4.0/-0.0;
		System.out.println(d1);//���Ϊ�������
	
		double d2 = 4.0/0.0;
		System.out.println(d2);//���Ϊ�������
		
		double d3 = 4e30/0.0;
		System.out.println(d3);//d3��d1 ��ȣ��������������ȡ�
	
		double d4 = 0.0/0;
		System.out.println(d4);//���Ϊ����
		
		//�ַ���
		char c1 = 'a';
		char c2 = '��';
		
		
	}
	
	
	
	
	/*
	
	
	
	//�ĵ�ע�͵ĸ�ʽ�ǹ̶���
	/**
	 * 
	 * @param a   //����˵��
	 * @param b
	 * @return   �Żص�Ϊa��b�ĺ�
	 
	
	public int add(int a,int b)
	{
		return a + b;
		
	}
*/
}
