package com.demo01;
 /*

 */
public class PrintableMain {
    //定义一个方法，参数传递Demo01Printable 接口，对字符串进行打印
     public static void printString(Demo01Printable p){
         p.print("雷葛亮");
     }
     public static void main(String[] args) {
         //调用printString方法，方法的参数Demo01Printable是一个函数式接口，
         // 所以可以传递lambda表达式
         printString((s)->{
             System.out.println(s);
         });

     /*
      分析：
        lambda表达式的目的，打印参数传递的字符串。
        把参数s，传递给了System.out 对象，
        调用out对象中的方法println对字符串进行输出。
        注意：
        1.System.out对象已经是存在的。
        2.Println方法也是已经存在的。
        （使用引用的前提就是对象与方法必须都存在）
        所以我们可以使用方法引用来优化Lambda表达式，
        可以使用System.out方法直接引用（调用）println方法。
      */
     printString(System.out::println);
     }
}
