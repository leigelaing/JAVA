package com.legelaing;

public class test2 {
	//
     public void  test (int a,String...names )  //�βθ����ɱ�ķ���
     //String...  names �ȼ���  String[]  names
     {
    	 System.out.println("a����Ϊ "+ a);
    	 System.out.println("names���鳤��Ϊ��  "+ names.length);
    	 for(int i = 0;i < names.length;i++)
    	 {
    		 System.out.print(names[i]);
    	 }
     }
	
	public static  void  main(String...args)
	//main�����ĵڶ���д����
	//public static  void  main(String... args)
	{
		test2 va = new test2();
		va.test(34, "fkit","java",".org");
		//�����龲̬����һ�����鴫��
		va.test(-2, new String[]{"���˵�","ɵ��","���յ�"});
	}

}
