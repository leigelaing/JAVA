package com.demo03;

import java.util.ArrayList;
import java.util.Collections;

/*
  斗地主的综合案例：
  分为4步：
  1.准备牌
  2.洗牌
  3.发牌
  4.看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个ArrayList集合（存储54张牌） 泛型使用String
        ArrayList<String> puke = new ArrayList<>();
        //2.定义两个数组，一数组存储牌的花色，一个数组存储牌的序号
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //先把大王，小王存储到集合中
        puke.add("大王");
        puke.add("小王");
        //循环嵌套遍历两个数组，组装52张牌。
        for(String number:numbers){
            for(String color:colors){
                //把组装好的牌存储到集合中：
                puke.add(color+number);
            }
        }
        /*
        2.洗牌
          使用集合的工具类Collections中的方法；
          ststic void shuffle(list<?>list) 使用默认随机源对指定列表进行置换。
         */
        Collections.shuffle(puke);
        //System.out.println(puke);
        /*
           3.发牌
           //定义四个集合，存储玩家的牌和底牌。
         */
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        /*
         遍历puke集合，获取每一张牌
         使用puke集合的索引%3给3个玩家轮流发牌。
         剩余的3张是底牌
         注意：
           先判断底牌（i>=51），否则牌就发没了。
         */
        for (int i = 0; i < puke.size(); i++) {
            //获取每一张牌
            String s = puke.get(i);
            //轮流发牌
            if(i>=51){
               //改为底牌发牌
               dipai.add(s);
            }
            else if(i%3==0){
                list1.add(s);
            }
            else if(i%3==1){
                list2.add(s);
            }
            else if(i%3==2){
                list3.add(s);
            }
        }
        //4.看牌
        System.out.println("王李阳"+list1);
        System.out.println("门一博"+list2);
        System.out.println("雷葛亮"+list3);
        System.out.println("底牌"+dipai);

    }
}
