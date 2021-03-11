package com.hp.bean;

public class Dog  extends Aminal{
	
	private   String name;
	private int age;
	char sex;
	
	public void eat(){
		System.out.println("¿Ð¹ÇÍ·");
	}

	public Dog() {
		super();
		
		// TODO Auto-generated constructor stub
	}


	public void tian(){
		String name = super.getName();
		System.out.println("Ìò");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public char getSex() {
		return sex;
	}


	public void setSex(char a) {
		sex = a;
	}
}
