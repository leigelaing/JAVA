package com.leliang;

import java.util.Scanner;

/**
 *дһ���������ж�һ�������Ƿ������� 
 */
public class task6 {
	public  static  void  PrimeNum(int x){
		int i = 2;
		int a = 0;
		for(i = 2;i < x-1;i++)
		{
		    if(x%i == 0){
		         a++;	
		    }
		}	   
		if(a == 0){
			System.out.print("��");
		}
		else{
			System.out.print("����");
		}
	}
	public  static  void  main(String[]args){
		Scanner input = new Scanner(System.in);
	    System.out.print("������һ������");
	    int n = input.nextInt();
	    PrimeNum (n);
	  
	}

}
