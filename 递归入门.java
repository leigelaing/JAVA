package com.legelaing;
//���������У�
//f��1�� = 2��
//f��2�� = 5��
//f��n�� = f��n+2��- 2*f��n+1���� ����f��10���Ƕ��٣�
// ��N = n+2
//f(N-2) = f(N)- 2*f(N-1)
//�滻��f(N)= 2*f(N-1)+f(N-2)
public class �ݹ����� 
 {
	 public static int f(int n)
	 {
		 if(n == 1)
		 {
			 return 2;
		 }
		 else if(n == 2)
		 {
			 return 5;
		 }
		 else 
		 {
			 //�ݹ�
			// return f(n + 2) - 2 * f( n + 1);
		     return 2*f(n-1)+f(n-2)
		 }
	 }
	 
	 
	 public static void main(String[]args)
	 {
		 System.out.print(f(10));
	 }
 }














/*
public class �ݹ����� {
	public  int i = 0;
	public void test()
	{
		i++;
		System.out.print("test����");
		if(i<10)
		{
			test();
		}
	}
public static void main(String[]args)
{
     �ݹ�����  dg = new  �ݹ�����();
     dg.test();
}
	
	
	
}
*/