package com.publid;

public class FinalTest {
	public static  void main(String[]args)
	{
        String st1 = "abc";//第一次用字符串，该字符串进入“池”
        String st2 = "abc";//第二次直接用“池”中字符串
        System.out.print(st1 ==  st2);
	
        String st3 = "fkit.org";//第一次用字符串，该字符串进入“池”
	    String st4 = "fkit"+".org";//编译阶段就会计算结果：fkit.org，直接使用“池”中的字符串
	    System.out.print(st3 == st4);
	    
	    
	    String st5 = "fkit";
        String st6 = ".org";
        String str = st5 + st6;//st5与st6是变量，要等到运行时才能计算结果，因此无法使用“池”中的字符串
        System.out.print(str == st3);
        
        final String st7 = "fkit";
        final String st8 = ".org";
        String str2 = st7 + st8;//st7与st8会消失，相当于  String str2 = "fkit.org";
        System.out.print(str2 == st3);
        
        
	}
}
