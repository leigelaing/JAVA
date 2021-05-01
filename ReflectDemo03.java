package com.demo02;
import java.lang.reflect.Constructor;
/*
2.获取构造方法们：
   * Constructor<T> getConstructor(类<?>... parameterTypes)
     返回一个 Constructor对象，该对象反映 Constructor对象表示的类的指定的公共 类函数。
   * Constructor<?>[] getConstructors()
     返回包含一个数组 Constructor对象反射由此表示的类的所有公共构造 类对象。
   * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
     返回一个 Constructor对象，该对象反映 Constructor对象表示的类或接口的指定 类函数。
   * Constructor<?>[] getDeclaredConstructors()
     返回一个反映 Constructor对象表示的类声明的所有 Constructor对象的数组 类 。
  Constructor：构造方法
  *创建对象：
        T newInstance(Object... initargs)
     注意：
      如果使用空参构造方法创建对象，操作可简化：Class对象的newInstance方法（直接访问无参构造器）。
 */
public class ReflectDemo03 {
    public static void main(String[] args) throws Exception{
        Class per = Person.class;
        //* Constructor<T> getConstructor(类<?>... parameterTypes)
        //有参构造方法
        Constructor con = per.getConstructor(String.class, int.class);
        System.out.println(con);
        //无参构造方法
        Constructor con1 = per.getConstructor();
        System.out.println(con1);
        //有参构造器创建对象
        Object person = con.newInstance("日娜吗",23);
        System.out.println(person);
       //无参构造器创建对象
        Object person1 = con1.newInstance();
        System.out.println(person1);

        Object o = per.newInstance();
        System.out.println(o);
    }
}
