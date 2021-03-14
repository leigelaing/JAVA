package com.hp.test;

import com.hp.bean.Person;

public class Test4 {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		
		p1.setName("½ðÁ«");
		
		
		String name = p1.getName();
		System.out.println(name);
	}
}
