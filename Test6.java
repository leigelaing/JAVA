package com.hp.demo;

public class Test6 {
	public static void main(String[] args) {
		//1~100¿€º”
		
		int total = 0;
		
		for (int i = 1; i <=100; i++) {
			System.out.print(i);
			if(i<100){
				System.out.print("+");
				
			}
			
			total = total+i;
		}
		System.out.println("="+total);
		
		
	}
}
