package com.bdqn;

public  interface  Ebtable
{
	//���г�Ա����ǰĬ����public  static  final
    int MAX_PRESER = 100;
    
    //Ĭ����public  abstract
     void test();   //���󷽷�
    
     
     //java 8֮�����static���������о��ܶ���main������
     //��˽ӿ�Ҳ����ֱ�����С�
      static  void  main(String[]args)
     {
    	 System.out.print("���");
     }
     
      
      //�෽�������з�����
      static  void  test5()
     {
    	 System.out.print("�෽�� ");
     } 
    // ʵ��������Ϊ�˸�ʵ���������ӷ����壬����ǰ���default
     //��ʼ�ڽӿ��е�ǰ��ķ������ǳ��󷽷���ǰ��Ĭ�����public  abstract
      //���󷽷���û�з�����ģ�����ҪΪΪ���󷽷����ӷ����壬��default������
      //������Ĭ�ϵ�abstract�������󷽷�����Ϊ�з������ʵ��������
    default void test()
    {
    	 System.out.print(" test����");
    }
      
      
      
}
