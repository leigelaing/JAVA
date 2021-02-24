package com.bdqn;
//while  循环为不定长循环，先判断    后执行
//  ==  不能比较字符串，只是比两个变量的地址

import java.util.Scanner;

public class diyige {
  public static void  main(String[]args){
	     String  name;
	  do{
		  Scanner input = new Scanner(System.in);
		  System.out.print("请输入姓名！");
		  name = input.next();
	  }while(!(name.equals("admin")));
	  //equals意思是name与admin之间进行比较,当一致取反，条件不满足，停止执行；当不一致，取反  条件满足，继续执行  
    System.out.print("登录成功！");
  }
}
