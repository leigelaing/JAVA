package com.bdqn;
//while  ѭ��Ϊ������ѭ�������ж�    ��ִ��
//  ==  ���ܱȽ��ַ�����ֻ�Ǳ����������ĵ�ַ

import java.util.Scanner;

public class diyige {
  public static void  main(String[]args){
	     String  name;
	  do{
		  Scanner input = new Scanner(System.in);
		  System.out.print("������������");
		  name = input.next();
	  }while(!(name.equals("admin")));
	  //equals��˼��name��admin֮����бȽ�,��һ��ȡ�������������㣬ִֹͣ�У�����һ�£�ȡ��  �������㣬����ִ��  
    System.out.print("��¼�ɹ���");
  }
}
