package oop;

public class Company3 {
	String name;
	int num;
	public Company3(){
		System.out.print("���췽��1");
	}
	public Company3(String name,int  num){
		this();//�����޲εĹ��췽����������ڴ��������
	this.name = name;
	this.num  = num;
	this.getinfo();
	}
	public void getinfo(){
		System.out.print(this.name+"��"+this.num+"��Ա��");
	}

}
