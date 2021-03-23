package com.leigeliang;

public class Teacher {
	
	public  static  void main(String[]args){
		double d1 = 4.0/-0.0;
		System.out.println(d1);//结果为负无穷大
	
		double d2 = 4.0/0.0;
		System.out.println(d2);//结果为正无穷大
		
		double d3 = 4e30/0.0;
		System.out.println(d3);//d3与d1 相等，所有正无穷大都相等。
	
		double d4 = 0.0/0;
		System.out.println(d4);//结果为非数
		
		//字符型
		char c1 = 'a';
		char c2 = '我';
		
		
	}
	
	
	
	
	/*
	
	
	
	//文档注释的格式是固定的
	/**
	 * 
	 * @param a   //参数说明
	 * @param b
	 * @return   放回的为a和b的和
	 
	
	public int add(int a,int b)
	{
		return a + b;
		
	}
*/
}
