package com.bdqn1;

import java.util.Arrays;

/**
 * Arrays��������
 * 1.����
 */
public class Demo01 {
	public static void main(String[] args) {
		int [] a = {13,2,15,3,7};
		// ��a�����������
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
