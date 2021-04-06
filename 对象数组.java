package com.hehe;
//题目要求：
//定义一个数组，用来存放3个Person对象。

public class 对象数组 {
    //首先创建一个能存放Person类型的数组
    //数组有一个缺点，程序一旦运行后数组长度将不可以再改变。
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
