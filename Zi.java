package com.sadff;

public class Zi extends Fu {
    int numzi = 20;

    int num = 200;
    public void methodZi(){
        //因为本类当有对应的num，所以使用的是本类当中的num。
        // 如果本类当中没有num就使用父类当中的num。
        System.out.println(num);
    }
}
