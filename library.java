package com.librarySystem;

public class library {
    //书名
	public String name;
	//分类
    public String classes;
	//位置 
	public int arr  ;
    //版本
	public float edition;
    //作者
	public String writer;
	//出版日期
	public  int date;
	
	
	
	public   void outshow()
	{
		System.out.println("书名："+name);
		System.out.println("分类："+classes);
		System.out.println("位置 ："+arr);
		System.out.println("版本："+edition);
		System.out.println("作者："+ writer);
		System.out.println("出版日期："+date);
		
		
	}
	
}
