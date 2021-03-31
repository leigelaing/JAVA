package com.hp.demo;

import java.util.Scanner;

public class Test3 {
	 public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.println("ÇëÊäÈëÊı×Ö");
		 
		int num = input.nextInt();
		
		int i = 0 ;
		do{
			if(i<num/2){
				if(i%2==0){
					
					System.out.println(i);
				}
				
			}
			
			
			i++;
		}while(i<num);
		
		
		 
		 
	}
}
