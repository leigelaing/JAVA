package com.hp.test;

import com.hp.bean.Book;

public class Test2 {
	public static void main(String[] args) {
		Book book1 = new Book();
		System.out.println(book1.author);
		book1.author="";
		book1.price=99;
		book1.bookName="";
		book1.count=99;
		
		Book[] bs = new Book[5];
		bs[0]= book1;
		
		bs[0] = new Book();
		bs[0].author="aa";
		
		System.out.println(bs[0].author);
		
		
		
		
		
		
		
		
		
		
		
		Book[][] books = new Book[3][5];
		books[0][0] = book1;
		books[0][0].author = "��ӹ";
		books[0][0].bookName = "���Ӣ�۴�";
		books[0][0].price = 89;
		books[0][0].count = 29;
		
		String name = books[0][0].author;
		System.out.println(name);
		
		
		System.out.println(book1==books[0][0]);
		
		books[0][1] = new Book();
		books[0][1].author = "����";
		books[0][1].bookName = "������Ϊ��֪������";
		books[0][1].price = 199;
		books[0][1].count = 998;
		
		books[0][1] = book1;
		
		books[0][2] = new Book();
		books[0][2].author = "����";
		books[0][2].bookName = "��«�޴�ս���ν��";
		books[0][2].price = 19;
		books[0][2].count = 999;
		
		
		
		
		
		
	}
}
