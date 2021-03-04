package com.hp.homeWork;

import java.util.Random;
import java.util.Scanner;

public class Work3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random ran = new Random();

		// 创建长度为7的数组用于保存用户的号码
		int[] userNum = new int[7];

		// 创建长度为7的数组用于保存中奖的号码
		int[] pcNum = new int[7];

		for (int i = 0; i < userNum.length; i++) {
			System.out.println("请选择号码(1~32之间)");
			// 获取用户选择的号码
			int num = input.nextInt();
			for (int j = 0; j <= i; j++) {
				
				if(num==userNum[j]){
					i--;
					continue;
				}
			}
			
			if (num > 0 && num < 33) {
				userNum[i] = num;
			} else {
				System.out.println("您输入的数字不合法");
				i--;
			}

		}

		for (int i = 0; i < pcNum.length; i++) {
			// 随机选取33以内的数字
			int num = ran.nextInt(33);

			if (num != 0) {
				pcNum[i] = num;

			} else {
				i--;

			}

		}
		int count = 0;
		// 判断是否中奖
		for (int i = 0; i < pcNum.length; i++) {

			for (int j = 0; j < userNum.length; j++) {
				if (pcNum[i] == userNum[j]) {

					count++;
				}

			}

		}

		switch (count) {
		case 7:
				System.out.println("一等奖");
			break;
		case 6:
				System.out.println("二等奖");
			break;
		case 5:
				System.out.println("三等奖");
			break;
		case 4:
				System.out.println("四等奖");
			break;

		default:
				System.out.println("谢谢惠顾");
			break;
		}

	}

}
