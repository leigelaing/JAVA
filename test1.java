package com.leigeliang;

import java.util.Random;

public class test1 {

	/*
	public static   void  main(String[]arge)
	{
		//a��97����int�� ���97+1��int���ͣ����Ͳ����ݡ�
		int a = 1;
		byte sum = 97 + a;
		System.out.print(sum);
	//1��97����int�ͣ��ڱ����ʱ���Ѿ��滻Ϊ98.98λ��byte��Χ֮�䡣
	//���98���Ե���byte���ʹ���
		byte sum1 = 97 + 1;
		System.out.print(sum);
		
		
		//������
		//err 
		//ԭ��1Ϊint�ͣ�a+1�Ǳ��ʽ�����ʽ��������int�͡�
		byte a = 2;
		a = a + 1;
		System.out.print(a);
		
		//ǿ��ת�����
		//a��int�ͣ�bֻ��װbyte�����Ͳ����ݱ���
		int a = 340;
		byte b = (byte)a;
		//��������ø�����Ŀ�����͵Ĵ�С*n //byte��Ŀ�����ʹ�СΪ256
		//��֤�������Ĳ�λ��ȡֵ��Χ��
		System.out.print(b);
		
	
		int a = 200;
		byte d = (byte)c;
		//��������ø�����Ŀ�����͵Ĵ�С*n
		System.out.print(d);
		
	}

}
*/
 class  �����֤��
    {
	   public  void  main(String[]args)
	   {
		   //ԭ��
		   //������ת��Ϊ�ַ�
		   int d = 100;
		   char c = (char)d;
		   System.out.print(c);
		   for(int i = 0;i < 6;i++)
		   {
			   //����Ҫ���������Сд�ַ���97-97+25
		      //��������
			   Random rnd = new Random();
		       int g = rnd.nextInt(26) + 97;
		       char h = (char)g;
		       System.out.print(h);
		   }
		   
	   }
    	
    }
}


