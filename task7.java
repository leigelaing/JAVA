package com.leliang;

import java.util.Scanner;

public class task7 {
	public  static  void  Distance(int a1,int b1,int a2,int b2){
		int level = 0;
		int vertical = 0;
		int distance = 0; 
		level = a1 -a2;
		vertical =  b1-b2;
		distance = level*level + distance * distance;
		System.out.print(Math.sqrt(distance));
	}
	public  static  void  main(String[]args){
		Scanner input = new Scanner(System.in);
	    System.out.println("请输入两个坐标");
	    System.out.println("坐标1");
	    int x1 = input.nextInt();
	    int y1 = input.nextInt();
	    System.out.println("坐标2");
	    int x2 = input.nextInt();
	    int y2 = input.nextInt();
	    Distance(x1,y1,x2,y2);
	}
}
