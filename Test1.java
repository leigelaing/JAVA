package com.hp.test;

import com.hp.bean.Students;

public class Test1 {
	public static void main(String[] args) {
		Students stu1;
		stu1 = new Students();
		
		stu1.name="金莲";
		stu1.age=18;
		stu1.sex='女';
		
		
		// 实例化
		Students stu2 = new Students();
		stu2.name="西施";
		stu2.age=19;
		stu2.sex='女';		
		
		
		System.out.println(stu2.age);
		
		stu1.showMe();
		
		
		
		
	}
}
