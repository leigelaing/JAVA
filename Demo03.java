package com.bdqn1;

import java.util.Arrays;

public class Demo03 {
	public static void main(String[] args) {
		int [] a = {1,2,3,4};
		// ��400��䵽����a��
		Arrays.fill(a, 400);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
