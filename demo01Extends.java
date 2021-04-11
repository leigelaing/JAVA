package com.sadff;
/*
  在继承的关系中，子类就是一个父类，也就是说，子类可以被当做父类进行看待
  例如：父类是员工，子类是讲师，那么讲师就是一个员工。  将这样的关系称为 is——a

  定义父类的格式：（就是一个普通类的定义）
  public class 父类的名称{
    //
  }
  定义子类的格式：
  public class 子类的名称 extends 父类的名称{
     //
  }
 */
public class demo01Extends {
    public static void main(String[] args) {
        //创建了一个子类对象
        Teacher tea = new Teacher();
         //调用了父类的方法
        //虽然子类当中什么都没有写，但是同样可以继承父类的方法
         tea.method();
         Assistant ass = new Assistant();
        //调用了父类的方法
        //虽然子类当中什么都没有写，但是同样可以继承父类的方法
        ass.method();

    }
}
