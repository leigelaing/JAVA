package com.bdqn;

public class AnimalTest {
	public static  void main(String[]args)
	{
		Animal.info();//�����෽��
		//Animal an =  new  Animal;//�����಻�ܴ�������
	
		//����ת��
		Animal  an1 = new   Bird();
		Animal  an2 = new Camer1();
		//��ͬ���͵ı�������ͬһ�����󣬳��ֳ���ͬ��״̬
		//����ж�̬
		//an1��an2��������ΪAnimal
		an1.move();
		an2.move();
		
	}
}
