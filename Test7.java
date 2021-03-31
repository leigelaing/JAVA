package com.hp.demo;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		// 最大数最小数
		Scanner input = new Scanner(System.in);
		
		int max = 0;
		int min = 0;
		
		for(int i=0 ; i<5 ; i++){
			System.out.println("请输入第"+(i+1)+"数字:");
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
		
		System.out.println("最大数为："+max+"最小数为："+min);
	}
}
