package com.diyige;
/*
    字符串的截取方法：
   public String substring(int index);   截取从参数位置一直到字符串末尾，返回新字符串。
   public String substring(int begin ,int end); 截取范围从begin开始，一直到end结束，中间的字符串
  注意：[begin,end)  包含左，不包含右。
 */
public class zhifuchuandejiequ {
    public static void main(String[] args) {
       //substring(int index)方法
        String str = "abcdefghi";
        String a = str.substring(4);
        System.out.println(str);//原封不动
        System.out.println(a);//索引4 后面的全部截取出来  新字符串

       //  substring(int begin ,int end);
        System.out.println("=============================");
        String str1 = "abcdefghi";
        String a1 = str.substring(4,8);
        System.out.println(a1);
        System.out.println("=============================");

        /*
          下面这种写法，字符串的内容仍然没有改变
          下面有两个字符串"Hellow"，"JAVA"
          strA当中保存的是地址值
          本来地址值是0x666；
          后来地址值是0x999；
         */
        String strA = "Hellow";
        System.out.println(strA);//Hellow
        strA = "JAVA";
        System.out.println(strA);//JAVA
    }
}
