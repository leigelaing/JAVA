package com.hp.demo;

import java.util.Random;

public class Demo4 {
	public static void main(String[] args) {
		// ������
		String[] musics = {"����","�ҵĻ���Ь","�����","���������","Сƻ��"};
		
		// �������������ڱ��沥�Ź��ĸ���
		String[] oldMusics = new String[musics.length];
		
		// �������
		Random ran = new Random();
		
		boolean flag = false;
		// ���ո��������������
		for (int i = 0; i < musics.length; i++) {
			// ��ȡҪ������ŵĸ������±�
			int index = ran.nextInt(musics.length);
			// �鿴Ҫ���ŵĸ����Ƿ񲥷Ź�
			for (int j = 0; j < oldMusics.length; j++) {
				// ׼���ĸ����Ѿ��ظ������Ͳ��ٲ���
				if(musics[index].equals(oldMusics[j]) ){
					// ��¼�ø����Ѿ����Ź�
					flag=true;
					break;
					
				}
			}
			// �ж��Ƿ񲥷Ÿ���
			if(flag){
				flag=false;
				i--;
				continue;
			}else{
				System.out.println("���ţ�"+musics[index]);
				// ��¼���Ź��ĸ������±�
				oldMusics[i]=musics[index];
				
			}
			
		}
		
		 
		
		
		
		
		
		
		
	}
}
