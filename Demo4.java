package com.hp.demo;

import java.util.Random;

public class Demo4 {
	public static void main(String[] args) {
		// 歌曲集
		String[] musics = {"忐忑","我的滑板鞋","套马杆","最炫民族风","小苹果"};
		
		// 创建空数组用于保存播放过的歌曲
		String[] oldMusics = new String[musics.length];
		
		// 随机对象
		Random ran = new Random();
		
		boolean flag = false;
		// 按照歌曲数量随机播放
		for (int i = 0; i < musics.length; i++) {
			// 获取要随机播放的歌曲的下标
			int index = ran.nextInt(musics.length);
			// 查看要播放的歌曲是否播放过
			for (int j = 0; j < oldMusics.length; j++) {
				// 准备的歌曲已经重复过，就不再播放
				if(musics[index].equals(oldMusics[j]) ){
					// 记录该歌曲已经播放过
					flag=true;
					break;
					
				}
			}
			// 判断是否播放歌曲
			if(flag){
				flag=false;
				i--;
				continue;
			}else{
				System.out.println("播放："+musics[index]);
				// 记录播放过的歌曲的下标
				oldMusics[i]=musics[index];
				
			}
			
		}
		
		 
		
		
		
		
		
		
		
	}
}
