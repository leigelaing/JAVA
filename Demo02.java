package com.bdqn;
/**
 * 求1000以内所有的完数
 * 
 * 如果一个数字等于其所有因子之和，我们就称这个数为完数
 * 
 * 6的因子：1 2 3     6=1+2+3
 */
public class Demo02 {
	public static void main(String[] args) {
		// 调用方法
		for(int i = 100;i<=1000;i++){
			if(i == sum(i)){
				System.out.println(i + "是完数");
			}
		}
	}
	// 定义一个计算因子和的方法
	// num:传入的数字
	public static int sum(int num){		// num=6
		// 定义一个累加器
		int result = 0;
		for(int i = 1;i<=num/2;i++){	// num/2=3     
			if(num%i == 0){
				// result = result + i;
				result+=i;				// result=0+1=1  1+2=3 3+3=6
			}
		}
		return result;
	}
	
	
	
	
	
	
	
	

}
