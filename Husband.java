package com.demo01;
/*
  通过This引用本类的成员方法

 */
public class Husband {
  //定义一个买房子的方法
  public void buyHouse(){
      System.out.println("买你妈的批");
  }
  //定义一个结婚的方法，参数传递Richable接口
    public void marry(Richable r){
      r.buy();
    }
    //定义一个非常高兴地方法
    public void soHappy(){
      //调用结婚的方法，方法的参数是一个函数接口，所以可以传递Lambda表达式
        marry(()->{
            //使用this.成员方法，调用本类买房子的方法
            this.buyHouse();
        });
        /*
        使用方法引用优化Lambda表达式
         this已经存在的
         本类的成员方法buyHouse也是已经存在的
         所以我们可以直接使用this引用本类的成员方法buyHouse()
         */
        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }
}
