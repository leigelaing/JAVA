package demo1;

import oop.Person;

public class Child extends Person {
	//构造方法
	public Child (String n,String s,int a){
		super(n,s,a);
	}
	public void live(){
		System.out.print("上学");
	}
}
