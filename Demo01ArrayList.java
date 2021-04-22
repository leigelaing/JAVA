package com.demo01;

import java.util.ArrayList;

/*
 Lambda表达式：是可推导，可以省略
 凡是根据上下文推到出来的内容，都可以省略书写
 可以省略的内容：
 1.（参数列表）：括号中的参数列表的数据类型，可以省略。
 2.（参数列表）：括号中的参数如果只有一个，那么类型和（）都可以省略。
 3.{一些代码}：如果{}中的代码只有一行，无论是否有返回值，都可以省略{}和return和“;”；
    注意事项：既然要省略，可以省略的三个部分可以一起省略。
 4.

 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        //在JDK1.7版本之前，创建集合对象，必须把前后的泛型都写上。
        ArrayList<String> list01 = new ArrayList<String>();
        //在JDK1.7版本之后，创建集合对象，把等号后面的泛型可以省略，后面泛型可以根据前面的泛型推导出来。
        ArrayList<String> list02 = new ArrayList<>();
    }
}
