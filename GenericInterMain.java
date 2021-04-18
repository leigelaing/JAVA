package com.demo01;

import java.util.Scanner;

/*
含有泛型的接口，
       第一种使用方式：定义接口的实现类，实现接口，指定接口的泛型。
       public interface Iterator<E>{
         E next;
       }
       Scanner 类实现了Iterator接口，并指定接口的泛型为String，
       所以重写的next方法，泛型就默认为String
       public final class Scanner implements Iterator<String>{
       public String next();
       }

 */
public class GenericInterMain implements GenericInter<String> {
    @Override
    public void method01(String s) {
        System.out.println(s);
    }
}
