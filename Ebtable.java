package com.bdqn;

public  interface  Ebtable
{
	//所有成员变量前默认有public  static  final
    int MAX_PRESER = 100;
    
    //默认有public  abstract
     void test();   //抽象方法
    
     
     //java 8之后可有static方法，所有就能定义main方法，
     //因此接口也可以直接运行。
      static  void  main(String[]args)
     {
    	 System.out.print("你好");
     }
     
      
      //类方法可以有方法体
      static  void  test5()
     {
    	 System.out.print("类方法 ");
     } 
    // 实例方法：为了给实例方法增加方法体，所以前面加default
     //开始在接口中的前面的方法都是抽象方法，前面默认添加public  abstract
      //抽象方法是没有方法体的，现在要为为抽象方法增加方法体，用default来抵消
      //程序中默认的abstract，将抽象方法，变为有方法体的实例方法。
    default void test()
    {
    	 System.out.print(" test方法");
    }
      
      
      
}
