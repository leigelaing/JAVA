package com.bdqn;
/**
 * ����(����)����������
 * 
 * �﷨�ṹ��
 * �������η� ����ֵ���� ��������(�����б�){
 * 		�����;
 * }
 * 
 * ˵����
 * 1.�������η���public private protected default
 * 2.����ֵ���ͣ�
 * void��û�з���ֵ
 * �з���ֵ��ʱ�򣬾���ķ���ֵ�������� int String
 * 3.�������ƣ��Լ����
 * 4.�����б������У�Ҳ����û��
 * 
 * 
 */
public class Demo01 {
	public static void main(String[] args) {
		// ���÷���
		show();
		System.out.println(a());
		System.out.println(add(2, 3));
	}
	
	// ����һ�����������1000��ú�ѧϰ����������
	public static void show(){
		for(int i = 1;i<=1000;i++){
			System.out.println(i + "�ú�ѧϰ����Խ�׸�����");
		}
	}
	
	// �з���ֵ�ķ���
	public static String a(){
		return "���";
	}
	
	// �в����ķ���
	public static int add(int a,int b){
		return a+b;
	}
	
	
	
	
	
	
	

}
