package com.leliang;

import java.util.Scanner;

//2. дһ������������һ���������������������������ӡ�
public class task2 {
	public  static void  divisor (int x){
		int i = 1;
		int y = 0;
		System.out.print("����"+ x +"�����ӣ�");
		for(i = 1;i <= x;i++){
			if(x%i == 0){
				System.out.print(i+" ");
			}
		}
	}
	public  static  void  main(String[]args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
	    divisor(a);
	}

}
