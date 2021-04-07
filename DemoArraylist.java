package com.wanshang;
/*
  如果希望集合Arraylist集合当中存储基本数据类型，必须使用基本类型对应的“包装类”。
  基本类型      包装类（引用数据类型，包装类都位于java.lang包下）
  byte         Byte
  short        Short
  int          Integer【特殊】
  long         Long
  float        Float
  double       Double
  char         Character【特殊】
  boolean      Boolean
从JDK1.5之后，程序支持自动装箱，自动拆箱
  自动装箱：基本数据类型————》包装类型
  自动拆箱：包装类型————》基本数据类型
 */

import java.util.ArrayList;

public class DemoArraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //错误写法！泛型只能是引用数据类型，不能是基本数据类型。
        //底层原因是集合中保存都是地址值，基本数据类型不是
        //ArrayList<int> lista = new ArrayList<>();


        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(100);
        lista.add(200);
        lista.add(300);
        lista.add(400);
        lista.add(500);
        System.out.println(lista);
        //获取对应元素
        Integer a = lista.get(2);
        System.out.println(a);
        //删除对应元素
        Integer b = lista.remove(3);
        System.out.println(b);
        //获取集合长度
        int c = lista.size();
        System.out.println(c);

    }
}
