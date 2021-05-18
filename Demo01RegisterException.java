package Demo01;

import java.util.Scanner;

/*
  要求：我们模拟注册操作，如果用户名存在，则抛出异常并提示，
  分析：
     1.使用数组保存已经注册过的用户名
     2.使用Scanner获取用户输入的信息
     3.

 */
public class Demo01RegisterException {
   //1. 使用数组保存已经注册过的用户名
    static String[] usernames = {"a","b","c"};

    public static void main(String[] args) throws RegisterException {
      //获取输入信息
        Scanner sc = new Scanner(System.in);
        System.out.println("赶紧写");
        String username = sc.next();
        che(username);
    }
    //3.定义方法，对用户名中的注册进行判断
    public  static void  che(String user) throws RegisterException {
        //遍历数组
        for(String a:usernames){
            if(a.equals(user)){
                //true
                throw new RegisterException("用户已经被注册");
            }
            //循环结束，没有发现异常
            System.out.println("成功");

        }

    }
}
