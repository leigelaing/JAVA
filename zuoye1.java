package com.baqn;

import java.util.Random;
import java.util.Scanner;

public class zuoye1 {
	public  static   void   main(String[] args){
		int []arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
         Scanner input = new Scanner(System.in);
         while(true){
        	 System.out.println("1:机选；2：自选");
             System.out.println("请输入>:");
             int num = input.nextInt(); 
             switch(num)
             {
             case 1: 
            	 System.out.println("机选开始！");
            	 int[] arr1 = new int[7];
            	 Random ran = new Random();
            		 int index = 0;
            			for(int i = 0;i <= 6;i++){
               			 index = ran.nextInt(arr.length);
            			 arr1[i] = index;
               			 System.out.print(arr1[i]+" ");
            			}
            			 System.out.println();
            	        break;
             case 2:
            	 System.out.println("自选");
                 break;
             
             default:
            	 
                 System.out.println("输入有误！请重新输入");
                 break;
             } 
        	 
        	 
         }
        
	}

}
