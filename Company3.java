package oop;

public class Company3 {
	String name;
	int num;
	public Company3(){
		System.out.print("构造方法1");
	}
	public Company3(String name,int  num){
		this();//调用无参的构造方法，必须放在代码块首行
	this.name = name;
	this.num  = num;
	this.getinfo();
	}
	public void getinfo(){
		System.out.print(this.name+"有"+this.num+"名员工");
	}

}
