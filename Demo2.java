package com.hp.demo;

import com.hp.bean.Animal;
import com.hp.bean.BanDian;
import com.hp.bean.Dog;

public class Demo2 {
	public static void main(String[] args) {
		Animal a;
		a = new Dog();
		
		/*a.shengBing();		
		System.out.println(a.getClass());*/
		
		/*Dog d = Dog.isDog(new BanDian());
		System.out.println(d);*/
		
		Dog d1 = new Dog();
		d1.setAge(11);
		d1.setName("Ǭ¡");
		Dog d2 = new Dog();
		BanDian b = new BanDian();
		Dog d3 = d1;
		/*System.out.println(d1.getClass()==d2.getClass());
		System.out.println(d1.getClass()==b.getClass());*/
		
	/*	System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
		
		System.out.println(d1==d3);
		System.out.println(d1.equals(d3));
	*/
		String str1 = new String("����");
		String str2 = new String("����");
		String str3 = "����";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println("~~~~~");
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		
		String str4 = "����";
		System.out.println(str3==str4);
		/* equals������д����
		 * 1. �Է���   A.equals(A)  ���Ϊtrue
		 * 2. �Գ���  
		 * 3. ������
		 * 4. һ����
		 * 
		 */
		System.out.println(d1.toString());
		
		
		
		
		
	}
}
