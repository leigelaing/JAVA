package com.demo02;
import java.util.ArrayList;
import java.util.Collection;
/*
  泛型的上线限定：  ？extends E   代表使用的泛型只能是E类型的子类或者本身。
  泛型的下线限定：   ？ super E   代表使用的泛型只能是E类型的父类或者本身。
 */
public class FanxingTonggaojishiyong {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<Integer>();
        Collection<String> list2 = new ArrayList<String>();
        Collection<Number> list3 = new ArrayList<Number>();
        Collection<Object> list4 = new ArrayList<Object>();
        //调用getElement1
        getElement1(list1);
       // getElement1(list2);//报错
       //getElement1(list3);
       // getElement1(list4);//报错
        //调用getElement2
       // getElement2(list1);//报错
       // getElement2(list2);//报错
        getElement2(list3);
        getElement2(list4);
        /*
           类与类之间的继承关系：
           Integer继承Number
           Number继承Object
           String继承Object
         */
    }
    //泛型的上限：此时的泛型？，必须是Number类型或者Number类型的子类
    public static void getElement1(Collection<? extends Number> coll){

    }
    //泛型的下限：此时的泛型？，必须是Number类型或者Number类型的父类
    public static void getElement2(Collection<? super Number> coll){

    }
}
