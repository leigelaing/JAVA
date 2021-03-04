package com.hp.homeWork;

import java.util.Random;
import java.util.Scanner;

public class Work1 {
	public static void main(String[] args) {
		String[] music = {"忐忑","套马杆","小苹果","荷塘月色","自由飞翔"};
		
		Random ran = new Random();
		int[] old = new int[music.length];
		for (int i = 0; i < music.length; i++) {
			// 获取要播放的歌曲的下标
			int a = ran.nextInt(music.length);
			boolean b = true;
			if(i!=0){
				for (int j = 0; j < i; j++) {
					// 如果保存的歌曲下标存在
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
