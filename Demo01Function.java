package Demo01;

import java.util.function.Function;

/*
  Function接口中的默认方法andThen：用来进行组合操作。
  需求：
  把String类型的123 ，转换为Interge类型，把转换后的结果加上10.
  把增加之后的Interge类型的数据，转换为String类型。
  分析：
  一共转换了两次
  1.String类型转换为Interge类型
      所以我们可以使用Function<String,Interge>fun1
      Interge i = fun1.apply("123")+10;
  2.Interge类型转换String为类型
      所以我们可以使用Function<Interge,String>fun2
      String i = fun2.apply(i);
    使用andThen方法，把两次转换组合在一起使用
    String s = fun1.andthen(fun2).apply("123");
   执行流程：
       fun1先调用apply方法，把字符串转换为Interge
       fun2再调用apply方法，把Interge转换为字符串
 */
public class Demo01Function {
    /*
    定义一个方法
    参数：传入一个字符串类型的整数
    参数再传递两个Function接口
      一个泛型使用Function<String ,Integer>
      一个泛型使用Function<Integer,String>
     */
    public static void change(String s, Function<String ,Integer> fun1,Function<Integer,String> fun2){
        String s1 = fun1.andThen(fun2).apply(s);
        System.out.println(s1);
    }

    public static void main(String[] args) {
        //定义一个字符串的整数
        String a = "123";
        //调用Change方法，传递字符串和两个Lambda表达式
        change(a,
                (String Str)->{
                      //把字符串转换为整数加10
                    return Integer.parseInt(Str)+10;
                },
                (Integer i)->{
                 return i+" ";
                });
        /*Lambda表达式的优化：参数，去掉类型与括号， 一行代码 去掉return ;  {}

         */
    }
}
