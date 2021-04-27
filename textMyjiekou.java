package com.demo01;
/*
  函数式接口，有且只有一个抽象方法的接口，称之为函数式接口
  当然接口中可以有别的方法（默认方法，静态方法，私有方法）。
  如何保证一个接口中只有一个抽象方法？
  使用注解： @FunctionalInterface注解
  @FunctionalInterface注解
  作用：可以检测接口是否为一个函数式接口
    是：编译成功
    否：编译失败（接口中没有抽象方法  ，接口中抽象方法中的个数大于一个）
 */
@FunctionalInterface
public interface textMyjiekou {
    //定义一个抽象方法
    //public abstract可以省略
    public abstract void method();


}
