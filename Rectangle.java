package oop;

public class Rectangle {
	public int x,y;
	private int width,height;
	public Rectangle(){
		this(0,0,0,0);//���õ��������췽��
	}
	public Rectangle(int width,int height){
		this();//���õ�һ���޲ι��췽��
	}
	public Rectangle(int x,int y,int width,int height){
		this.x = x;
		this.y = y;
		this.width  = width;
		this.height  = height;
	}
}
