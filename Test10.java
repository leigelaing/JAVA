package com.hp.demo;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		/*int count = 0;
		
		for (int i = 1; i <= 100; i++) {
			count=count+i;
			// 1+2+3+4.....+100=5050
			System.out.print(i);
			if(i<100){
				
				System.out.print("+");
			}
			
		}
		System.out.print("="+count);*/
		
		Scanner input = new Scanner(System.in);
		
		int max = 0;
		int min = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("请输入数字：");
			
			int num = input.nextInt();
			
			if(i==0){
				max = num ;
				min = num ;
				
			}else{
				if(max<num){
					max = num;
					
				}else if(min>num){
					min = num;
					
				}
				
			}
			
			
			
			
		}
		System.out.println("最大数:"+max);
		System.out.println("最小数："+min);
		
		
		
		
		
	}

}
