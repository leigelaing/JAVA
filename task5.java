package com.leliang;
import java.util.Scanner;
/**
 * дһ������������һ�������������������Ǽ�λ�� 
 */
public class task5 {
	public  static  void  Digit(int x){
         int  cons = 0;
		while((x / 10)!= 0){
				cons++;
				x = x / 10;
		}
		System.out.println( cons+1 +"λ��");
	}
	public  static  void  main(String[]args){
		Scanner input = new Scanner(System.in);
	    System.out.print("������һ������");
	    int n = input.nextInt();
	    Digit(n);
	}

}
