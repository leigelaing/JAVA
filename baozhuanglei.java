package com.demo01;
   /*
     装箱：把基本类型的数据，包装到包装类中，（基本数据类型——>包装类）
         1.构造方法：
         Integer(int value) ：构造一个新分配的 Integer对象，该对象表示指定的 int值。
         Integer(String s) ：构造一个新分配 Integer对象，表示 int由指示值 String参数。
         注意：传递的字符串，必须是基本类型的字符串，否则会抛出异常。"100"(OK),"a"(NO)
         2.静态方法：
       static Integer valueOf(int i) ：返回一个表示指定的int值的Integer实例 。
       static Integer valueOf(String s)：返回保存指定的String的值的Integer对象。
     拆箱：在包装类中取出基本数据类型的数据；（包装类——>基本数据类型）
       1.成员方法：
        int intValue() 以int类型返回该Integer 的值。
   */
public class baozhuanglei {
       public static void main(String[] args) {
           //装箱：把基本类型的数据，包装到包装类中，（基本数据类型——>包装类）
           //构造方法：
           Integer in1 = new Integer(2);
           System.out.println(in1);//重写了toString方法。
           Integer in2 = new Integer("2");
           System.out.println(in2);

           //静态方法：
           Integer in3 = Integer.valueOf(1);
           Integer in4 = Integer.valueOf("2");
           System.out.println(in3);
           System.out.println(in4);

           //数字格式化异常（in5会报错）
           Integer in5 = Integer.valueOf("a");
           System.out.println(in5);

           //拆箱：在包装类中取出基本数据类型的数据；
           int i = in1.intValue();
           System.out.println(i);

       }

}
