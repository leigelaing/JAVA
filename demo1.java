package com.wanshang;
/*
    引用数据类型    == 是进行对象的地址值比较，如果确实需要要字符串的内容比较，可以使用两种方法。
 public boolean equals(Object obj);  //大小写严格区分
    参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true，否则返回false
    注意事项：
      1.任何对象都能用Object进行接收
      2.equals方法具有对称性，也就是a.equals(b)和 b.equals(a)
      3.如果比较双方一个常量一个变量，推荐把常量字符串写在前面
      推荐："abc".equals(str1)  不推荐 str1.equals("abc")

 public boolean equalsIgnoreCase(String str);   忽略大小写，进行内容比较

 */
public class demo1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));//true
        System.out.println(str2.equals(str3));//true
        System.out.println(str3.equals("Hello"));//true
        System.out.println("Hello".equals(str1));//true

        String str4 = "hello";
        System.out.println(str3.equals(str4));
        System.out.println("====================");

        String str5 = "abc";
        System.out.println("abc".equals(str5));//推荐
        System.out.println(str5.equals("abc"));//不推荐

        String str6 = null;
        System.out.println("abc".equals(str6));//结果 false
        //System.out.println(str6.equals("abc"));//结果 报错：空指针异常NullPointerException

        System.out.println("====================");
        String stra = "java";
        String strb = "JAVA";
        System.out.println(stra.equals(strb));//false  严格区分大小写
        System.out.println(stra.equalsIgnoreCase(strb));//true  不区分大小写

        System.out.println("====================");
        //注意：只有英文字母区分大小写，其他都不区分大小写
        System.out.println("abc一123".equalsIgnoreCase("abc壹123"));//false
    }
}
