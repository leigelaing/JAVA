package com.bdqn;
/**
 * 冒泡排序
 */
public class Test1 {
	public static void main(String[] args) {
		int [] a = {12,3,15,6,2};
		// 定义一个变量：交换数据
		 int temp;
		// 外层循环控制的是：轮数
		for(int i = 0;i<a.length-1;i++){
			// 内层循环控制的是次数
			for(int j = 0;j<a.length-1-i;j++){
				// 如果前一个数字大于后面的，则交换位置
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i] + "\t");
		}
	}

}
