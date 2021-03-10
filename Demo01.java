package com.bdqn;
/**
 * 函数(方法)：反复调用
 * 
 * 语法结构：
 * 访问修饰符 返回值类型 方法名称(参数列表){
 * 		代码块;
 * }
 * 
 * 说明：
 * 1.访问修饰符：public private protected default
 * 2.返回值类型：
 * void：没有返回值
 * 有返回值的时候，具体的返回值数据类型 int String
 * 3.方法名称：自己起的
 * 4.参数列表：可以有，也可以没有
 * 
 * 
 */
public class Demo01 {
	public static void main(String[] args) {
		// 调用方法
		show();
		System.out.println(a());
		System.out.println(add(2, 3));
	}
	
	// 定义一个方法：输出1000遍好好学习，天天向上
	public static void show(){
		for(int i = 1;i<=1000;i++){
			System.out.println(i + "好好学习，超越雷葛亮！");
		}
	}
	
	// 有返回值的方法
	public static String a(){
		return "你好";
	}
	
	// 有参数的方法
	public static int add(int a,int b){
		return a+b;
	}
	
	
	
	
	
	
	

}
