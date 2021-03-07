package com.bdqn1;

import java.util.Arrays;

/**
 * 查找
 */
public class Demo04 {
	public static void main(String[] args) {
		int [] a = {1,2,3,4};
		// 查找数组a中是否含有4,如果存在，则返回相对应的下标
		// 如果没有，则返回负数
		System.out.println(Arrays.binarySearch(a, 10));
		
	}

}
