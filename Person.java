package oop;

public class Person {
	String name;
	String sex;
	int age;
	//���췽����
	public Person(String name,String sex,int age){
		this.name = name;
		this.sex = sex;
		this.age  = age;
	} 
   //live()����
	public void live(){
		System.out.print("����");
	}
}
