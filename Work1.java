package com.hp.homeWork;

import java.util.Random;
import java.util.Scanner;

public class Work1 {
	public static void main(String[] args) {
		String[] music = {"����","�����","Сƻ��","������ɫ","���ɷ���"};
		
		Random ran = new Random();
		int[] old = new int[music.length];
		for (int i = 0; i < music.length; i++) {
			// ��ȡҪ���ŵĸ������±�
			int a = ran.nextInt(music.length);
			boolean b = true;
			if(i!=0){
				for (int j = 0; j < i; j++) {
					// �������ĸ����±����
					if(a==old[j]){
						b = false;
						i--;
						break;
					}
				}
			}
			if(b){
				
				System.out.println(music[a]);
			}
			
			
		}
		
		
	}
}
