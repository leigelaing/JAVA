package com.demo3;

import java.util.Objects;

public class Demojects {
    public static void main(String[] args) {
       // String s1 = "abc";
        String s1 = null;
        String s2 = "abc";
        //空指针是不能调用方法的否则就会抛出空指针异常
        //boolean b = s1.equals(s2);//NullPointerException(空指针异常)
        /*
        Objects类的equals方法：对两个对象进行比较，可以防止空指针异常。

        public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
         }

         */
        //System.out.println(b);
        boolean a = Objects.equals(s1,s2);
        System.out.println(a);

    }
}
