package com.hp.homeWork;

import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] webService = {"百度","新浪","搜狐","淘宝",null};
		
		/*System.out.println("请输入您要添加的网站");
		String web = input.next();
		// 添加
		int index = -1;
		for (int i = 0; i < webService.length; i++) {
			if(webService[i]==null){
				webService[i]=web;
				index = i;
			}
		}
		
		if(index==-1){
			System.out.println("暂时没有广告位");
			
		}
		*/
		
		// 删除
		/*System.out.println("请输入您要删除的网站");
		String web = input.next();
		int index = -1;
		for (int i = 0; i < webService.length; i++) {
			if(webService[i].equals(web)){
				webService[i]=null;
				index = i;
				System.out.println("已经删除");
			}
		}
		if(index==-1){
			System.out.println("亲！没有要删除的网站......");
		}
		*/
		
		// 修改
		System.out.println("请输入您要修改的网站");
		String web = input.next();
		int index = -1;
		for (int i = 0; i < webService.length; i++) {
			if(webService[i].equals(web)){
				webService[i]=web;
				index = i;
				System.out.println("已经修改");
			}
		}
		if(index==-1){
			System.out.println("亲！没有要修改的网站......");
		}
	}
}
