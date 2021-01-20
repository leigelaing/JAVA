package com.bdqn;
/**
 * 运算符
 * 1.算数运算符
 * + - *(乘) /(除) %(取余)   
 * ++：在自身的基础上加1
 * 1)a++;在后：先赋值后计算(加1)
 * 2)++a;在前：先计算后赋值\
 * 
 * 2.比较运算符
 * > < >= <= != ==
 * 注意：比较运算符的结果是boolean值
 * 
 * 3.逻辑运算符
 * &&和&区别？
 * 与(&&) 或(||) 非(!)
 * 注意：结果是boolean值
 * 
 * 4.赋值运算符
 * = += -= *= /= %=
 * 
 * 5.三目运算符(三元运算符)
 */
public class Demo01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(10%3);
		System.out.println("=======================");
		int n = 5;
		// ++在后：先赋值，后++
		/*int m = n++;
		System.out.println(n);
		System.out.println(m);*/
		int m = ++n;
		System.out.println(n);
		System.out.println(m);
		
		int i = 5;
		//        5
		int j = (i++)+(++i);
		System.out.println(i);
		System.out.println(j);
		System.out.println("************************");
		System.out.println(10>20);
		System.out.println(10<20);
		System.out.println(10>=10);
		System.out.println(10==10);
		System.out.println(10!=10);
		System.out.println("========================");
		System.out.println(10>20&&20<30);
		System.out.println(10>20||20<30);
		System.out.println(!(10>20));
		
		// q+=3;等价于q=q+3
		int q = 10;
		q %= 3;
		System.out.println(q);
		
		String name = "张三";
		int c = 180;
		int d = 190;
		String result = c<d?"张三":"李四";
		System.out.println(result);
		
	}

}
