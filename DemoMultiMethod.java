package com.demo2;
import com.demo1.Fu;
import com.demo1.Zi;
/*
  在多态的代码当中，成员方法的访问规则是：
  看new的是谁就优先用谁，没有则向上找。
  口诀：编译看左边，运行看右边。
  对比一下：
  成员变量：编译看右边，运行看左边。
  成员方法：编译看左边，运行看右边。
 */
public class DemoMultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();//多态
        obj.method();//父子都有，优先用子。
        obj.methodFu();//子类没有，父类有，向上找父类。

        //编译看左边，左边时Fu，Fu当中没有methodZi方法，所以编译报错。
        //obj.methodZi();//错误写法！
    }
}
