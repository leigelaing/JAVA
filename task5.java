package com.leliang;
import java.util.Scanner;
/**
 * 写一个函数，接受一个整数，输出这个整数是几位数 
 */
public class task5 {
	public  static  void  Digit(int x){
         int  cons = 0;
		while((x / 10)!= 0){
				cons++;
				x = x / 10;
		}
		System.out.println( cons+1 +"位数");
	}
	public  static  void  main(String[]args){
		Scanner input = new Scanner(System.in);
	    System.out.print("请输入一个整数");
	    int n = input.nextInt();
	    Digit(n);
	}

}
