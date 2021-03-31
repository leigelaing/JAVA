package com.bdqn;

public class AnimalTest {
	public static  void main(String[]args)
	{
		Animal.info();//调用类方法
		//Animal an =  new  Animal;//抽象类不能创建对象
	
		//向上转型
		Animal  an1 = new   Bird();
		Animal  an2 = new Camer1();
		//不同类型的变量调用同一个对象，呈现出不同的状态
		//这个叫多态
		//an1与an2编译类型为Animal
		an1.move();
		an2.move();
		
	}
}
