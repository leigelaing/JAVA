package com.hp.demo;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		// �������С��
		Scanner input = new Scanner(System.in);
		
		int max = 0;
		int min = 0;
		
		for(int i=0 ; i<5 ; i++){
			System.out.println("�������"+(i+1)+"����:");
			int num = input.nextInt();
			if(i==0){
				min = num;
				max = num;
			}else{
				 if(num>max){
					 
					 max = num;
				 }else if(num<min){
					 min = num;
					 
				 }
			}
			
			
			
			
		}
		
		System.out.println("�����Ϊ��"+max+"��С��Ϊ��"+min);
	}
}
