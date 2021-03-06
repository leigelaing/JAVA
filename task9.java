package com.leliang;
/**
 *求一个三位数，该三位数等与其每位数字的阶乘之和。 
 */
public class task9 {
	public  static  void  main(String[]args){
	  int i = 100;
		for(i = 100;i < 1000;i++){
	        int a = i%10;
	        int b = (i/10)%10; 
	        int c = i/100;
		    int  Div1 = 1;
		    int  Div2 = 1;
		    int  Div3 = 1;
	        while(a > 0){
			  Div1 = Div1*a;
			    a--;
		   }
	        while(b > 0){
				  Div2 = Div2*b;
				    b--;
		   }
	        while(c > 0){
				  Div3 = Div3*c; 
				  c--;
		
	       }
	        if(i == Div1 + Div2 + Div3 ){
	        	System.out.print(i);
	        }
	}
  }
}

