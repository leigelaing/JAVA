package com.leliang;
/**
 * 1. дһ������add����������������Ϊ���������������������ĺ͡� 
 */
import java.util.Scanner;

public class task1 {
	public static int Add(int x,int y){
		int z = 0;
		z = x + y;
		return z;
		
	}

	public  static  void  main(String[]args)
	{
		Scanner input  = new Scanner(System.in);
		System.out.println("������������,�м�ո������");
		System.out.println("��һ����");
 		int a = input.nextInt();
 		System.out.println("�ڶ�����");
 		int b = input.nextInt();
		int sum = Add(a,b);
		System.out.print("sum = "+ sum);
		
	}

}