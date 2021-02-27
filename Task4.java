package com.hp.demo;

public class Task4 {
	public static void main(String[] args) {
		
		
		function1();
		function1();
		
		int function2 = function2();
		
		int ss = 123;
		int function3 = function3(11, ss);
		
	}
	
	public static  void function1(){
		int a = 1+1;
		
		if(a%2==0){
			return ;
			
		}
		
		System.out.println(a);
		
		
		
	}
	
	
	
	public static  int function2(){
		int a = 1+1;
		return a;
	}
	

	public static  int function3(int a , int b ){
		int c = a+b;
		
		return c;
	}
	
	
	
	
	
	
	
	
	
}
