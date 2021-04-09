package com.bdqn;

/* 局部变量与成员变量的区别
 1.定义的位置不一样【重点】
 局部变量：在方法的内部
 成员变量：在方法的外部，直接写在类中
 2.作用范围不一样【重点】
 局部变量：只有在方法当中才可以使用，出了方法就不能再使用
 成员变量：整个类中都可以通用
 3.默认值不一样【重点】
 局部变量：没有默认值，如果想使用，必须手动进行赋值
 成员变量：如果没有赋值，会有默认值，规则和数组一样
 4.内存的位置不一样
 局部变量：位于栈内存
 成员变量：位于堆内存
 5.生命周期不一样
 局部变量：随着方法进栈而诞生，随着方法结束而消失
 成员变量:随着对象创建而诞生，随着对象被垃圾回收而消失

  */

public class Test5 {
  String name;//成员变量
    public void met (){
        int num = 20;//局部变量
        System.out.println(num);
        System.out.println(name);//成员变量依旧可以用
    }
    public void met1 (){

       // System.out.println(num);//局部变量无法使用
        System.out.println(name);//成员变量依旧可以用
    }
    public void met1 (int parme){  //方法参数就是局部变量
        //参数在调用方法的时候，必然会被赋初始值。
        System.out.println(parme);
        int age;//局部变量
        System.out.println(name);//成员变量依旧可以用
    }
}




/*
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

    }
    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand = "VIVE";
        one.price = 8566.0;
        one.color = "屎一样的颜色";
        return one;
    }
}
*/
    /*
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "OPPOr";
        one.price = 6665.0;
        one.color = "黄色";
        method(one);//传递进去的参数实际就是地址

    }
    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
*/




    /*
    public static void main(String[] args) {
        //根据phone类，创建一个名为one的对象
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("================");

        one.brand = "小米";
        one.price = 8885.0;
        one.color = "黑色";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("================");

        one.call("老刀把子");
        one.sendMessage();


    }
}
*/