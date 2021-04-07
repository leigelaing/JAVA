package com.wanshang;
//遍历集合代码
import java.util.ArrayList;

public class bianlijihe {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
          list.add("迪丽热巴");
          list.add("范冰冰");
          list.add("门一博");
          list.add("鞠婧祎");
          //遍历集合
        //快速生成  list.fori
        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
