package com.demo01;
/*
  使用lambda优化日志案例，
  lambda的特点：延迟加载。
  lambda有使用前提是：必须存在函数式接口


 */
public class Demo02Lambda {
  //定义一个显示日志的方法，方法的参数传入日志的等级和MessageBuilder接口
    public static void showlog(int leave,MessageBuilder mb){
       //对日志的等级进行判断，如果是1级，则调用MessageBuilder接口中调用MassageB()方法。
       if(leave == 1){
           System.out.println(mb.MassageB());
       }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1 = "hellow";
        String msg2 = "java";
        String msg3 = "World";
        //调用showlog方法，参数MessageBuilder是一个函数式接口，所以可以传递lambda表达式
        showlog(1, () -> {
            //测试
            System.out.println("不满足条件不执行");
            //返回一个拼接好的字符串
            return msg1 + msg1 + msg1;
        });
        /*
          使用lambda表达式，作为参数，仅仅是把参数，传递到showlog方法中。
          只有满足条件，日志的等级是1级，
          才会调用接口的MessageBuilder接口中的MassageB()方法。
          才会进行字符串的拼接。
          如果条件不满足（日志的等级不是1级），
          不会调用接口的MessageBuilder接口中的MassageB()方法。
           所以拼接字符串的代码不会执行，不会存在性能的浪费。
         */
    }
}
