package com.hp.demo;

public class Test9 {
	public static void main(String[] args) {
		// 正三角
/*		for (int i = 0; i < 5; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}*/
		// 倒三角
/*		for (int i = 0; i < 5; i++) {

			for (int j = 5-i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}*/
		
		// 九九乘法表
/*		for(int i=1 ; i<=9 ; i++){
			
			for (int j = 1; j <=i; j++) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}*/
		
		
		for (int i = 1; i <=5 ; i++) {
			for (int j = 1; j <= i+4 ; j++) {
				if(j<=5-i){
					System.out.print(" ");
					
				}else{
					
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}
