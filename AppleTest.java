package com.publid;

class Apple
{
   private String color;
   private double  weight;
 //�޲����Ĺ�����
   public  Apple()
   {
	   
   }
   //��ʼ��ȫ����Ա�����Ĺ�����
   public Apple(String color, double weight)
   {
	super();
	this.color  = color;
	this.weight = weight;
   }
   //color��setter��getter������
   public  void  setColor(String color)
   {
	   this.color = color;
   }
   public  String  getColor()
   {
	  return this.color ;
   }
   public  void  setWEight(double weight)
   {
	   this.weight = weight;
   }
   public  double  getweight()
   {
	  return this.weight;
   }
   @Override
   public String toString()
   {
	return  "Apple [color = "+color+",  weight = "+weight
			/*�г����еĳ�Ա����*/
			+"]";
	   
   }
   
   
   
}

public class AppleTest
{
	public static  void  main(String[]args)
	{
		Apple ap1 = new  Apple("��ɫ",2.3);
	//	�����ӡ���󣬻�Ѷ����Զ�ת�ַ���ʱ��ʵ�����õ��Ǹö����toString���������ķ���ֵ��
	//���´�����ȫһ��
		System.out.println(ap1);
		System.out.println(ap1.toString());
	
		Apple ap2 = new  Apple("��ɫ",2.9);
		System.out.println(ap2);
		System.out.println(ap2.toString());
		
		
		//�κζ���+"",�ͻ����ַ���
		String str = ap2 + "";
		System.out.println(str);
	}

}
