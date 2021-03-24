package demo1;
import oop.Father;

public class Son extends  Father{
	static {
		System.out.println("子类静态代码块");
	}
	{
		System.out.println("子类构造代码块");
	}
	
	public Son(){
		System.out.print("子类构造方法");
	}
	
	
	
	
	
	
	
	/*
	 public void walk(){  //重写父类的walk方法
		super.walk();
		System.out.print("儿子去游乐场");
	}
		*/
}

