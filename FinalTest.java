package com.publid;

public class FinalTest {
	public static  void main(String[]args)
	{
        String st1 = "abc";//��һ�����ַ��������ַ������롰�ء�
        String st2 = "abc";//�ڶ���ֱ���á��ء����ַ���
        System.out.print(st1 ==  st2);
	
        String st3 = "fkit.org";//��һ�����ַ��������ַ������롰�ء�
	    String st4 = "fkit"+".org";//����׶ξͻ��������fkit.org��ֱ��ʹ�á��ء��е��ַ���
	    System.out.print(st3 == st4);
	    
	    
	    String st5 = "fkit";
        String st6 = ".org";
        String str = st5 + st6;//st5��st6�Ǳ�����Ҫ�ȵ�����ʱ���ܼ�����������޷�ʹ�á��ء��е��ַ���
        System.out.print(str == st3);
        
        final String st7 = "fkit";
        final String st8 = ".org";
        String str2 = st7 + st8;//st7��st8����ʧ���൱��  String str2 = "fkit.org";
        System.out.print(str2 == st3);
        
        
	}
}
