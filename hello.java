/**
  程序名称：第一个java程序
         版本：V-1.0
语言：java
作者：雷葛亮

程序运行分为两步：
1.编译  javac 类名称.java
生成.class文件
2.运行 java   类名称
注意：  hello  (类名)
*/
public     class  hello
 //main 方法：程序的统一入口
{
     public  static  void  main  (String  args[])
{
     System.out.println("北大青鸟");
}
}




package com.bdqn;

public class laoshi {
	public  static void main(String[] args){
		System.out.print("hello" + "\n");  //输出语句 加ln换行
		//不加ln，不换行
		System.out.print("world\n");
		System.out.print("你好\n");
		System.out.println("/");
		//输出  /
		System.out.println("\\");
		//输出\   \代表转义字符， 不能直接输出
		System.out.println("\\" +"\\");
		//输出\\   
		System.out.println("//");
		//输出//
		System.out.println("*");
		System.out.println("你好，欢迎\t大家");
		//  \t代表一个tab，四个空格的距离
		System.out.println("\\\\");
		//输出两个\\
		System.out.print("|");
		System.out.println("\\");
		System.out.print("|");
		System.out.println(" \\");
		System.out.print("|");
		System.out.print("  \\ \n");
		System.out.print("|");
		System.out.print("   \\ \n");
		System.out.print("-----");
		//三角形
		System.out.println("______");
		System.out.println("    |      |");
		System.out.println("    |      |");
		System.out.println("    |      |");
		System.out.println("    |      |");
		System.out.print("    --------");
		
	}
}
