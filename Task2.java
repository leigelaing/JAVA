package com.hp.demo;

import java.util.Random;

public class Task2 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(ran.nextInt(10));
		}
		
	}
}
