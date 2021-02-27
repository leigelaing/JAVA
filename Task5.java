package com.hp.demo;

import java.util.Arrays;

public class Task5 {
	public static void main(String[] args) {
		int[] a = {23,35,99,88};
		int[] b = {239,356,99,88};
		
		/*String str = Arrays.toString(a);

		System.out.println(str);
		*/
		
		
		
		int[] c = Arrays.copyOf(a, a.length);
		System.out.println(Arrays.toString(c));
		
		
		
		
		
	}
}
