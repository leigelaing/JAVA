package com.hp.demo;

public class ArrayDemo {
	public static void main(String[] args) {
		/* 数组是对一组相同的数据的管理，其中的每一个数据称为一个数组元素
		 * 语法：
		 * 数组的声明
		 * 数据类型[]  数组名；
		 * 
		 * 数组创建
		 * 数组名 = new 数据类型[数组长度];
		 * 
		 * 
		 */
		// 声明数组
		String[]  names;
		// 数组的创建
		names = new String[4];
		
		// 连声明带创建
		int[] ages = new int[5]; 
		
		
		// 数组的访问
		// 赋值
		names[0] = "环环";
		names[1] = "金莲";
		names[2] = "马蓉";
		
		// 获取数组中的数据
		String name = names[0];
		System.out.println(name);
		System.out.println(names[1]);
		System.out.println(names[3]);
		
		
		// 数组的修改
		names[0]="昭君";
		System.out.println(names[0]);
		
		
		// 数组元素的删除
		names[0]=null;
		System.out.println(names[0]);
		
		
		
		
		
		
		
		
		
	}
}
