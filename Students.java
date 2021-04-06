package com.bdqn;
//对于基本数据类型当中的boolean类型，getter方法一定要写成isXxx的形式，而setter规则不变


public class Students {
    private String name;//姓名
    private boolean male;//性别
    public void setMale(boolean b){
        male = b;
    }
    public boolean isMale(){
        return male;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


}
