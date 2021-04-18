package com.demo01;

public class GenericClassMain {
    public static void main(String[] args) {
        //不写泛型，默认为Object
        GenericClass gc = new GenericClass();
        gc.setName("只能是字符串");
       Object obj = gc.getName();
        System.out.println(obj);

      //创建GenericClass对象，泛型使用INetger类型。
        GenericClass<Integer> gc1 = new GenericClass<>();
        gc1.setName(1);
        Integer ieg = gc1.getName();
        System.out.println(ieg);
        //创建GenericClass对象，泛型使用String类型。
        GenericClass<String> cls = new GenericClass<>();
        cls.setName("雷葛亮");
        String eg = cls.getName();
        System.out.println(eg);
    }
}
