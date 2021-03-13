package com.hp.demo;

import com.hp.bean.Student;

public class Demo1 {
	public static void main(String[] args) {
		Student s1 = new Student("a");
		Student s2 = new Student("b");
		/*s1=s2=null;
		System.gc();
		*/
		
		Class c = s1.getClass();
		System.out.println(c);
	}
}
