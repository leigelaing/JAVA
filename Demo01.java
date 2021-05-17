package com.test01;

import com.test02.Person1;

public class Demo01 {
    public static void main(String[] args) {
        Person1[] arr = new Person1[3];

        Person1 one = new Person1("迪丽热巴",15);
        Person1 two = new Person1("闫妮",55);
        Person1 three = new Person1("雷葛亮",18);

        //将one当中的地址赋值给arr[0]
        arr[0] = one;//地址
        arr[1] = two;//地址
        arr[2] = three;//地址

        Person1 per = arr[0];
        System.out.println(per.getName());
        System.out.println(per.getAge());

    }
}
