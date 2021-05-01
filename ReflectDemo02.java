package com.demo02;

import java.lang.reflect.Field;
import java.nio.file.Files;
import java.util.Objects;

/*
1.获取成员变量们：
   *1 Field getField(String name)(获取指定名称的public修饰的成员变量，其他修饰不行)
     返回一个 Field对象，它反映此表示的类或接口的指定公共成员字段 类对象。
   *2 Field[] getFields()    (获取所有public修饰的成员变量，其他修饰不行)
     返回包含一个数组 Field对象反射由此表示的类或接口的所有可访问的公共字段 类对象。
   *3 Field getDeclaredField(String name)
     返回一个 Field对象，它反映此表示的类或接口的指定已声明字段 类对象。
   *4 Field[] getDeclaredFields()
     返回的数组 Field对象反映此表示的类或接口声明的所有字段 类对象。
2.
  Field：成员变量；
      1.设置值
        * void set(Object obj,Object value);
      2.获取值
        *get(Object obj);
      3.忽略访问权限修饰符的安全检查
        *setAccessible();//暴力反射
  */
public class ReflectDemo02 {
      public static void main(String[] args) throws Exception {
          //1.获取Person的Class对象;
          Class<Person> personclass = Person.class;
         //* Field[] getFields()  // (获取所有public修饰的成员变量，其他修饰不行)
          Field[] fields = personclass.getFields();
          //遍历fields数组
          for(Field field: fields){
              System.out.println(field);

          }
          System.out.println("===============================");
          //  * Field getField(String name)
          Field a = personclass.getField("a");
          //获取成员变量a的值
           Person p = new Person();
           Object value  = a.get(p);
           System.out.println(value);
          //设置成员变量a的值
            a.set(p,"张研萌");
          System.out.println(p);
          System.out.println("============================");
          // *4 Field[] getDeclaredFields()    (获取所有的成员变量,不考虑修饰符)

          Field[] d = personclass.getDeclaredFields();
         //遍历 d数组
          for(Field arr:d){
              System.out.println(arr);
          }
          System.out.println("============================");
          //*3 Field getDeclaredField(String name)
          Field f = personclass.getDeclaredField("d");
         //在访问不是public修饰的成员变量，必须忽略访问权限修饰符的安全检查
          f.setAccessible(true);//暴力反射
          Object value2 = f.get(p);
          System.out.println(value2);
      }
}

