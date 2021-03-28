package com.legelaing;

public class Apple {
	String color;
	double weight;
	//构造器用于对该对象执行初始化
	//说白点就是将构造器中的局部变量，与成员变量区分开。
	public Apple(String color,double weight)
	{
		//构造器正在初始化谁，this就代表谁
		this.color = color;
		this.weight = weight;
		
	}

}
