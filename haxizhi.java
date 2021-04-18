package com.demo02;
/*
  哈希值：是一个十进制的整数，由系统随机给出（就是对象的地址值，是一个逻辑地址，是模拟出来得到的地址
     不是数据存储的物理地址）
     在Object类中有一个方法，可以获取对象的哈希值
     int hashCode();返回对象的哈希值
     hashCode方法的源码：
     public native int hashCode();
     native :代表该方法调用的是本地操作系统的方法
 */
public class haxizhi {
    public static void main(String[] args) {
        //person 类默认继承，Object类所以可以使用hashCode()方法
        person  per = new person();
        int a = per.hashCode();
        System.out.println(a);
        person  per1 = new person();
        int a1 = per1.hashCode();
        System.out.println(a1);

        System.out.println(per);
        System.out.println(per1);
        System.out.println(per1 == per);

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354
    }
    /*
      toString 方法：
      toString方法的源码：
      public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
     */
    /*
       String类的哈希值
           String 类重写Object类中的hashCode()方法
     */

}
