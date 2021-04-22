package com.demo01;

import java.util.Arrays;
import java.util.Comparator;
/*
  Lambda表达式有参数又返回值练习
     需求：
      使用数组存储多个Person对象
      对数组中的Person对象，使用Arrays的sort方法，通过年龄进行升序排序
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        //  使用数组存储多个Person对象
        Person[] arr = {
                new Person("柳岩", 50),
                new Person("王岩", 52),
                new Person("类岩", 55),
                new Person("屎岩", 56),
        };
       /*
        //对数组中的Person对象，使用Arrays的sort方法，通过年龄进行升序(前面-后面)排序
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()- o2.getAge();
            }
        });
        */
        //使用Lambda表达式简化匿名内部类
        Arrays.sort(arr, (Person o1, Person o2)->{
                return o1.getAge()- o2.getAge();
        });
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        //增强for循环遍历
        for(Person p:arr){
            System.out.println(p);
        }
    }
}
