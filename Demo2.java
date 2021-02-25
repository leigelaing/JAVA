package com.hp.demo;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		String[] webs = {"新浪","搜狐","网易",null};
		// 或取数组的长度
		System.out.println(webs.length);
		Scanner input = new Scanner(System.in);
		
		
		/*// 添加
		System.out.println("亲！请输入您要添加的网站");
		// 获取用户的输入
		String addWeb = input.next();
		boolean flag = false;
		for (int i = 0; i <webs.length; i++) {
			
			// 判断数组中存在null的位置，进行添加操作
			if(webs[i]==null){
				webs[i] = addWeb;
				System.out.println("恭喜X总！合作愉快！");
				flag=true;
				break;
			}
			
		}
		
		if(flag==true){
			System.out.println("没有位置了，你找下领导吧！！");
		}*/

		
		// 删除
		System.out.println("亲！请输入您要撤退的网站");
		// 获取用户要取消合作的网站
		String delWeb = input.next();
		// 创建变量用于记录找到的数据的下标，用于进行更进一步的操作
		int index = -1;
		for (int i = 0; i < webs.length; i++) {
			// 判断是否存在要删除的网站
			if(webs[i].equals(delWeb)){
				// 找到要删除的网站进行删除
				webs[i]=null;
				// 记录被删除的数据的下标（位置）
				index=i;
				break;
			}
			
			
		}
		
		if(index!=-1){
			System.out.println("删除成功！");
			
		}else{
			System.out.println("不好意思！您记错了吧！！！");
			
			
		}
		
		
		
		
		
		
		
		
	}
}
