package com.test03;

import java.util.ArrayList;
/*
群主类
 */
public class Manager extends User {
    public Manager(){

    }
    public Manager(String name,int money){
        super(name,money);
    }
   public ArrayList<Integer> send (int totalMoney,int count){
        //首先需要一个集合，用来存储若干个红包
       ArrayList<Integer> redlist = new ArrayList<>();
       //首先看群主自己有多少钱
       int leftMoney = super.getMoney();//群主当前余额
       if(leftMoney < totalMoney){
           System.out.println("没钱发你妈的批");
           return  redlist;
       }
       //扣钱就是重新定义余额数目
       super.setMoney(leftMoney-totalMoney);
       //发的红包需要平均分为count份
       int avg = totalMoney/count;
       int mod = totalMoney%count;//无法平均分配
       //将零头放在最后一个红包中。
       //将每个红包放在集合中：
       for (int i = 0; i < count-1; i++) {
           redlist.add(avg);
       }
       //最后一个红包加零头的
       int lastred = avg + mod;
       redlist.add(lastred);
       return redlist;
   }
}

