package com.legelaing;

public class Pig {
	String color;
	double weight;
	public void move()
	{
		System.out.println("���ܵÿ�");
	}
  public void test()
  {
	  System.out.println("���Է���");
	 
	  //û��static���Σ��ö�����ã�      this.move();
	  //Pig p = new Pig();
	  //��������������ߣ�
      //p.move();
      
      //˭�ڵ���test������this���Ǵ���˭
      this.move();
      System.out.println(this.color);
  
  }
}
