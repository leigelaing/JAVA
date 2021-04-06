package com.hehe;

import java.util.Scanner;

//创建对象的标准格式是：
//类名称  对象名 = new 类名称();

//匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
//new.类名称();
//注意事项：匿名对象只能使用唯一的一次，下次再使用必须创建新的对象。
//使用建议：如果确定有一个对象只需要使用唯一一次，建议创建匿名对象。


public class Test3 {
    public static void main(String[] args) {
        //左边的one就是对象名
        Person one = new Person();
        one.name = "王八蛋";
        one.showName();
        System.out.println("======================");
        //匿名对象
        new Person().name = "日他妈的";
        new Person().showName();//结果为：null值
    }


}
    /*
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("输入第一个数字");
        int a = input.nextInt();
        System.out.println("输入第二个数字");
        int b = input.nextInt();
        System.out.println("输入第三个数字");
        int c = input.nextInt();

        int tmp = (a>b?a:b);
        int mab = (tmp>c?tmp:c);
        System.out.println(mab);


    }

}
*/