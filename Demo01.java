package com.bdqn;
/**
 * �����
 * 1.���������
 * + - *(��) /(��) %(ȡ��)   
 * ++��������Ļ����ϼ�1
 * 1)a++;�ں��ȸ�ֵ�����(��1)
 * 2)++a;��ǰ���ȼ����ֵ\
 * 
 * 2.�Ƚ������
 * > < >= <= != ==
 * ע�⣺�Ƚ�������Ľ����booleanֵ
 * 
 * 3.�߼������
 * &&��&����
 * ��(&&) ��(||) ��(!)
 * ע�⣺�����booleanֵ
 * 
 * 4.��ֵ�����
 * = += -= *= /= %=
 * 
 * 5.��Ŀ�����(��Ԫ�����)
 */
public class Demo01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(10%3);
		System.out.println("=======================");
		int n = 5;
		// ++�ں��ȸ�ֵ����++
		/*int m = n++;
		System.out.println(n);
		System.out.println(m);*/
		int m = ++n;
		System.out.println(n);
		System.out.println(m);
		
		int i = 5;
		//        5
		int j = (i++)+(++i);
		System.out.println(i);
		System.out.println(j);
		System.out.println("************************");
		System.out.println(10>20);
		System.out.println(10<20);
		System.out.println(10>=10);
		System.out.println(10==10);
		System.out.println(10!=10);
		System.out.println("========================");
		System.out.println(10>20&&20<30);
		System.out.println(10>20||20<30);
		System.out.println(!(10>20));
		
		// q+=3;�ȼ���q=q+3
		int q = 10;
		q %= 3;
		System.out.println(q);
		
		String name = "����";
		int c = 180;
		int d = 190;
		String result = c<d?"����":"����";
		System.out.println(result);
		
	}

}
