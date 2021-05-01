package com.demo01;
/*
  通过对象名引用成员方法
   使用前提是对象名已经存在，成员方法也已经存在
   就可以使用对象名引用成员方法
 */
public class Demo01ObjectMethodReference {
    //定义一个方法，方法的参数传递Demo01Printable接口，
    public static void printString(Demo01Printable d){
        d.print("abcd");
    }
    public static void main(String[] args) {
        //调用printString方法，方法的参数Demo01Printable是一个函数式接口，
        //所以可以传递Lambda表达式
        printString((s)->{
            //创建MethodRerObject对象
            MethodRerObject met = new MethodRerObject();
            //调用 MethodRerObject对象中的成员方法叫printUpperCaseString
            //把这个字符串按照大写输出
            met.printUpperCaseString(s);
        });
        /*
          使用方法引用优化lambda表达式
          对象是已经存在的MethodRerObject
          成员方法也是已经存在的
          所以我们可以使用对象名，来引用成员方法。
         */
        MethodRerObject met = new MethodRerObject();
        printString(met::printUpperCaseString);
    }
}
