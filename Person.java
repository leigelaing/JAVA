package com.bdqn;

/*
  问题描述：定义的Person的年龄的时候，无法阻止不合理的数值被设置进来。
  解决方案：用private关键字将需要保护的成员变量进行修饰
  注意：一旦使用private进行修饰，那么本类当中任然可以随意访问。
  但是，超出本类范围就不能再直接访问了

  间接访问private修饰的成员变量，就是定义一对getter与setter方法

  必须叫setXxx或者getXxx命名规则；
  对于getter来说，不能有参数，返回值类型和成员变量对应。
  对于setter来说，不能有返回值，参数类型和成员变量对应

*/

public class Person {
    String name;
    private int age;
    public  void  show(){
        System.out.println("我叫"+name+"年龄"+age);
    }
    //本方法专门用于向age设置数据
    public void setAge(int num){
        if(num<100 && num>=10){
            age = num;
        }
        else{
            System.out.println("数据不合理");
        }

    }
    //本方法，专门私语获取age的数据
    public int getAge(){
       return age;
    }
}
