package com.legelaing;

public class Pigtest1 {
	public static  void  main(String[]args)
	{
		//
		Pig p1 = new Pig();
		p1.color = "��ɫ";
		p1.test();
	//p1����test���������test������this�ʹ���p1
	    
		Pig p2 = new Pig();
		//p2����test���������test������this�ʹ���p2
		p2.color = "��ɫ";
		p2.test();
	}
}
