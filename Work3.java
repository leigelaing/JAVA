package com.hp.homeWork;

import java.util.Random;
import java.util.Scanner;

public class Work3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random ran = new Random();

		// ��������Ϊ7���������ڱ����û��ĺ���
		int[] userNum = new int[7];

		// ��������Ϊ7���������ڱ����н��ĺ���
		int[] pcNum = new int[7];

		for (int i = 0; i < userNum.length; i++) {
			System.out.println("��ѡ�����(1~32֮��)");
			// ��ȡ�û�ѡ��ĺ���
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
				System.out.println("����������ֲ��Ϸ�");
				i--;
			}

		}

		for (int i = 0; i < pcNum.length; i++) {
			// ���ѡȡ33���ڵ�����
			int num = ran.nextInt(33);

			if (num != 0) {
				pcNum[i] = num;

			} else {
				i--;

			}

		}
		int count = 0;
		// �ж��Ƿ��н�
		for (int i = 0; i < pcNum.length; i++) {

			for (int j = 0; j < userNum.length; j++) {
				if (pcNum[i] == userNum[j]) {

					count++;
				}

			}

		}

		switch (count) {
		case 7:
				System.out.println("һ�Ƚ�");
			break;
		case 6:
				System.out.println("���Ƚ�");
			break;
		case 5:
				System.out.println("���Ƚ�");
			break;
		case 4:
				System.out.println("�ĵȽ�");
			break;

		default:
				System.out.println("лл�ݹ�");
			break;
		}

	}

}
