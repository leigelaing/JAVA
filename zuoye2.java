package com.bdqn;
/**
 *输出100以内数的和；要看见过程，不能只输出结果
 */
public class zuoye2 {
     public  static  void  main(String[]args){
    	 int i = 0;
    	 int sum = 0;
    	 for(i = 0;i <= 100;i++){
    		 sum = sum + i;
    		 if(i == 100){
    		 System.out.print(i);
    		 break;
    		 }
    		 System.out.print(i  +  "+");
 
    	 }
    	 System.out.print("=" + sum);
     }
}
