package com.work;

import java.util.Scanner;

public class compare {
	//输入5个输，输出最大值和最小值
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int max = 0;
		int min = 0 ;
		for(int i=1;i<=5;i++){
			System.out.println("请输入第"+i+"个数字：");
			int a = input.nextInt();
			
			if(a>max){
				max = a;
			}
			if(a<min){
				min = a;
			}
		}
		System.out.println("最大值为："+max);
		System.out.println("最小值为："+min);
		
	}

}