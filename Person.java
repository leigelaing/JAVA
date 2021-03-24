package oop;

public class Person {
	String name;
	String sex;
	int age;
	//构造方法：
	public Person(String name,String sex,int age){
		this.name = name;
		this.sex = sex;
		this.age  = age;
	} 
   //live()方法
	public void live(){
		System.out.print("工作");
	}
}
