package com.demo02;

import java.lang.reflect.Method;

/*
3.获取成员方法们：
   * Method getMethod(String name, 类<?>... parameterTypes)
     返回一个 方法对象，它反映此表示的类或接口的指定公共成员方法 类对象。
   * Method[] getMethods()
     返回包含一个数组 方法对象反射由此表示的类或接口的所有公共方法 类对象，包括那些由类或接口和那    些从超类和超接口继承的声明。
   * Method  getDeclaredMethod(String name, 类<?>... parameterTypes)
返回一个 方法对象，它反映此表示的类或接口的指定声明的方法 类对象。
   * Method [] getDeclaredMethods()
     返回包含一个数组 方法对象反射的类或接口的所有声明的方法，通过此表示 类对象，包括公共，保护，默认（包）访问和私有方法，但不包括继承的方法。
  Method：执行方法
      执行方法：
         *Object invoke(Object... args)
      获取方法的名称：
      String getName();获取方法名
 */
public class ReflectDemo04 {
    public static void main(String[] args) throws Exception {
        //1.获取Person的Class对象
        Class per = Person.class;
        //2.Method getMethod(String name, 类<?>... parameterTypes)
        //获取指定名称的方法
        Method eatmethod = per.getMethod("eat");
        Person p = new Person();
       //执行方法
        eatmethod.invoke(p);
       //执行有参数的eat方法
          Method eatmethod2 = per.getMethod("eat",String.class);
        eatmethod2.invoke(p,"吃屎");
        System.out.println("====================================");
        //获取所有public修饰的方法
        Method[] nethods = per.getMethods();
        //遍历nethods数组
        for(Method arr:nethods){
            System.out.println(arr);
            eatmethod.setAccessible(true);
        }
        //获取类名


    }
}
